import java.util.Scanner;

public class ConversorDias {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int tempoDias = keyb.nextInt();
        double ano = tempoDias / 365f;
        double meses = ((ano - Math.floor(ano)) * 365) / 30f;
        double dias = (meses - Math.floor(meses)) * 30;
        System.out.printf("%.0f ano(s)\n%.0f mes(es)\n%.0f dia(s)", ano, meses, dias);
    }
}
