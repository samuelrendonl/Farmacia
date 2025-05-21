package Controlador;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    
private static Stage primaryStage;
@Override
public void start(Stage stage) throws IOException {
    primaryStage = stage;
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Login.fxml"));
    Parent root = loader.load();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("CCR Farmacéutica");
    stage.show();
}

public static Stage getStage() {
    return primaryStage;
}
    
    
   

   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
