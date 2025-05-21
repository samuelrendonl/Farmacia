/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Popup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author samue
 */
public class MenuController implements Initializable {

        private Popup popup; // será seteado desde fuera

    public void setPopup(Popup popup) {
        this.popup = popup;
    }

    private void cerrarPopup() {
        if (popup != null) {
            popup.hide();
        }
    }

    private void cambiarVista(String fxml, ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/" + fxml));
            Parent root = loader.load();
            Stage stage = Main.getStage();
            stage.setScene(new Scene(root));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void FavoritosAction(ActionEvent event) {
        cambiarVista("ListaFavoritos.fxml", event);
        cerrarPopup();
    }

    @FXML
    public void CarritoAction(ActionEvent event) {
        cambiarVista("Carrito.fxml", event);
        cerrarPopup();
    }

    @FXML
    public void HistorialAction(ActionEvent event) {
        cambiarVista("Historial.fxml", event);
        cerrarPopup();
    }


    

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

}



    public void mostrarMenu(Stage stage) {
    }
}

   

