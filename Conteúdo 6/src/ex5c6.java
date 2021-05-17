import java.util.Scanner;

public class ex5c6 {
    public static void main(String[] args) {
        int numero;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos saber se o seu número é divisivel ao mesmo tempo por 5 e por 7!");
        System.out.print("\nDigite um número inteiro: ");
        numero = keyb.nextInt();
        if (numero % 5 == 0 && numero % 7 == 0) {
            System.out.println("O número " + numero + " é divisivel por 5 e por 7 ao mesmo tempo!");
        } else {
            System.out.println("O número " + numero + " não é divisivel por 5 e por 7 ao mesmo tempo!");
        }
        keyb.close();
    }

}
