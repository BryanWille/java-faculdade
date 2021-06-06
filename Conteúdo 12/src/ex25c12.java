import java.util.Scanner;

public class ex25c12 {
    public static void main(String[] args) {
        String[] time = new String[20];
        int[] posicao = new int[20];
        Scanner keyb = new Scanner(System.in);
        for(int cont =0; cont < time.length; cont++){
            System.out.println("Digite o nome do time: ");
            time[cont] = keyb.nextLine();
            System.out.println("Digite a posição do " +time[cont] +": ");
            posicao[cont] = keyb.nextInt();
            keyb.nextLine();
        }

    }
}
