import java.util.Scanner;

public class HeadTail {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String quantJogos, quantPartidas;

        do {
            quantJogos = keyb.nextLine();
            if (Integer.parseInt(quantJogos) > 0) {
                quantPartidas = keyb.nextLine();
                String[] vetor = quantPartidas.split(" ");
                int mary = 0, john = 0;
                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i].equalsIgnoreCase("0"))
                        mary += 1;
                    else if (vetor[i].equalsIgnoreCase("1"))
                        john += 1;
                }
                System.out.printf("Mary won %d times and John won %d times\n", mary, john);
            }
        } while (Integer.parseInt(quantJogos) != 0);
    }
}