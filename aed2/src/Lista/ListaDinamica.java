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
        contador = 0;
    }

    public void inverterLista(){
        ListaDinamica clone = new ListaDinamica();
        int listaTamanho = this.contador;
        for(int i = 0; i < listaTamanho; i++){
            clone.inserir(this.retirarFim());
        }
        for(int i = 0; i < listaTamanho; i++){
            this.inserir(clone.retirarInicio());
        }
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

    public void limpar(){
        if(vazia()){
            System.out.println("Erro: Lista Vazia!");
        } else {
            while (!vazia()){
                this.retirarInicio();
            }
        }
    }

    public ListaDinamica copiar(){
        ListaDinamica copia = new ListaDinamica();

        while (!vazia()){
            copia.inserir(this.retirarInicio());
        }
        return copia;
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
        inserir(novoItem, this.contador+1);
    }

    public void inserirInicio(Object novoItem){
        inserir(novoItem, 1);
    }

    public void inserirFim(Object novoItem){
        inserir(novoItem, this.contador+1);
    }

    public Object retirar(int posicao){
        Object x = null;
        Celula tempCelula;
        int i;
        if(vazia()){
            System.out.println("Erro: Lista vazia!");
        } else if (posicao == 1){
            x = inicio.item;
            inicio = inicio.link;
            if(inicio == null){
                fim = null;
            }
            contador--;
        } else if (posicao == contador){
            tempCelula = inicio;
            for(i =1; i < contador -1; i++) {
                tempCelula = tempCelula.link;
            }
            x = fim.item;
            fim = tempCelula;
            if(fim == null){
                inicio = fim;
            } else {
                fim.link = null;
            }
            contador--;
        } else {
            if(!chaveValida(posicao)){
                System.out.println("Erro: Indice invalido!");
            } else {
                tempCelula = inicio;
                for(i = 1; i < posicao-1; i++){
                    tempCelula = tempCelula.link;
                }
                x = tempCelula.link.item;
                tempCelula.link = tempCelula.link.link;
                contador--;
            }
        }
        return (x);
    }

    public Object retirar(){
        return(retirar(1));
    }

    public Object retirarInicio(){
        return(retirar(1));
    }

    public Object retirarFim(){
        return(retirar(contador));
    }

    public String toString() {
        String listaCompleta = "[";
        if (vazia()) {
            listaCompleta = listaCompleta + null;
        } else {
            Celula listCelula = inicio;
            while (listCelula != null) {
                listaCompleta = listaCompleta + " " + listCelula.item;
                listCelula = listCelula.link;
            }
            listaCompleta = listaCompleta + " ]";
        }
        return (listaCompleta);
    }
}
