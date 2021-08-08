import java.util.Scanner;

public class ex4c5 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, distancia;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos calcular a distância do Ponto um ao Ponto dois");
        System.out.print("\nDigite o valor de x1: ");
        x1 = keyb.nextDouble();
        System.out.print("\nDigite o valor de y1: ");
        y1 = keyb.nextDouble();
        System.out.print("\nDigite o valor de x2: ");
        x2 = keyb.nextDouble();
        System.out.print("\nDigite o valor de y2: ");
        y2 = keyb.nextDouble();
        distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("\nA distancia entre (" + x1 + " , " + y1 + ") e (" + x2 + " , " + y2 + ") é de " + distancia);
        keyb.close();
    }
}
