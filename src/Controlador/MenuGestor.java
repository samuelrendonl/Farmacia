package Controlador;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.io.IOException;

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
            double x = stage.getX() + stage.getWidth() - 280;
            double y = stage.getY() + 40;

            popup.show(stage, x, y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
