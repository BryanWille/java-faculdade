import java.util.Locale;
import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        double num = keyb.nextDouble();
        String status = "Intervalo";
        if (num >= 0 && num <= 25) status += " [0,25]";
        else if (num > 25 && num <= 50) status += " (25,50]";
        else if(num > 50 && num <= 75) status += " (50,75]";
        else if (num > 75 && num <= 100) status += " (75,100]";
        else status = "Fora de " + status.toLowerCase();
        System.out.print(status);
        keyb.close();
    }
}
