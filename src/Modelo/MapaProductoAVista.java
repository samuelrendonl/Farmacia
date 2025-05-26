package Modelo;

import java.util.HashMap;
import java.util.Map;

public class MapaProductoAVista {

    private static final Map<String, String> mapa = new HashMap<>();

    static {
        mapa.put("Sulfato Ferroso 200mg", "/Vista/Sulfatoferroso.fxml");
        mapa.put("Sulfato Ferroso Jarabe", "/Vista/Sulfatoferrosojar.fxml");
        mapa.put("Betametasona Crema al 0.05%", "/Vista/Betametasona.fxml");
        mapa.put("Esomeprazol 40mg", "/Vista/Esomeprazol.fxml");
        mapa.put("Metocarbamol 750mg", "/Vista/Metocarbamol.fxml");
        mapa.put("Naproxeno 500mg", "/Vista/Naproxeno.fxml");
        mapa.put("Loratadina", "/Vista/Loratadina.fxml");
        mapa.put("Adrenalina", "/Vista/Adrenalina.fxml");
        mapa.put("Acetaminofén 500 mg", "/Vista/Acetaminofen.fxml");
        mapa.put("Acetaminofén 150mg", "/Vista/AcetaminofenJar.fxml");
        mapa.put("Hioscina 10mg", "/Vista/Hioscina.fxml");
        mapa.put("Diclofenaco Gel al 1%", "/Vista/Diclofenaco.fxml");
        mapa.put("Vita E", "/Vista/VitaE.fxml");
        mapa.put("Vita C", "/Vista/VitaC.fxml");
        mapa.put("Ibuprofeno 800mg", "/Vista/Ibuprofeno.fxml");
        mapa.put("Clotrimazol Crema", "/Vista/Clotrimazol.fxml");
    }

    // Método para obtener la ruta del archivo FXML a partir del nombre del producto
    public static String obtenerRutaVista(String nombreProducto) {
        return mapa.get(nombreProducto);
    }

    // Método para verificar si existe una ruta para un producto
    public static boolean contieneProducto(String nombreProducto) {
        return mapa.containsKey(nombreProducto);
    }
}
