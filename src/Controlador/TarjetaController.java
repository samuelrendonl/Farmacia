/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.GestorCarrito;
import Modelo.GestorHistorial;
import Modelo.MenuGestor;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author samue
 */
public class TarjetaController implements Initializable {
@FXML
TextField txtidTarjeta;
@FXML
TextField txtNombre;
@FXML
TextField txtcvv;
@FXML
TextField txtId;
@FXML
DatePicker DateVencimiento;
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
Button btnPago;


@FXML
public void PagoAction(ActionEvent event) {
    if (txtidTarjeta.getText().isEmpty()) {
        mostrarAlerta("Por favor ingresa el número de tarjeta.");
        txtidTarjeta.requestFocus();
        return;
    }

    if (txtNombre.getText().isEmpty()) {
        mostrarAlerta("Por favor ingresa el nombre del titular.");
        txtNombre.requestFocus();
        return;
    }

    if (txtcvv.getText().isEmpty()) {
        mostrarAlerta("Por favor ingresa el código CVV.");
        txtcvv.requestFocus();
        return;
    }

    if (txtId.getText().isEmpty()) {
        mostrarAlerta("Por favor ingresa tu identificación.");
        txtId.requestFocus();
        return;
    }

    if (DateVencimiento.getValue() == null) {
        mostrarAlerta("Por favor selecciona la fecha de vencimiento.");
        DateVencimiento.requestFocus();
        return;
    }

    Alert confirmacion = new Alert(Alert.AlertType.INFORMATION);
    confirmacion.setTitle("Pago exitoso");
    confirmacion.setHeaderText("¡Gracias por tu compra!");
    confirmacion.setContentText("Su pago ha sido exitoso y su pedido está en camino.");
    confirmacion.showAndWait();

    try {
        // Paso para agregar al historial
        ObservableList<Producto> productosCarrito = FXCollections.observableArrayList(GestorCarrito.obtenerCarrito());
        GestorHistorial.agregarListaAlHistorial(productosCarrito);
        GestorCarrito.limpiarCarrito();

        // Cargar vista de historial
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Historial.fxml"));
        Parent root = loader.load();
        Stage stage = Main.getStage();
        stage.setScene(new Scene(root));

    } catch (IOException e) {
        e.printStackTrace();
    }
}

public void mostrarAlerta(String mensaje) {
    Alert alerta = new Alert(Alert.AlertType.WARNING);
    alerta.setTitle("Campo obligatorio");
    alerta.setContentText(mensaje);
    alerta.showAndWait();
}   

@Override
public void initialize(URL url, ResourceBundle rb) {
    // Configuración inicial, si tenés algo. Si no, dejalo vacío.
}
    }


 
    

