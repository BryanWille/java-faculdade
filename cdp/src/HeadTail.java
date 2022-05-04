import java.util.Scanner;

public class HeadTail {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String quantJogos, quantPartidas;
        int mary = 0, john = 0;

        quantJogos = keyb.nextLine();
        if(Integer.parseInt(quantJogos) > 0) {
            quantPartidas = keyb.nextLine();

            String[] vetor = quantPartidas.split(" ");


            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i].equalsIgnoreCase("0"))
                    mary += 1;
                else if (vetor[i].equalsIgnoreCase("1"))
                    john += 1;
            }
            System.out.printf("Mary won %d times and John won %d times", mary, john);
            keyb.close();
        }
    }
}
