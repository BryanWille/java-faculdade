package Pilha;

public class PilhaTeste {

    private static PilhaEstatica pe;
    private static PilhaDinamica pd;

    public static void main(String[] args){
        pd = new PilhaDinamica();
        pd.empilhar("tst");
        pd.empilhar(23.2f);
        pd.empilhar(291);
        System.out.println(pd.toString());
        pd.limparPilha();
        System.out.println(pd.toString());

        System.out.println("---------------");

        pe = new PilhaEstatica(4);
        pe.empilhar(231);
        pe.empilhar(291);
        pe.empilhar(pd.toString());
        pe.empilhar("testes");
        Object teste = pe.desempilhar();
        System.out.println(teste);

        System.out.println(pe.toString());
        // pe.limparPilha();
        System.out.println(pe.toString());
    }

}
