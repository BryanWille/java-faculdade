package Pilha;
class Celula {
    Object item;
    Celular anterior;

    public Celula(){
        item = null;
        anterior = null;
    }

    public Celula(Object valorItem){
        this.item = valorItem;
        this.anterior = null;
    }
    public Celula(Object valorItem, Celular celulaAnterior) {
        this.item = valorItem;
        this.anterior = celulaAnterior;
    }
}
public class PilhaDinamica {
    private Celula topo;
    private int contador;

    public PilhaDinamica(){
        topo = null;
        contador = 0;
    }


}
