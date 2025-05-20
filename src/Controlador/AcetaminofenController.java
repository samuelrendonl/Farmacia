/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author samue
 */
public class AcetaminofenController implements Initializable {

@FXML
Button BtnHome;

@FXML
public void HomeAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Productos");    
}

@FXML
Button btnMenu;

@FXML
public void MenuAction(ActionEvent event){
    
}
@FXML
Button btnAggFavoritos;

@FXML
public void AggFavoritosAction(ActionEvent event){
    
}
@FXML
Button btnAggCarrito;

@FXML
public void AggCarritoAction(ActionEvent event){
    
}
@FXML
Button btnComprar;

@FXML
public void ComprarAction(ActionEvent event){
    
}
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
