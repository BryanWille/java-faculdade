package Fila;

class Celula {
    Object item;
    Celula anterior;

    public Celula() {
        item = null;
        anterior = null;
    }

    public Celula(Object valorItem) {
        item = valorItem;
        anterior = null;
    }

    public Celula(Object valorItem, Celula celulaSeguinte) {
        item = valorItem;
        anterior = celulaSeguinte;
    }
}

public class FilaDinamica {

    private Celula inicio;
    private Celula fim;
    private int contador;

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
        this.contador = 0;
    }

    public void limparFila(){
        if(vazia()){
            System.out.println("Fila já está vazia");
        } else {
            while (!vazia()) {
                this.desenfileirar();
            }
            System.out.println("Fila Esvaziada com sucesso");
        }
    }

    public boolean vazia() {
        return (contador == 0);
    }

    public int tamanho() {
        return (contador);
    }

    public void enfileirar(Object novoItem) {
        Celula novaCelula = new Celula(novoItem);
        if (inicio == null) {
            inicio = novaCelula;
        } else {
            fim.anterior = novaCelula;
        }
        fim = novaCelula;
        contador++;
    }

    public Object desenfileirar() {
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

    public Object consultarInicio() {
        Object x = null;
        if (vazia()) {
            System.out.println("Erro: Fila Vazia!");
        } else {
            x = inicio.item;
        }
        return x;
    }

    public Object consultarFim() {
        Object x = null;
        if (vazia()) {
            System.out.println("Erro: Fila Vazia!");
        } else {
            x = fim.item;
        }
        return x;
    }

    public String toString(){
        String filaCompleta = "";
        if(vazia()){
            filaCompleta = null;
        } else {
            for(int i = 0; i < contador; i++){
                Object tempObject = desenfileirar();
                filaCompleta = filaCompleta + "\n" + tempObject;
                enfileirar(tempObject);
            }
        }
        return (filaCompleta);
    }

}
