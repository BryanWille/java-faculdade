import java.util.Scanner;

public class Flavious {
    public static void main(String[] args) {
        int morte, repeticoes, numeroHomens, salto, numeroVivo;
        Scanner keyb = new Scanner(System.in);
        repeticoes = keyb.nextInt();
        for (int i = 1; i < repeticoes + 1; i++) {
            numeroHomens = keyb.nextInt();
            salto = keyb.nextInt();
            int[] array = fazerArray(numeroHomens);
            morte = salto;
            for (int j = 1; j < numeroHomens; j++) {
                if (array[morte] == 1) {
                    array[morte] = 0;
                } else {

                        int pulo = 0;
                        while (pulo != salto) {
                            morte = (morte + 1) % numeroHomens;
                            if (array[morte] == 1)
                                pulo += 1;
                        }

                }
            }

            numeroVivo = numeroHomens;

            if (array[0] == 0) {
                for (int c = 0; c < numeroHomens; c++) {
                    if (array[c] == 1)
                        numeroVivo = c;
                }
            }
            System.out.println("Case " + i + ": " + numeroVivo);
        }
    }

    static int[] fazerArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) array[i] = 1;
        return array;
    }

}
