import java.util.Scanner;

public class ex5c5 {
    public static void main(String[] args) {
        double c, f, k;
        Scanner keyb = new Scanner(System.in);
        System.out.print("Digite o valor em Celsius: ");
        c = keyb.nextDouble();
        k = 273.15 + c;
        f = (9 * c + 160) / 5f;
        System.out.print("O valor de " + c + "C° \nFahrenheit é " + f + "F° \ne em Kelvin é " + k + "K°!");
        keyb.close();
    }
}
