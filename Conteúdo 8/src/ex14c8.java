import java.util.Scanner;

public class ex14c8 {
    public static void main(String[] args) {
        char caract;
        int numero, contador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 20: ");
        numero = teclado.nextInt();
        System.out.println("Digite um caracter qualquer: ");
        caract = teclado.next().charAt(0);
        for (int c = 1; numero >= c; c++) {
            contador = 1;
            while (numero >= contador) {
                contador += 1;
                System.out.print(caract);
            }
            System.out.print("\n");
        }
    teclado.close();
    }
}
