public class Node {
    private Object valor;
    private Node prox;

    public Node(Object valor){
        this.valor = valor;
        this.prox = null;
    }

    public Node getProx() {
        return prox;
    }

    public Object getValor() {
        return valor;
    }

    public void setProx(Node prox) {
        this.prox = prox;
    }
}

