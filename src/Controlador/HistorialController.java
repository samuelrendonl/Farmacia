package Controlador;

import Modelo.GestorCarrito;
import Modelo.GestorHistorial;
import Modelo.MenuGestor;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class HistorialController implements Initializable {

    @FXML
    private TableView<Producto> tablaResumen;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, String> colDescripcion;

    @FXML
    private TableColumn<Producto, Double> colPrecio;

    @FXML
    private TableColumn<Producto, String> colcategoria;

    @FXML
    private Button BtnHome;

    @FXML
    private Button btnMenu;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tablaResumen.setItems(GestorHistorial.obtenerHistorial());

        // Asegurarse de enlazar las columnas con las propiedades del Producto
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        colcategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        tablaResumen.setItems(GestorHistorial.obtenerHistorial());
    }

    public void agregarProductosAlHistorial(ObservableList<Producto> productos) {
        if (tablaResumen != null && productos != null) {
            tablaResumen.getItems().addAll(productos);
        }
    }

    @FXML
    public void HomeAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Productos");
    }

    @FXML
    public void MenuAction(ActionEvent event) {
        MenuGestor.mostrarMenu();
    }
}
   
    
