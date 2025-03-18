
public class ListaEncadeada{
    private Node inicio;

    private Node fim;
    private int quant;

    public ListaEncadeada(){
        this.inicio = null;
        this.inicio = null;
        this.quant = 0;
    }

    public void inserirElemento(Object elem){
        Node novo = new Node(elem);

        if (this.inicio == null){
            this.inicio = novo;
        }
        else {
            this.fim.setProx(novo);
        }
        this.fim = novo;
        this.quant++;
    }

    public boolean contemElem (Object elem){
        Node aux = this.inicio;

        while (aux!=null){
            if (aux.getValor().equals(elem))
                return true;
            aux = aux.getProx();
        }
        return false;
    }

    public boolean excluirElem(Object elem){
        Node aux = this.inicio;
        Node ant = null;

        while(aux!=null){
            if(aux.getValor().equals(elem)){
                if (aux==this.inicio) {
                    this.inicio = this.inicio.getProx();
                    if(aux==this.fim)
                        this.fim = null;
                }
                else{
                    ant.setProx(aux.getProx());

                    if(aux==this.fim)
                        this.fim=ant;
                }
                this.quant--;
                return true;
            }
            ant = aux;
            aux = aux.getProx();
        }
        return false;

    }

}