/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.BusquedaGlobal;
import Modelo.Producto;
import Modelo.MenuGestor;
import Modelo.GestorFavoritos;
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

public class ListaFavoritosController implements Initializable {

    @FXML
    private Button btnHome, btnMenu;

    @FXML
    private TableView<Producto> tablaFavoritos;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, String> colDescripcion;

    @FXML
    private TableColumn<Producto, Double> colPrecio;

    @FXML
    private TableColumn<Producto, String> colCategoria;

    @FXML
    private Button btnEliminarFavorito;

    @FXML
    private Button btnLimpiarFavoritos;

                @FXML
    private ComboBox<String> comboBuscar;

    private ListaDoble<Producto> listaDobleProductos = new ListaDoble<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colNombre.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("nombre"));
        colDescripcion.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("descripcion"));
        colPrecio.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("precio"));
        colCategoria.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("categoria"));

        cargarDatos();
                // Cargar todos los productos
        ProductoRepositorio.obtenerProductos().forEach(listaDobleProductos::agregarAlFinal);

        // Configurar búsqueda global y redirección
        BusquedaGlobal.configurarBusquedaGlobal(comboBuscar, listaDobleProductos);

        
        
    }

    private void cargarDatos() {
        List<Producto> lista = GestorFavoritos.obtenerFavoritos();
        ObservableList<Producto> obsLista = FXCollections.observableArrayList(lista);
        tablaFavoritos.setItems(obsLista);
    }

    @FXML
    private void HomeAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos.fxml"));
        Parent root = loader.load();
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
    }

    @FXML
    private void MenuAction(ActionEvent event) {
        MenuGestor.mostrarMenu();
    }

public void eliminarFavoritoSeleccionadoAction(ActionEvent event) {
    Producto seleccionado = tablaFavoritos.getSelectionModel().getSelectedItem();
    if (seleccionado != null) {
        tablaFavoritos.getItems().remove(seleccionado);
        GestorFavoritos.eliminarFavorito(seleccionado);
    }
}

    @FXML
    private void limpiarFavoritosAction(ActionEvent event) {
        tablaFavoritos.getItems().clear();
        GestorFavoritos.limpiarFavoritos();
    }
}
