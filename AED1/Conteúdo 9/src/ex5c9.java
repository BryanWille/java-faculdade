import java.util.Scanner;

public class ex5c9 {
    public static void main(String[] args) {
        double serieh = 0, repeticoes;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantas repetições você quer da série: 0 + 3 / 7 + 2 + 6 / 13...");
        repeticoes = teclado.nextDouble();
        ;
        for (double contador = 1; repeticoes >= contador; contador++) {
            serieh += (((contador * 2) - 2) + contador * 3) / ((contador * 6) + 1);
        }
        serieh = 5 * serieh;
        System.out.println(serieh);
        teclado.close();
    }
}