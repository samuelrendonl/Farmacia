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
       public  void HomeAction(ActionEvent event) throws IOException{

    }
    @FXML
       public  void MenuAction(ActionEvent event) throws IOException{
    }
    @FXML
    public void SulfaferrotabAction(ActionEvent event) throws IOException{
    }
    
    @FXML
       public  void SulfaferrojarAction(ActionEvent event) throws IOException{
   
       }
    @FXML
       public  void BetametasonaAction(ActionEvent event) throws IOException{
  

    }
    @FXML
        public void EsomeprazolAction(ActionEvent event) throws IOException{


    }
    @FXML
        public void MetocarbamolAction(ActionEvent event) throws IOException{

    }
    @FXML
       public  void NaproxenoAction(ActionEvent event) throws IOException{


    }
    @FXML
    public void LoratadinaAction(ActionEvent event) throws IOException{


    }
    @FXML
    public void AdrenalinaAction(ActionEvent event) throws IOException{

    }
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
    
    
    
    

