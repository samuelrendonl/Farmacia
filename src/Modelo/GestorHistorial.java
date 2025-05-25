/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;

public class GestorHistorial {

    private static ListaSimple<Producto> historial = new ListaSimple<>();

    // Agrega una compra al historial
    public static void agregarAlHistorial(Producto producto) {
        historial.agregar(producto);
    }

    // No suele eliminarse historial, pero puedes agregar si quieres
    public static void limpiarHistorial() {
        historial = new ListaSimple<>();
    }

    public static List<Producto> obtenerHistorial() {
        return historial.toList();
    }
}
