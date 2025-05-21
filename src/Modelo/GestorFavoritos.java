/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Producto;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author samue
 */
public class GestorFavoritos {
    private static final List<Producto> favoritos = new LinkedList<>();

    public static void agregarAFavoritos(Producto producto) {
        if (!favoritos.contains(producto)) {
            favoritos.add(producto);
        }
    }

    public static void eliminarFavorito(Producto producto) {
        favoritos.remove(producto);
    }

    public static List<Producto> obtenerFavoritos() {
        return favoritos;
    }

    public static void limpiarFavoritos() {
        favoritos.clear();
    }   
}
