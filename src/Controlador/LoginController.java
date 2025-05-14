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



public class LoginController implements Initializable {

    public Stage stage ;
    
    @FXML
    PasswordField txtContraseña;
    
    @FXML
    TextField txtUsuario;
    
    @FXML
    Button btnLogin;
    
    @FXML
   public void LoginAction(ActionEvent event) throws IOException{
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos.fxml"));
    Parent root = loader.load();
    ProductosController controller = loader.getController();

    Scene scene  = new Scene(root);
    Stage newStage = new Stage();
    newStage.setScene(scene);
    newStage.setTitle("Productos");
    newStage.show();
    stage.close();
            
    }
    


    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void setStage(Stage primaryStage) {
        stage = primaryStage;
    }
    
}
