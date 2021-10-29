package Lista;

class Celula {
    Object item;
    Celula link;

    public Celula(){
        item = null;
        link = null;
    }

    public Celula(Object valorItem){
        item = valorItem;
        link = null;
    }

    public Celula(Object valorItem, Celula linkCelula){
        item = valorItem;
        link = linkCelula;
    }

}

public class ListaDinamica {
    private Celula inicio;
    private Celula fim;
    private int contador;

    public ListaDinamica(){
        inicio = fim = null;
        contador =0;
    }

    public boolean vazia(){
        return (contador == 0);
    }

    public int tamanho(){
        return (contador);
    }

    private boolean chaveValida(int x){
        return(1 <= x && x <= contador);
    }

    public void inserir(Object novoItem, int posicao){
        Celula novaCelula, tempCelula;
        int i;
        if(posicao == contador+1){
            novaCelula = new Celula(novoItem);
            if(inicio == null){
                inicio = novaCelula;
            } else {
                fim.link = novaCelula;
            }
            fim = novaCelula;
            contador++;
        } else {
            if(posicao == 1){
                novaCelula = new Celula(novoItem, inicio);
                if(fim == null){
                    fim = novaCelula;
                }
                inicio = novaCelula;
                contador++;
            } else {
                if(!chaveValida(posicao)){
                    System.out.println("Erro: Indice inválido!");
                } else {
                    tempCelula = inicio;
                    for(i = 1; i < posicao; i++){
                        tempCelula = tempCelula.link;
                    }
                    novaCelula = new Celula(tempCelula.item, tempCelula.link);
                    tempCelula.link = novaCelula;
                    if(tempCelula == fim){
                        fim = novaCelula;
                    }
                    tempCelula.item = novoItem;
                    contador++;
                }
            }
        }
    }

    public void inserir(Object novoItem){

    }
}
