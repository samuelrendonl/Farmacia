package Modelo;

import Controlador.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class GestorCarrito {

    private static final ObservableList<Producto> carrito = FXCollections.observableArrayList();

    public static ObservableList<Producto> obtenerCarrito() {
        return carrito;
    }

    public static void agregarAlCarrito(Producto producto) {
        if (producto != null) {
            carrito.add(producto);
        }
    }

    public static void limpiarCarrito() {
        carrito.clear();
    }

    // ✅ Nuevo método para eliminar un producto del carrito
    public static void eliminarDelCarrito(Producto producto) {
        carrito.remove(producto);
    }
}
