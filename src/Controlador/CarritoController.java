/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.MenuGestor;
import Modelo.GestorCarrito;
import java.io.IOException;
import java.net.URL;
import java.util.Queue;
import java.util.ResourceBundle;
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

/**
 * FXML Controller class
 *
 * @author samue
 */
public class CarritoController implements Initializable {
private String nombre;
private String descripcion;
private double precio;
private String tipo;

    @FXML
    Button btnHome;
  
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
    MenuGestor.mostrarMenu();    
    }
    @FXML
    Button btnComprarC;
    @FXML
    public void ComprarCAction(ActionEvent event) throws IOException{
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/InformacionCompra.fxml"));
    Parent root = loader.load();
    Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    currentStage.setScene(new Scene(root));
    currentStage.setTitle("Informacion De Compra");    
    }
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


@Override
public void initialize(URL location, ResourceBundle resources) {
    colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
    colDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
    colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
    colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));

    tablaCarrito.getItems().setAll(GestorCarrito.obtenerCarrito());
}
}
