import java.util.Scanner;

public class ex1c13 {
    static double x1, x2, y1, y2;

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite x1: ");
        x1 = keyb.nextDouble();
        System.out.println("Digite y1: ");
        y1 = keyb.nextDouble();
        System.out.println("Digite x2: ");
        x2 = keyb.nextDouble();
        System.out.println("Digite y2: ");
        y2 = keyb.nextDouble();
        System.out.println("Distância" +distancia());
        keyb.close();
    }
    static double distancia() {
        double dist;
        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return dist;
    }
}