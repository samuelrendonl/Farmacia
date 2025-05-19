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
    private ListaCircular<T> listaCircular = new ListaCircular<>();
    private ListaDoble<T> listaDoble = new ListaDoble<>();

    // Métodos de acceso
    public void agregarAListaSimple(T valor) {
        listaSimple.agregar(valor);
    }

    public void agregarAListaCircular(T valor) {
        listaCircular.agregar(valor);
    }

    public void agregarAListaDoble(T valor) {
        listaDoble.agregar(valor);
    }

    public String imprimirListaSimple() {
        return listaSimple.imprimir();
    }

    public String imprimirListaCircular() {
        return listaCircular.imprimir();
    }

    public String imprimirListaDoble() {
        return listaDoble.imprimirDesdeInicio();
    }
}

