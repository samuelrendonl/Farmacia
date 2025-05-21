/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Popup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author samue
 */
public class MenuController implements Initializable {

 @FXML
 Button btnFavoritos;
 @FXML
 public void FavoritosAction(ActionEvent event){
     
 }
 
 @FXML
 Button btnCarrito;
  @FXML
 public void CarritoAction(ActionEvent event){
     
 }
 
 @FXML
 Button btnHistorial;
  @FXML
 public void HistorialAction(ActionEvent event){
     
 }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Aquí solo iría lógica de inicialización general, si la hay
    }

    public void mostrarMenu(Stage stage) {
    }


   
}
