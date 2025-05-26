package Modelo;

import java.util.List;

public class GestorFavoritos {

    private static Cola<Producto> favoritos = new Cola<>();

    public static void agregarAFavoritos(Producto producto) {
        favoritos.encolar(producto);
    }

    // Método para eliminar el favorito más antiguo (opcional)
    public static void eliminarPrimerFavorito() {
        favoritos.desencolar();
    }

    public static void limpiarFavoritos() {
        favoritos = new Cola<>();
    }

    public static List<Producto> obtenerFavoritos() {
        return favoritos.toList();
    }
public static void eliminarFavorito(Producto producto) {
    List<Producto> lista = favoritos.toList();
    lista.removeIf(p -> p.equals(producto));
    favoritos = new Cola<>();  // Aquí mantén Cola, no ListaDoble
    for (Producto p : lista) {
        favoritos.encolar(p);
    }
}

}
