import java.util.Scanner;

public class ex7c5 {
    public static void main(String[] args) {
        double fx, x;
        Scanner keyb = new Scanner(System.in);
        System.out.print("Vamos calcular o valor de x da função f(x) Raiz de (x/4 +1)² + 1/5x");
        System.out.print("\nDigite o valor de x dessa função: ");
        x = keyb.nextDouble();
        fx = Math.pow(Math.pow((x / 4f + 1), 2) + 1 / 5.0 * x, 1 / 2f);
        System.out.print("\n O Resultado foi f(x) = " + fx);
        keyb.close();
    }
}
