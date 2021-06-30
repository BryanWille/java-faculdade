import java.util.Scanner;

public class diofantina {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println(diofantina());
    }
    public static int diofantina(){
        int x, y, result = 0;
        for(int cont =-100; cont < 1000; cont++){
            x = -144 +5* cont;
            y = 528 - 18 * cont;
            result = 18 * x + 5 * y;
            System.out.printf("\nt = %d: 18 * %d + 5 * %d = %d\n", cont, x, y, result);
        }
        return result;
    }
}