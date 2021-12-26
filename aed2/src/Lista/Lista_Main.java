package Lista;

public class Lista_Main {
    public static void main(String[] args) {
        ListaEstatica listaE = new ListaEstatica(5);
        listaE.inserir(2);
        listaE.inserir(-4);
        listaE.inserir(29);
        listaE.inserir(22);
        listaE.inserir(0);
        System.out.println(listaE.buscar(22));

        ListaDinamica listaB = new ListaDinamica();
        listaB.inserir(22);
        listaB.inserir(292);
        listaB.inserir(29);
        listaB.inserir(310);
        listaB.inserir(0);
        System.out.println(listaB.buscar(310));

        //ListaDinamica listaIntersecao = listaE.intersecao(listaB);
        //ystem.out.println(listaIntersecao.toString());
    }

}