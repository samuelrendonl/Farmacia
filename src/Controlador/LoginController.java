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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;
import Modelo.UsuarioCreado;
import java.util.ArrayList;
import java.util.List;


public class LoginController implements Initializable {

    public Stage stage ;
    private List<UsuarioCreado> usuariosRegistrados = new ArrayList<>();
    
    @FXML
    PasswordField txtContraseña;
    
    @FXML
    TextField txtUsuario;
    
    @FXML
    Button btnLogin;
    
    @FXML
   public void LoginAction(ActionEvent event) throws IOException{

String usuarioIngresado = txtUsuario.getText();
    String contraseñaIngresada = txtContraseña.getText();


    // Validacion de los campos 
    if (usuarioIngresado.isEmpty() && contraseñaIngresada.isEmpty()) {
        mostrarError("Los campos de usuario y contraseña no pueden estar vacíos. ");
        return;
            // Validación de campo de usuario
    } else if (usuarioIngresado.isEmpty()) {
        mostrarError("El campo de usuario está vacío. Ingresa tu nombre de usuario.");
        txtUsuario.requestFocus();
        return;
        // Validación de campo de Contraseña
    } else if (contraseñaIngresada.isEmpty()) {
        mostrarError("El campo de contraseña está vacío. Ingresa tu contraseña.");
        txtContraseña.requestFocus();
        return;
    }

    boolean credencialesValidas = usuariosRegistrados.stream().anyMatch(u ->
        u.getNombre().equals(usuarioIngresado) &&
        u.getContraseña().equals(contraseñaIngresada)
    );

    if (credencialesValidas) {
        // Acceso correcto, cambiar escena
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Productos");
    } else {
        //Credenciales no validas 
        mostrarError("Usuario o contraseña incorrectos. Inténtalo de nuevo.");
        txtUsuario.requestFocus();
    }
 
    }
private void mostrarError(String mensaje) {
    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
    alert.setTitle("Error de inicio de sesión");
    alert.setHeaderText(null);
    alert.setContentText(mensaje);
    alert.showAndWait();
}   
    



    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          // Registro de usuarios válidos
    usuariosRegistrados.add(new UsuarioCreado("samuel.rendonl", "rendonlsamuel"));
    usuariosRegistrados.add(new UsuarioCreado("johan.castroa", "castroajohan"));
    usuariosRegistrados.add(new UsuarioCreado("samuel.calderon", "calderonsamuel"));  
       
          
          
    }    
    


    public void setStage(Stage primaryStage) {
        stage = primaryStage;
    }
    
}
