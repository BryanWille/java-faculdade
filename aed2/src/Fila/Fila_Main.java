package Fila;

public class Fila_Main {
    public static void main(String[] args){
        /*FilaEstatica filaE = new FilaEstatica( 4 );
        int[] teste = {2, 4, 2, 4};
        String[] k = {"Antonieta", "Jubileu", "Romeu"};
        filaE.enfileirar("A");
        filaE.enfileirar("k");
        filaE.enfileirar(teste);
        filaE.enfileirar(32);
        System.out.println(filaE.toString());
        System.out.println("\n" +filaE.buscar(32));
        filaE.limparFila();
        System.out.println(filaE.toString());*/

        FilaDinamica FilaD = new FilaDinamica();
        FilaD.enfileirar(232);
        FilaD.enfileirar("sda");
        FilaD.enfileirar(3.14159);
        System.out.println(FilaD.toString() +"\n");
        FilaD.enfileirarComPrioridade("Phi");
        FilaD.enfileirar("290");
        FilaD.enfileirarComPrioridade("Braia");
        System.out.println(FilaD.toString());

    }
}
