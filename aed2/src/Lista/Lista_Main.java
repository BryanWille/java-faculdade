package Lista;

public class Lista_Main {
    public static void main(String[] args) {
        ListaEstatica listaE = new ListaEstatica(5);
        listaE.inserir(2);
        listaE.inserir(-4);
        listaE.inserir(29);
        listaE.inserir(22);
        listaE.inserir(0);
        System.out.println(listaE.toString());
        listaE.ordenar();
        System.out.println(listaE.toString());
    }

}