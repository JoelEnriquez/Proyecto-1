/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasYColas;

/**
 *
 * @author joel
 */
public class ListaEnlazada<T> {

    private Nodo<T> primerNodo;
    private Nodo<T> ultimoNodo;
    private int ultimoIndice = -1;


    public void insertar(T contenido) {
        ultimoIndice++;
        Nodo<T> nuevo = new Nodo<>(contenido);
        if (esVacia()) {
            primerNodo = nuevo;
            ultimoNodo = nuevo;
        } else {
            ultimoNodo.setSiguiente(nuevo);
            ultimoNodo = nuevo;
        }
    }


    public void eliminar() throws Exception {
        if (esVacia()) {
            throw new Exception("Error eliminado elemento en lista vacia.");
        }
        if (primerNodo.equals(ultimoNodo)) {
            primerNodo = null;
            ultimoNodo = null;
        } else {
            Nodo<T> penultimo = obtenerPorIndice(ultimoIndice - 1);
            penultimo.setSiguiente(null);
            ultimoNodo = penultimo;
        }
        ultimoIndice--;
    }

    public boolean esVacia() {
        return primerNodo == null;
    }

    public Nodo<T> obtenerPorIndice(int indice) throws Exception {
        if (indice < 0 || indice > ultimoIndice) {
            throw new Exception("Indice fuera de rango.");
        }
        Nodo<T> buscado = primerNodo;
        for (int i = 0; i < indice; i++) {
            buscado = buscado.getSiguiente();
        }

        return buscado;
    }

    public Nodo<T> getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(Nodo<T> primerNodo) {
        this.primerNodo = primerNodo;
    }

    public Nodo<T> getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(Nodo<T> ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }

}
