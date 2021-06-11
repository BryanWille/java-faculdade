import java.util.Scanner;

public class ex9c13 {
    public static void main(String[] args) {
        String frases, frase = "";
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("Digite uma frase ('fim' para encerrar: ");
            frases = keyb.nextLine();
            if (!frases.equalsIgnoreCase("fim")) {
                String[] Vetor = frases.split(" ");
                for (int cont = 0; cont < Vetor.length; cont++) {
                    frase += (Vetor[cont].substring(0, 1).toUpperCase()
                            + Vetor[cont].substring(1).toLowerCase()) + " ";
                }
                System.out.println(frase);
            }
        } while (!frase.equalsIgnoreCase("fim"));
        System.out.println("fim");
        keyb.close();
    }
}
