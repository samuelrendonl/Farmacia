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
import javafx.stage.Popup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author samue
 */
public class MenuMetodoPagoController implements Initializable {

        private Popup popup; // será seteado desde fuera

    public void setPopup(Popup popup) {
        this.popup = popup;
    }

    private void cerrarPopup() {
        if (popup != null) {
            popup.hide();
        }
    }

private void cambiarVista(String fxml, String titulo, ActionEvent e) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/" + fxml));
        Parent root = loader.load();
        Stage stage = Main.getStage(); 
        stage.setTitle(titulo); // Cambia el título de la ventana
        stage.setScene(new Scene(root));
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

@FXML
public void TarjetaAction(ActionEvent event) {
    cambiarVista("Tarjeta.fxml", "Informacion Tarjeta", event);
    cerrarPopup();
}

@FXML
public void TransefrenciaAction(ActionEvent event) {
    cambiarVista("Transferencia.fxml", "Informacion Transferenica", event);
    cerrarPopup();
}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
