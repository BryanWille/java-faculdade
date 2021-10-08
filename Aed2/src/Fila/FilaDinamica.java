package Fila;
class Celula{
    Object item;
    Celula anterior;

    public Celula(){
        item = null;
        anterior = null;
    }

    public Celula(Object valorItem){
        item = valorItem;
        anterior = null;
    }
}

public class FilaDinamica {

    private Celula inicio;
    private Celula fim;
    private int contador;

    public FilaDinamica(){
        this.inicio = null;
        this.fim = null;
        this.contador = 0;
    }

    public boolean vazia(){
        return (contador == 0);
    }

    public int tamanho(){
        return (contador);
    }

    public void enfileira(Object novoItem){
        Celula novaCelula = new Celula(novoItem);
        if (inicio == null) {
            inicio = novaCelula;
        } else {
            fim.anterior = novaCelula;
        }
        fim = novaCelula;
        contador++;
    }

    public Object desenfileirar(){
        Object x = null;
        if (vazia()) {
            System.out.println("Erro: Fila Vazia!");
        } else {
            x = inicio.item;
            inicio = inicio.anterior;
            if (inicio == null) {
                fim = null;
            }
            contador--;
        }
        return x;
    }

}
