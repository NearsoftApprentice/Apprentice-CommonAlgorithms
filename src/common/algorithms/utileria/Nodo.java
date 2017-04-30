package common.algorithms.utileria;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
    private String valor;
    private List<Nodo> adjacentes;
    private boolean visitado;

    public Nodo(String valor) {
        this.valor = valor;
        visitado = false;
        adjacentes = new ArrayList<>();
    }

    public void agregarAdyacente(Nodo nodo) {
        this.adjacentes.add(nodo);
        nodo.adjacentes.add(this);
    }

    public String getValor() {
        return valor;
    }

    public List<Nodo> getAdjacentes() {
        return adjacentes;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void visitar() {
        this.visitado = true;
    }
}
