import java.util.Scanner;
public class Opala {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int tempo = keyb.nextInt();
        int velocidadeMedia = keyb.nextInt();
        float distancia = (float) velocidadeMedia * tempo;
        float litros = distancia / 12;
        System.out.printf("%.3f", litros);
    }
}
