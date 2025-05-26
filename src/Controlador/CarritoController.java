/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.BusquedaGlobal;
import Modelo.Producto;
import Modelo.MenuGestor;
import Modelo.GestorCarrito;
import Modelo.ListaDoble;
import Modelo.ProductoRepositorio;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class CarritoController implements Initializable {

    @FXML
    private Button btnHome, btnMenu, btnComprarC, btnEliminar, btnLimpiarCarrito;

    @FXML
    private TableView<Producto> tablaCarrito;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, String> colDescripcion;

    @FXML
    private TableColumn<Producto, Double> colPrecio;

    @FXML
    private TableColumn<Producto, String> colTipo;
        @FXML
    private ComboBox<String> comboBuscar;

    private ListaDoble<Producto> listaDobleProductos = new ListaDoble<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colNombre.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("nombre"));
        colDescripcion.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("descripcion"));
        colPrecio.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("precio"));
        colTipo.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("categoria")); // o "tipo" si usas otra propiedad
        cargarDatos();

        // Cargar todos los productos
        ProductoRepositorio.obtenerProductos().forEach(listaDobleProductos::agregarAlFinal);

        // Configurar búsqueda global y redirección
        BusquedaGlobal.configurarBusquedaGlobal(comboBuscar, listaDobleProductos);
    }

    private void cargarDatos() {
        List<Producto> lista = GestorCarrito.obtenerProductos();
        ObservableList<Producto> obsLista = FXCollections.observableArrayList(lista);
        tablaCarrito.setItems(obsLista);
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

    @FXML
    private void eliminarSeleccionadoAction(ActionEvent event) {
        Producto seleccionado = tablaCarrito.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            tablaCarrito.getItems().remove(seleccionado);
            GestorCarrito.eliminarProducto(seleccionado);  // Debes implementar este método si quieres eliminar específico
        }
    }

    @FXML
    private void limpiarCarritoAction(ActionEvent event) {
        tablaCarrito.getItems().clear();
        GestorCarrito.limpiarCarrito();
    }

    @FXML
    private void ComprarCAction(ActionEvent event) {
        // Aquí implementar acción de compra desde el carrito si quieres
    }
}




