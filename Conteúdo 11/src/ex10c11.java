import java.util.Scanner;

public class ex10c11 {
    public static void main(String[] args) {
        int repet, cont = 0;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Quantas repetições você quer? ");
        repet = keyb.nextInt();
        while (cont != repet) {
            cont++;
            System.out.print("emge ");
        }

    }
}
