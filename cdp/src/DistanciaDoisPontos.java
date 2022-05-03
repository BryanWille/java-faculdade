import java.util.Scanner;

public class DistanciaDoisPontos {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        double x1 = keyb.nextDouble();
        double y1 = keyb.nextDouble();

        double x2 = keyb.nextDouble();
        double y2 = keyb.nextDouble();


        double distancia = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 1 / 2f);
        distancia =(double) Math.round(distancia * 10000) / 10000;
        System.out.println(distancia);
    }


}
