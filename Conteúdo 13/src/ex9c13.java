import java.util.Scanner;

public class ex9c13 {
    public static void main(String[] args) {
        String frases, frase = "";
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("Digite uma frase ('fim' para encerrar: ");
            frases = keyb.nextLine();

        } while (!frase.equalsIgnoreCase("fim"));
        System.out.println("fim");
        keyb.close();
    }
}
