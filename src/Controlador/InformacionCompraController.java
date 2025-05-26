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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author samue
 */
public class InformacionCompraController implements Initializable {

@FXML
Button BtnHome;

@FXML
public void HomeAction(ActionEvent event) throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos2.fxml"));
    Parent root = loader.load();
    Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    currentStage.setScene(new Scene(root));
    currentStage.setTitle("Productos 2");   
}

@FXML
Button btnMenu;

@FXML
public void MenuAction(ActionEvent event){
    MenuGestor.mostrarMenu();    
}
@FXML
Button btnContinuarCompra;

@FXML
public void ContinuarCompraAction(ActionEvent event) {
    if (txtnombre.getText().isEmpty()) {
        mostrarAlerta("Por favor ingresa el nombre.");
        txtnombre.requestFocus();
        return;
    }

    if (txtid.getText().isEmpty()) {
        mostrarAlerta("Por favor ingresa el número de identificación.");
        txtid.requestFocus();
        return;
    }

    if (txtcalle.getText().isEmpty()) {
        mostrarAlerta("Por favor ingresa la calle.");
        txtcalle.requestFocus();
        return;
    }

    if (txtCiudad.getText().isEmpty()) {
        mostrarAlerta("Por favor ingresa la ciudad.");
        txtCiudad.requestFocus();
        return;
    }

    if (txtDepartamento.getText().isEmpty()) {
        mostrarAlerta("Por favor ingresa el departamento.");
        txtDepartamento.requestFocus();
        return;
    }

    if (txtCP.getText().isEmpty()) {
        mostrarAlerta("Por favor ingresa el código postal.");
        txtCP.requestFocus();
        return;
    }

    // Si todos los campos están llenos
    MenuGestor.mostrarMenu2();
}

private void mostrarAlerta(String mensaje) {
    Alert alerta = new Alert(Alert.AlertType.WARNING);
    alerta.setTitle("Campo vacío");
    alerta.setContentText(mensaje);
    alerta.showAndWait();   
}

@FXML
TextField txtnombre;

@FXML
TextField txtid;

@FXML
TextField txtcalle;

@FXML
TextField txtCiudad;

@FXML
TextField txtDepartamento;

@FXML
TextField txtCP;


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
