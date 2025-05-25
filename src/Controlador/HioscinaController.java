/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import Modelo.MenuGestor;
import Modelo.GestorCarrito;
import Modelo.GestorFavoritos;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author samue
 */
public class HioscinaController implements Initializable {


@FXML Button BtnHome, btnMenu, btnAggFavoritos, btnAggCarrito;

    @FXML
    public void HomeAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos2.fxml"));
        Parent root = loader.load();
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Productos 2");
    }

    @FXML
    public void MenuAction(ActionEvent event) {
        MenuGestor.mostrarMenu();
    }

    @FXML
    public void AggFavoritosAction(ActionEvent event) {
        Producto producto = new Producto("Hioscina 10mg", "Caja x20 Tabletas Buscapina 10mg", 5_000, "Tableta");
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
        Producto producto = new Producto("Hioscina 10mg", "Caja x20 Tabletas Buscapina 10mg", 5_000, "Tableta");
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {}
}
