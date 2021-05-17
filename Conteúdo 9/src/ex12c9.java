public class ex12c9 {
    public static void main(String[] args) {
        double pi = 0, impar = 1;
        System.out.println("Vamos calcular o PI com 10 Mil casas decimais!");
        for (double contador = 1; 10000 > contador; contador++) {
            if (contador % 2 == 0) {
                pi -= 1 / impar;
            } else {
                pi += 1 / impar;
            }
            impar += 2;
        }
        pi = 4 * pi;
        System.out.println("O valor de pi com 10K de repetições: " + pi);
    }
}
