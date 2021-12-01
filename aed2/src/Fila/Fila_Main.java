package Fila;

public class Fila_Main {
    public static void main(String[] args){
        FilaDinamica fila = new FilaDinamica();

        fila.enfileirar(22);
        fila.enfileirar("23ji1");
        fila.enfileirar("29391");
        System.out.println(fila.toString());
        fila.enfileirarComPrioridade("first");
        System.out.println("------------------");
        System.out.println(fila.toString());

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

        /*FilaDinamica FilaD = new FilaDinamica();
        FilaD.enfileirar(232);
        FilaD.enfileirar("sda");
        FilaD.enfileirar(3.14159);
        System.out.println(FilaD.toString() +"\n");
        FilaD.enfileirarComPrioridade("Phi");
        System.out.println(FilaD.toString());*/



    }
}
