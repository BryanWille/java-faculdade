import java.util.Scanner;

public class ex17c8 {
    public static void main(String[] args) {
        int numero;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite um número para fazer tabuada: ");
        numero = keyb.nextInt();
        for (int contador = 1; 10 > contador; contador++) {
            System.out.print("\n" + contador + " x " + numero + " = " + (contador * numero));
        }
        keyb.close();
    }
}
