package Controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class ProductosController implements Initializable {
    
    public Stage stage;
    
    @FXML
    Button btnHome; 
    @FXML
    Button btnMenu; 
    @FXML
    Button btnSulfaferrotab; 
    @FXML
    Button btnSulfaferrojar1; 
    @FXML
    Button btnbetametasona; 
    @FXML
    Button btnEsomeprazol; 
    @FXML
    Button btnMetocarbamol; 
    @FXML
    Button btnNaproxeno; 
    @FXML
    Button btnLoratadina; 
    @FXML
    Button btnAdrenalina; 
    @FXML
    Button btnNextPage; 

    @FXML
    void HomeAction(ActionEvent event) throws IOException{

    }
    @FXML
    void MenuAction(ActionEvent event) throws IOException{

    }
    @FXML
    void SulfaferrotabAction(ActionEvent event) throws IOException{
    }
    
    @FXML
    void SulfaferrojarAction(ActionEvent event) throws IOException{

    }
    @FXML
    void BetametasonaAction(ActionEvent event) throws IOException{

    }
    @FXML
    void EsomeprazolAction(ActionEvent event) throws IOException{

    }
    @FXML
    void MetocarbamolAction(ActionEvent event) throws IOException{

    }
    @FXML
    void NaproxenoAction(ActionEvent event) throws IOException{

    }
    @FXML
    void LoratadinaAction(ActionEvent event) throws IOException{

    }
    @FXML
    void AdrenalinaAction(ActionEvent event) throws IOException{

    }
    @FXML
    public void NextPageAction(ActionEvent event) throws IOException{
    // Cargar el archivo FXML de Productos2
FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos2.fxml"));
Parent root = loader.load();
Productos2Controller controller = loader.getController();

    // Crear una nueva escena y etapa
    Scene scene = new Scene(root);
    Stage newStage = new Stage();
    newStage.setScene(scene);
    newStage.setTitle("Productos 2");
    newStage.show();

    // Cerrar la ventana actual
    stage.close();
    
    
/*
    // Cargar el FXML de la siguiente página
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos2.fxml"));
    Parent root = loader.load();
    
    Scene scene  = new Scene(root);
    Stage newStage = new Stage();
    newStage.setScene(scene);
    newStage.setTitle("Productos");
    newStage.show();
    stage.close();
    

    // Crear y mostrar nueva escena
    Scene scene = new Scene(root);
    Stage newStage = new Stage();
    newStage.setScene(scene);
    newStage.setTitle("Productos 2");
    newStage.show();

    // Cerrar la ventana actual
    Stage currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
    currentStage.close();
    */
    }

    


        @Override
        public void initialize(URL location, ResourceBundle resources) {
        }
    }
    
    
    
    

