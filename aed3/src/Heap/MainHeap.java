package Heap;

public class MainHeap {
    public static void main(String[] args) {
        int[] teste = {45, 80, 65, 90, 72, 50};
        Heap heap = new Heap(teste);
        heap.imprimirLista();
    }
}
