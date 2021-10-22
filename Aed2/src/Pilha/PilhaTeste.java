package Pilha;

public class PilhaTeste {

    private static PilhaEstatica pe;
    private static PilhaDinamica pd;

    public static void main(String[] args){
        pe = new PilhaEstatica();
        pe.empilhar(22);
        pe.empilhar("estre");
        pe.empilhar("01-lk");

        System.out.println(pe.toString());
        PilhaEstatica clone = pe.clonarPilha();

        System.out.println(clone.toString());

        PilhaEstatica clonar = clone.clonarPilha();
        System.out.println("\n teste: " +clonar.toString());
    }

}
