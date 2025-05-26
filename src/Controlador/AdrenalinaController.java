/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.BusquedaGlobal;
import Modelo.Producto;
import Modelo.MenuGestor;
import Modelo.GestorCarrito;
import Modelo.GestorFavoritos;
import Modelo.ListaDoble;
import Modelo.ProductoRepositorio;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author samue
 */
public class AdrenalinaController implements Initializable {

@FXML Button BtnHome, btnMenu, btnAggFavoritos, btnAggCarrito;

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

@FXML
public void AggFavoritosAction(ActionEvent event) {
    Producto producto = new Producto("Adrenalina", "Caja x25 Ampollas", 33000, "Ampolla");
    GestorFavoritos.agregarAFavoritos(producto);
    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    alerta.setTitle("Confirmación");
    alerta.setContentText("Producto agregado a favoritos");
    alerta.showAndWait();
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/ListaFavoritos.fxml"));
        Parent root = loader.load();
        Stage stage = Main.getStage();
        stage.setScene(new Scene(root));
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    @FXML
    public void AggCarritoAction(ActionEvent event) {
        Producto producto = new Producto("Adrenalina", "Caja x25 Ampollas", 33000, "Ampolla");
        GestorCarrito.agregarAlCarrito(producto);
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Confirmación");
        alerta.setContentText("Producto agregado al carrito.");
        alerta.showAndWait();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Carrito.fxml"));
            Parent root = loader.load();
            Stage stage = Main.getStage();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
       @FXML
    public void ComprarAction(ActionEvent event){
        
    }
    @FXML
    private ComboBox<String> comboBuscar;

    private ListaDoble<Producto> listaDobleProductos = new ListaDoble<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Cargar todos los productos
        ProductoRepositorio.obtenerProductos().forEach(listaDobleProductos::agregarAlFinal);

        // Configurar búsqueda global y redirección
        BusquedaGlobal.configurarBusquedaGlobal(comboBuscar, listaDobleProductos);
    }
}
