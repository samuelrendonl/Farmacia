package Controlador;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.layout.Region;

public class MenuGestor {

    private static Popup popup;

    public static void mostrarMenu() {
        try {
            FXMLLoader loader = new FXMLLoader(MenuGestor.class.getResource("/Vista/Menu.fxml"));
            Parent menuRoot = loader.load();

            popup = new Popup();
            popup.setAutoHide(true);
            popup.getContent().add(menuRoot);

            Stage stage = Main.getStage();
            double x = stage.getX() + stage.getWidth() - 353;
            double y = stage.getY() + 115;

            popup.show(stage, x, y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void mostrarMenu2() {
        try {
            FXMLLoader loader = new FXMLLoader(MenuGestor.class.getResource("/Vista/MenuMetodoPago.fxml"));
            Parent menuRoot = loader.load();

            popup = new Popup();
            popup.setAutoHide(true);
            popup.getContent().add(menuRoot);

            Stage stage = Main.getStage();
            double x = stage.getX() + stage.getWidth() - 800;
            double y = stage.getY() + 270;

            popup.show(stage, x, y);
        } catch (IOException e) {
            e.printStackTrace();
        }

}
        
}
