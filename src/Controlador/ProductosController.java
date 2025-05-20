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
    
    public Stage stage ;
    
    @FXML
    Button btnHome;
       @FXML
       public  void HomeAction(ActionEvent event) throws IOException{

    }
    @FXML
    Button btnMenu; 
       @FXML
       public  void MenuAction(ActionEvent event) throws IOException{
    }
    @FXML
    Button btnSulfaferrotab;
       @FXML
    public void SulfaferrotabAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Sulfatoferroso.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Sulfato Ferroso Tableta");
    }
    @FXML
    Button btnSulfaferrojar;
        @FXML
       public  void SulfaferrojarAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Sulfatoferrosojar.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Sulfato Ferroso Jarabe");
   
       }
    @FXML
    Button btnbetametasona; 
        @FXML
       public  void BetametasonaAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Betametasona.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Betametasona Crema 0.05%");
  

    }
    @FXML
    Button btnEsomeprazol; 
        @FXML
        public void EsomeprazolAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Esomeprazol.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Esomeprazol Tableta 40mg ");


    }
    @FXML
    Button btnMetocarbamol; 
        @FXML
        public void MetocarbamolAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Metocarbamol 750mg Tableta");

    }
    @FXML
    Button btnNaproxeno; 
        @FXML
       public  void NaproxenoAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Naproxeno 500mg Tableta");


    }
    @FXML
    Button btnLoratadina; 
        @FXML
    public void LoratadinaAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Loratadina Jarabe");


    }
    @FXML
    Button btnAdrenalina;
    
    @FXML
    public void AdrenalinaAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/.fxml"));
        Parent root = loader.load();

        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.setTitle("Adrenalina Ampolla");
    }
    @FXML
    Button btnNextPage; 
    
    @FXML
    public void NextPageAction(ActionEvent event) throws IOException{
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos2.fxml"));
    Parent root = loader.load();
    Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    currentStage.setScene(new Scene(root));
    currentStage.setTitle("Productos 2");
  
    }
    

    


        @Override
        public void initialize(URL location, ResourceBundle resources) {
        }
        

        
    }
    
    
    
    

