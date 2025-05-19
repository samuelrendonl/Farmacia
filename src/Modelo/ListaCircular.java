/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author samue
 */
public class ListaCircular<T> {

    private static class Nodo<T> {

        T valor;
        Nodo<T> siguiente;

        Nodo(T valor) {
            this.valor = valor;
        }
    }

    private Nodo<T> cabeza = null;
    private Nodo<T> cola = null;

    public void agregar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        }
    }

    public String imprimir() {
        if (cabeza == null) {
            return "Lista vacía";
        }
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = cabeza;
        do {
            sb.append(actual.valor).append(" -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        sb.append("(inicio)");
        return sb.toString();
    }
}
