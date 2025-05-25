/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author samue
 */
public class ListaSimple<T> {

    // Nodo interno privado
    private static class Nodo<T> {
        T valor;
        Nodo<T> siguiente;

        Nodo(T valor) {
            this.valor = valor;
        }
    }

    private Nodo<T> cabeza;

    // Agrega al final
    public void agregar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Elimina el primer nodo que coincida con valor
    public void eliminar(T valor) {
        if (cabeza == null) return;

        if (cabeza.valor.equals(valor)) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo<T> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.valor.equals(valor)) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }

    // Retorna true si la lista contiene el valor
    public boolean contiene(T valor) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.valor.equals(valor)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

 
    public java.util.List<T> toList() {
        java.util.List<T> lista = new java.util.ArrayList<>();
        Nodo<T> actual = cabeza;
        while (actual != null) {
            lista.add(actual.valor);
            actual = actual.siguiente;
        }
        return lista;
    }

    
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = cabeza;
        while (actual != null) {
            sb.append(actual.valor).append(" -> ");
            actual = actual.siguiente;
        }
        sb.append("null");
        return sb.toString();
    }
}