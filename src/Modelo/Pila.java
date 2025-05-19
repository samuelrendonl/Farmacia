/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author samue
 */
import java.util.EmptyStackException;

public class Pila<T> {
    private Nodo<T> cima;

    private static class Nodo<T> {
        T valor;
        Nodo<T> siguiente;

        Nodo(T valor) {
            this.valor = valor;
        }
    }

    public void apilar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public T desapilar() {
        if (cima == null) throw new EmptyStackException();
        T valor = cima.valor;
        cima = cima.siguiente;
        return valor;
    }

    public T verTope() {
        if (cima == null) throw new EmptyStackException();
        return cima.valor;
    }

    public boolean estaVacia() {
        return cima == null;
    }
}
