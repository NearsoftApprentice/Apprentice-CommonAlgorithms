package common.algorithms.busqueda;

import common.algorithms.utileria.Cola;
import common.algorithms.utileria.Nodo;

public class BFS {

    public static String recorrer(Nodo inicio) {
        String recorrido = "";
        Cola cola = new Cola();
        inicio.visitar();
        cola.encolar(inicio);

        while (!cola.isEmpty()) {
            Nodo nodo = cola.desencolar();
            recorrido += nodo.getValor() + ", ";

            for(Nodo adyacente : nodo.getAdjacentes()) {
                if(!adyacente.isVisitado()) {
                    adyacente.visitar();
                    cola.encolar(adyacente);
                }
            }
        }
        return recorrido;
    }
}
