/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author samue
 */
public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;

    private static class Nodo<T> {
        T valor;
        Nodo<T> siguiente;

        Nodo(T valor) {
            this.valor = valor;
        }
    }

    public void encolar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (fin != null) {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        if (frente == null) {
            frente = fin;
        }
    }

    public T desencolar() {
        if (frente == null) return null;
        T valor = frente.valor;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return valor;
    }

    public boolean estaVacia() {
        return frente == null;
    }
}