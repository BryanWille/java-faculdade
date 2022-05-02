public class DistanciaDoisPontos {
    public static void main(String[] args) {
        System.out.println(distanciaDoisPontos(1.0,7.0,5.0, 9.0));
        System.out.println(distanciaDoisPontos(-2.5,0.4,12.1,7.3));
        System.out.println(distanciaDoisPontos(2.5,-0.4,-12.2,7.0));
    }

    public static double distanciaDoisPontos(double x1, double y1, double x2, double y2) {
        double distancia = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 1 / 2f);
        return (double) Math.round(distancia * 10000) / 10000;
    }
}
