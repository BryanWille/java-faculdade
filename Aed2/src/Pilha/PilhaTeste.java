package Pilha;

public class PilhaTeste {

    private static PilhaEstatica pe;

    public static void main(String[] args){
        pe = new PilhaEstatica(10);
        pe.empilhar("Bryan");
        int[]  a = {2, 3, 4};
        pe.empilhar(a);
        System.out.println(pe.toString());
    }

}
