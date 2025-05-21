/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author samue
 */
public class CarritoController implements Initializable {


    @FXML
    Button btnHome;
    @FXML
    public void HomeAction(ActionEvent event){
        
    }
    @FXML
    Button btnMenu;
    @FXML
    public void MenuAction(ActionEvent event){
    MenuGestor.mostrarMenu();    
    }
    @FXML
    Button btnComprarC;
    @FXML
    public void ComprarCAction(ActionEvent event){
        
    }
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
