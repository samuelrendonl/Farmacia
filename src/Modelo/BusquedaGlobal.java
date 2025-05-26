package Modelo;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class BusquedaGlobal {

    public static void configurarBusquedaGlobal(
        ComboBox<String> comboBuscar,
        ListaDoble<Producto> listaDobleProductos
    ) {
        List<String> nombres = listaDobleProductos.toList()
            .stream()
            .map(Producto::getNombre)
            .collect(Collectors.toList());

        comboBuscar.getItems().setAll(nombres);
        comboBuscar.setEditable(true);

        comboBuscar.getEditor().textProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal == null || newVal.isEmpty()) {
                comboBuscar.getItems().setAll(nombres);
            } else {
                List<String> filtrados = listaDobleProductos.buscarPorNombreParcial(newVal)
                    .stream()
                    .map(Producto::getNombre)
                    .collect(Collectors.toList());
                comboBuscar.getItems().setAll(filtrados);
            }
            comboBuscar.show();
        });

        comboBuscar.setOnAction(event -> {
            String seleccionado = comboBuscar.getSelectionModel().getSelectedItem();
            if (seleccionado != null && MapaProductoAVista.contieneProducto(seleccionado)) {
                try {
                    String ruta = MapaProductoAVista.obtenerRutaVista(seleccionado);
                    FXMLLoader loader = new FXMLLoader(BusquedaGlobal.class.getResource(ruta));
                    Parent root = loader.load();
                    Stage stage = (Stage) comboBuscar.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.setTitle(seleccionado);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
