package Pilha;

public class PilhaEstatica {
    private int topo;
    private int contador;
    private int capacidade;
    private Object[] itemArray;

    public PilhaEstatica(){
        this(10);
    }

    public PilhaEstatica(int maxCapacidade) {
        this.topo = 0;
        this.contador = 0;
        this.capacidade = maxCapacidade;
        itemArray = new Object[capacidade];
    }

    public boolean vazia() {
        return (this.topo == 0);
    }

    public int tamanho() {
        return (this.contador);
    }

    public int capacidadePilha() {
        return (this.capacidade);
    }

    public void empilhar (Object novoItem) {
        if (this.topo == this.capacidade) {
            System.out.println("Erro: Capacidade da Pilha foi excedidade!");
        } else {
            this.itemArray[this.topo ++] = novoItem;
            this.contador ++;
        }
    }

    public void limparPilha(){
        if(vazia()){
            System.out.println("Pilha já está vazia!");
        } else {
            while(!this.vazia()) {
                this.desempilhar();
                System.out.println(this.contador);
            }
            System.out.println("Pilha vazia!");
        }
    }

    public Object desempilhar() {
        Object x = null;
        if (this.vazia()) {
            System.out.println("Erro: pilha vazia!");
        } else {
            x = this.itemArray[--this.topo];
            this.contador--;
        }
        return(x);
    }

    public Object consultarTopo() {
        Object x = null;
        if(this.vazia()) {
            System.out.println("Erro: pilha vazia!");
        } else {
            x = this.itemArray[this.topo -1];
        }
        return(x);
    }

    public String toString() {
        String pilhaCompleta = "";
        if(vazia()) {
            pilhaCompleta = null;
        } else {
            for (int i = topo - 1; i >= 0; i--) {
                pilhaCompleta = pilhaCompleta + "\n" + itemArray[i];
            }
        }
        return (pilhaCompleta);
    }

}
