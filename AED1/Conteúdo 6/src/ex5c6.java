import java.util.Scanner;

public class ex5c6 {
    public static void main(String[] args) {
        int numero;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos saber se o seu n�mero � divisivel ao mesmo tempo por 5 e por 7!");
        System.out.print("\nDigite um n�mero inteiro: ");
        numero = keyb.nextInt();
        if (numero % 5 == 0 && numero % 7 == 0) {
            System.out.println("O n�mero " + numero + " � divisivel por 5 e por 7 ao mesmo tempo!");
        } else {
            System.out.println("O n�mero " + numero + " n�o � divisivel por 5 e por 7 ao mesmo tempo!");
        }
        keyb.close();
    }

}
