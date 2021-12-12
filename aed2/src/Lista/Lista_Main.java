package Lista;

public class Lista_Main {
    public static void main(String[] args) {
        ListaDinamica listaE = new ListaDinamica();
        listaE.inserir(2);
        listaE.inserir(-4);
        listaE.inserir(29);
        listaE.inserir(22);
        listaE.inserir(0);

        ListaDinamica listaB = new ListaDinamica();
        listaB.inserir(22);
        listaB.inserir(292);
        listaB.inserir(29);
        listaB.inserir(310);
        listaB.inserir(0);

        ListaDinamica listaIntersecao = listaE.intersecao(listaB);
        System.out.println(listaIntersecao.toString());
    }

}