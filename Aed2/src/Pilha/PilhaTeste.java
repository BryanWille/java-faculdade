package Pilha;

public class PilhaTeste {

    private static PilhaEstatica pe;
    private static PilhaDinamica pd;

    public static void main(String[] args){
        /*pe = new PilhaEstatica();
        pe.empilhar(22);
        pe.empilhar("estre");
        pe.empilhar("01-lk");

        System.out.println(pe.toString());
        PilhaEstatica clone = pe.clonarPilha();

        System.out.println(clone.toString());

        PilhaEstatica clonar = clone.clonarPilha();
        System.out.println("\n teste: " +clonar.toString()); */

        PilhaEstatica pilhaE = new PilhaEstatica( 3 );
        pilhaE.empilhar("D");
        pilhaE.empilhar("A");
        pilhaE.empilhar("D");
        pilhaE.empilhar("E");
        pilhaE.desempilhar();
        System.out.println("antes linha 9");
        pilhaE.empilhar("B");
        System.out.println("depois linha 9");
        pilhaE.empilhar("C");
        System.out.println(pilhaE.toString());
    }

}
