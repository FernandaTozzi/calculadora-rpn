import java.util.ArrayList;

public class Pilha<T> {

    private ArrayList<T> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public void empilhar(T elemento) {
        elementos.add(elemento);
    }

    public T desempilhar() {
        if (estaVazia()) {
            return null;
        }

        return elementos.remove(elementos.size() - 1);
    }

    public T topo() {
        if (estaVazia()) {
            return null;
        }

        return elementos.get(elementos.size() - 1);
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }
}