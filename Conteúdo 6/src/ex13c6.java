import java.util.Scanner;

public class ex13c6 {
    public static void main(String[] args) {
        String inicio, fim;
        int horaInicial, horaFinal, horas, minutos;
        Scanner keyb = new Scanner(System.in);
        System.out.print("\nDigite o tempo inicial: ");
        inicio = keyb.nextLine().replace(":", "");
        System.out.print("\nDigite o tempo final: ");
        fim = keyb.nextLine().replace(":", "");
        horaInicial = Integer.valueOf(inicio);
        horaFinal = Integer.valueOf(fim);
        horas = (horaFinal / 100) - (horaInicial / 100);
        minutos = horaFinal % 100 - horaInicial % 100;
        if (horaInicial % 100 > horaFinal % 100) {
            horas -= 1;
            minutos = (3600 - ((horaInicial % 100) * 60 - (horaFinal % 100) * 60)) / 60;
        }
        keyb.close();
        System.out.println("O tempo final foi de " + horas + " hora(s) e " + minutos + " minuto(s)!");
    }
}
