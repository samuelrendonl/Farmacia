package Modelo;

import Controlador.Producto;
import java.util.LinkedList;
import java.util.Queue;

public class GestorCarrito {
    private static final Queue<Producto> carrito = new LinkedList<>();

    public static void agregarAlCarrito(Producto producto) {
        carrito.offer(producto); // FIFO
    }

    public static Queue<Producto> obtenerCarrito() {
        return carrito;
    }
}