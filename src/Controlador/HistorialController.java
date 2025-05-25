package Controlador;

import Modelo.Producto;
import Modelo.MenuGestor;
import Modelo.GestorHistorial;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
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
import javafx.stage.Stage;

public class HistorialController implements Initializable {

    @FXML
    private Button btnHome, btnMenu;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colNombre.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("nombre"));
        colDescripcion.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("descripcion"));
        colPrecio.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("precio"));
        colcategoria.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("categoria"));

        cargarDatos();
    }

    private void cargarDatos() {
        List<Producto> lista = GestorHistorial.obtenerHistorial();
        ObservableList<Producto> obsLista = FXCollections.observableArrayList(lista);
        tablaResumen.setItems(obsLista);
    }

    @FXML
    private void HomeAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos.fxml"));
        Parent root = loader.load();
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Productos");
    }

    @FXML
    private void MenuAction(ActionEvent event) {
        MenuGestor.mostrarMenu();
    }
}