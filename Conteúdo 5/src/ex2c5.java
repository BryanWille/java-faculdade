import java.util.Scanner;

public class ex2c5 {
    public static void main(String[] args) {
        double r, area, volume;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Vamos calcular a area de uma superficie esferica!");
        System.out.println("\nDigite o valor do raio: ");
        r = teclado.nextDouble();
        area = 4 * Math.PI * Math.pow(r, 2);
        volume = 4 / 3f * Math.PI * Math.pow(r, 3);
        System.out.println("A sua area foi de " + area);
        System.out.println("O seu volume de: " + volume);
        teclado.close();
    }
}
