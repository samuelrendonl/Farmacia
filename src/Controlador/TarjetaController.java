/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;


import Modelo.BusquedaGlobal;
import Modelo.Producto;
import Modelo.GestorCarrito;
import Modelo.GestorHistorial;
import Modelo.ListaDoble;
import Modelo.MenuGestor;
import Modelo.ProductoRepositorio;
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

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;

import javafx.scene.Parent;

import javafx.scene.Parent;

import javafx.scene.Parent;
import javafx.scene.control.ComboBox;

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
    Button btnMenu;
    @FXML
    Button btnPago;

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

        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Pago confirmado");
        alerta.setContentText("Compra completada exitosamente y producto agregado al historial.");
        alerta.showAndWait();

        try {
            // Obtener productos del carrito
            ObservableList<Producto> productosCarrito = FXCollections.observableArrayList(GestorCarrito.obtenerProductos());

            // Agregar cada producto al historial
            for (Producto p : productosCarrito) {
                GestorHistorial.agregarAlHistorial(p);
            }

            // Limpiar el carrito
            GestorCarrito.limpiarCarrito();

            // Cargar vista de historial
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Historial.fxml"));
            Parent root = loader.load();
            Stage stage = Main.getStage();
            stage.setScene(new Scene(root));
            stage.setTitle("Historial");
           

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

 
    

