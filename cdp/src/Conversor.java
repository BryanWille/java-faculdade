import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int segEntrada = keyb.nextInt();
        double segundos, horas, minutos;
        horas = segEntrada / 3600;
        segundos = segEntrada % 60;
        minutos = ((segEntrada - segundos) - horas * 3600) / 60;
        System.out.printf("%.0f:%.0f:%.0f",horas, minutos, segundos);
    }
}
