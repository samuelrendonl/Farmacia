package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaDoble<T> {
    private static class Nodo<T> {
        T valor;
        Nodo<T> siguiente;
        Nodo<T> anterior;

        Nodo(T valor) {
            this.valor = valor;
        }
    }

    private Nodo<T> cabeza;
    private Nodo<T> cola;

    public void agregarAlFinal(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (cola == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public List<T> toList() {
        List<T> lista = new ArrayList<>();
        Nodo<T> actual = cabeza;
        while (actual != null) {
            lista.add(actual.valor);
            actual = actual.siguiente;
        }
        return lista;
    }

    public List<T> buscarPorNombreParcial(String texto) {
        List<T> resultado = new ArrayList<>();
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.valor instanceof Producto) {
                Producto p = (Producto) actual.valor;
                if (p.getNombre() != null &&
                    p.getNombre().toLowerCase().trim().contains(texto.toLowerCase().trim())) {
                    resultado.add(actual.valor);
                }
            }
            actual = actual.siguiente;
        }
        return resultado;
    }
    
 public String imprimirDesdeInicio() {
    StringBuilder sb = new StringBuilder();
    Nodo<T> actual = cabeza;
    while (actual != null) {
        sb.append(actual.valor.toString()).append(" -> ");
        actual = actual.siguiente;
    }
    sb.append("null");
    return sb.toString();
}

}
