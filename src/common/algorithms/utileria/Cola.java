package common.algorithms.utileria;

import java.util.ArrayList;
import java.util.List;

public class Cola {
    private List<Nodo> cola;

    public Cola() {
        cola = new ArrayList<>();
    }

    public void encolar(Nodo nodo) {
        cola.add(nodo);
    }

    public Nodo desencolar() {
        if(!cola.isEmpty()) {
            return cola.remove(0);
        }
        return null;
    }

    public boolean isEmpty() {
        return cola.isEmpty();
    }
}
