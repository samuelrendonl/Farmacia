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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author samue
 */
public class TransferenciaController implements Initializable {

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
    // Obtener los productos del carrito
    ObservableList<Producto> productosCarrito = FXCollections.observableArrayList(GestorCarrito.obtenerCarrito());

    // Agregar al historial y limpiar carrito (Paso 2)
    GestorHistorial.agregarListaAlHistorial(productosCarrito);
    GestorCarrito.limpiarCarrito();

    // Mostrar mensaje de confirmación
    Alert confirmacion = new Alert(Alert.AlertType.INFORMATION);
    confirmacion.setTitle("Confirmación de transferencia");
    confirmacion.setHeaderText("¡Gracias por tu compra!");
    confirmacion.setContentText(
        "Por favor, envía la captura de la transferencia bancaria " +
        "al número telefónico +57 310 8941198.\n" +
        "Confirmaremos tu pago para proceder con la entrega.");
    confirmacion.showAndWait();

    // Cargar la vista de historial
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Historial.fxml"));
        Parent root = loader.load();

        // Cambiar de escena
        Stage stage = Main.getStage(); // o ((Node)event.getSource()).getScene().getWindow()
        stage.setScene(new Scene(root));

    } catch (IOException e) {
        e.printStackTrace();
    }

}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
