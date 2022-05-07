import java.io.IOException;
import java.util.Scanner;

public class Lavanderia {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int quantPecas = Integer.parseInt(keyb.nextLine());
        boolean statusL = false, statusS = false;
        if(1 <= quantPecas && quantPecas <= 100 ) {
            String lavadora = keyb.nextLine();
            String secadora = keyb.nextLine();

            int la = minimo(lavadora);
            int lb = maximo(lavadora);
            int sa = minimo(secadora);
            int sb = maximo(secadora);

            if(la <= quantPecas && quantPecas <= lb && sa <= quantPecas && quantPecas <= sb ) {

                if (1 <= la && la < lb && lb <= 100) {
                    statusL = true;
                }

                if (1 <= la && la < lb && lb <= 100) {
                    statusS = true;
                }
            }
        }

        String status = statusS && statusL ? "possivel" : "impossivel";
        System.out.print(status);

    }

    public static int minimo(String frase) {
        return Integer.parseInt(frase.substring(0, frase.indexOf(" ")));
    }

    public static int maximo(String frase) {
        return Integer.parseInt(frase.substring(frase.indexOf(" ") + 1));
    }
}
