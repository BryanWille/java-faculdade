package Heap;

import java.util.Scanner;

public class MainHeap {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        /*
        int[] teste = {45, 80, 65, 90, 72, 50};
        int[] teste2 = {30, 10, 241, 239, 993};
        Heap heap = new Heap(teste);
        Heap heap2 = new Heap(teste2);
        heap.imprimirLista();
        */

        HeapSelect heaps = new HeapSelect(5);
        for(int i = 1; i < heaps.getVet().length; i++){
            System.out.println("Digite um número: ");
            int num = keyb.nextInt();
            heaps.insere(num);
        }
        heaps.imprimirLista();
        keyb.close();
    }
}
