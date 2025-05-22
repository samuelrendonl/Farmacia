/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author samue
 */
public class GestorHistorial {
    private static ObservableList<Producto> historial = FXCollections.observableArrayList();

    public static void agregarListaAlHistorial(ObservableList<Producto> productos) {
        if (productos != null && !productos.isEmpty()) {
            historial.addAll(productos);
        }
    }

    public static ObservableList<Producto> obtenerHistorial() {
        return historial;
    }
}
