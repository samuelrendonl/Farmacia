package Modelo;

import java.util.List;

public class GestorFavoritos {

    private static ListaSimple<Producto> favoritos = new ListaSimple<>();

    public static void agregarAFavoritos(Producto producto) {
        if (!favoritos.contiene(producto)) {
            favoritos.agregar(producto);
        }
    }

    public static void eliminarFavorito(Producto producto) {
        favoritos.eliminar(producto);
    }

    public static void limpiarFavoritos() {
        favoritos = new ListaSimple<>();
    }

    public static List<Producto> obtenerFavoritos() {
        return favoritos.toList();
    }
}