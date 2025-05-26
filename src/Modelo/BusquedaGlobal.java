package Modelo;

import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class BusquedaGlobal {

    public static void configurarBusquedaGlobal(
            ComboBox<String> comboBuscar,
            ListaDoble<Producto> listaDobleProductos) {

        // Obtener lista completa de nombres de productos
        List<String> nombres = listaDobleProductos.toList()
                .stream()
                .map(Producto::getNombre)
                .collect(Collectors.toList());

        comboBuscar.getItems().setAll(nombres);
        comboBuscar.setEditable(true);

        // Filtrar a medida que el usuario escribe
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

        // Acción al seleccionar un producto
        comboBuscar.setOnAction(event -> {
            String seleccionado = comboBuscar.getSelectionModel().getSelectedItem();
            System.out.println("Seleccionado: " + seleccionado);
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
            } else {
                System.out.println("No existe ruta para: " + seleccionado);
            }
        });
    }
}
