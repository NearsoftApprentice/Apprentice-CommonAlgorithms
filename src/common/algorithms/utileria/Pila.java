package common.algorithms.utileria;

import java.util.ArrayList;
import java.util.List;

public class Pila {

    private List<Nodo> pila;

    public Pila() {
        pila = new ArrayList<>();
    }

    public void push(Nodo nodo) {
        pila.add(nodo);
    }

    public Nodo pop() {
        if(!pila.isEmpty()) {
            return pila.remove(pila.size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }
}
