/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author samue
 */
public class GestorDeListas<T> {
    private ListaSimple<T> listaSimple = new ListaSimple<>();
    private ListaDoble<T> listaDoble = new ListaDoble<>();

    // Métodos de acceso
    public void agregarAListaSimple(T valor) {
        listaSimple.agregar(valor);
    }

    public void agregarAListaDoble(T valor) {
        listaDoble.agregarAlFinal(valor);
     }

    public String imprimirListaSimple() {
        return listaSimple.imprimir();
    }

    public String imprimirListaDoble() {
        return listaDoble.imprimirDesdeInicio();
    }
}

