package Ejercicio_03_linkedLists;

import Materia.ListasEnlazadas.*;
import Materia.Models.Node;

public class LinkedListEjr {

    public int getByPos(ListaEnlazada lista, int n) {
        if (lista.head == null) return -1; //No hay elementos no hagas nada

        Node tope1 = lista.head;
        Node tope2 = lista.head;

        
        for (int i = 0; i < n; i++) {
            if (tope1 == null) return -1; // Si n es mayor que el tamaño de la lista
            tope1 = tope1.next;
        }

        
        while (tope1 != null && tope1.next != null) {
            tope1 = tope1.next;
            tope2 = tope2.next;
        }

        
        if (tope2 != null) {
            return tope2.value;
        }

        return -1; // Si algún otro error ocurre
    }
}    