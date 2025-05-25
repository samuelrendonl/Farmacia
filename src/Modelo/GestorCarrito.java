package Modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorCarrito {

    private static Pila<Producto> carrito = new Pila<>();

    public static void agregarAlCarrito(Producto producto) {
        carrito.apilar(producto);
    }

    // Para eliminar un producto arbitrario, convertimos la pila a lista y reconstruimos la pila sin ese producto
    public static void eliminarProducto(Producto producto) {
        List<Producto> lista = carrito.toList();
        lista.removeIf(p -> p.equals(producto));
        carrito = new Pila<>();
        // Reconstruir pila (apilando en orden inverso para mantener orden)
        for (int i = lista.size() -1; i >=0; i--) {
            carrito.apilar(lista.get(i));
        }
    }

    public static void limpiarCarrito() {
        carrito = new Pila<>();
    }

    public static List<Producto> obtenerProductos() {
        return carrito.toList();
    }
}
