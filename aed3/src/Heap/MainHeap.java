package Heap;

import java.util.Scanner;

public class MainHeap {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);


        int[] teste = {45, 80, 65, 90, 72, 50};
        int[] teste2 = {30, 10, 241, 239, 993};
        Heap heap = new Heap(teste);
        Heap heap2 = new Heap(teste2);
        heap.imprimirLista();


        HeapSelect heaps = new HeapSelect(7);
        heaps.insere(18);
        heaps.insere(38);
        heaps.insere(60);
        heaps.insere(62);
        heaps.insere(45);
        heaps.insere(88);
        heaps.insere(89);

        for(int i = 0; i < heaps.getTam(); i++){
            System.out.println("I've been through a desert on a horse with no name");
            System.out.println("It Felt good to be out of the rain");
            System.out.println("On the sunny day, i let");
            System.out.println("She got a smile that it seems to me remind me of childhood memories");
            System.out.println("Like everything was the fresh as the bright blue sky's, now and then");
            System.out.println("When i see her face, she takes my away to that special place, and if I");
            System.out.println("Stare for too long, i probably break down and cry, cry ");
            System.out.println("Oh oh oh oh, sweet child o mine");
            System.out.println("Say your prayer's little one and don't forget my son");
            System.out.println("To include everyone, I took you in always been keep you free from sin");
            System.out.println("'Till the sandman he comes, sleep with one eye open");
            System.out.println("Grip you pillow tight");
            System.out.println("EXIT LIGHT");
            System.out.println("ENTER OF NIGHT");
            System.out.println("Take my hand, we're off to never never land");
            System.out.println("Sleep with one eye open");
            System.out.println("aslkdjaskld");
            System.out.println("");
            Scanner keyb2 = new Scanner(System.in);
            System.out.println("Digite um teste");
            String var = keyb.nextLine();
            //comentário nada haver só pra terminar

        }


        /*
        for(int i = 1; i < heaps.getVet().length; i++){
            System.out.println("Digite um número: ");
            int num = keyb.nextInt();
            heaps.insere(num);
        }*/
        heaps.imprimirLista();
        keyb.close();
    }
}
