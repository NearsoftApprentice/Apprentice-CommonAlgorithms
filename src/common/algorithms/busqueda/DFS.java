package common.algorithms.busqueda;

import common.algorithms.utileria.Nodo;
import common.algorithms.utileria.Pila;

public class DFS {

    public static String recorrer(Nodo inicio) {
        String recorrido = "";
        Pila pila = new Pila();
        inicio.visitar();
        pila.push(inicio);

        while (!pila.isEmpty()) {
            Nodo nodo = pila.pop();
            recorrido += nodo.getValor() + ", ";

            for(Nodo adyacente : nodo.getAdjacentes()) {
                if(!adyacente.isVisitado()) {
                    adyacente.visitar();
                    pila.push(adyacente);
                }
            }
        }
        return recorrido;
    }
}
