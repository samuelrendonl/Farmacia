/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.BusquedaGlobal;
import Modelo.ListaDoble;
import Modelo.MenuGestor;
import Modelo.Producto;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author samue
 */
public class Productos2Controller implements Initializable {
  
    
    public Stage stage;
    
    
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
    Button btnAcetaminofen;
    @FXML
    public void AcetaminofenAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Acetaminofen.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Acetaminofen");
        
    }
    @FXML
    Button btnAcetaminofenjar;
    @FXML
    public void AcetaminofenjarAction(ActionEvent event) throws IOException{
       FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/AcetaminofenJar.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
                currentStage.setTitle("Acetaminofen Jarabe");
        
    }
    @FXML
    Button btnBuscapina;
    @FXML
    public void BuscapinaAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Hioscina.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Hioscina");

        
    }
    @FXML
    Button btnDiclofenaco;
    @FXML
    public void DiclofenacoAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Diclofenaco.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
       currentStage.setTitle("Diclofenaco");
     
    }
    @FXML
    Button btnVitaE;
    @FXML
    public void VitaeAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/VitaE.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
                        currentStage.setTitle("VitaE");

        
    }
    @FXML
    Button btnVitaC;
    @FXML
    public void VitacAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/VitaC.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
                        currentStage.setTitle("VItaC");

        
    }
    @FXML
    Button btnIbuprofeno;
    @FXML
    public void IbuprofenoAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Ibuprofeno.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
                        currentStage.setTitle("Ibuprofeno");

        
    }
    @FXML
    Button btnClotrimazol;
    @FXML
    public void ClotrimazolAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Clotrimazol.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
                        currentStage.setTitle("Clotrimazol");

    }
    @FXML
    Button btnPreviousPage;
    
    @FXML
    public void PreviousPageAction(ActionEvent event) throws IOException{
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos.fxml"));
    Parent root = loader.load();

    Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

    currentStage.setScene(new Scene(root));
                    currentStage.setTitle("Productos");

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
