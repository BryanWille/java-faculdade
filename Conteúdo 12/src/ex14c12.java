import java.util.Scanner;
import java.util.Arrays;

public class ex14c12 {
    public static void main(String[] args) {
        int repet = 100, pop[] = new int[repet];
        String cidade[] = new String[repet], estado[] = new String[repet];
        Scanner keyb = new Scanner(System.in);
        for (int cont = 0; cont < repet; cont++) {
            System.out.println("Qual o nome da cidade: ");
            cidade[cont] = keyb.nextLine();
            System.out.println("Qual o estado da cidade " + cidade[cont] + ": ");
            estado[cont] = keyb.nextLine();
            System.out.println("Qual a população da cidade " + cidade[cont] + ": ");
            pop[cont] = keyb.nextInt();
            keyb.nextLine();
        }

    }
}
