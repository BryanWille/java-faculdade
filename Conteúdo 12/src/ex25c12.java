import java.util.Scanner;
import java.util.Arrays;

public class    ex25c12 {
    public static void main(String[] args) {
        String[] time = new String[20];
        int[] posicao = new int[20];
        int bolhaInt, conta = 0;
        String bolhaStr, timePesq, status = "";
        Scanner txt = new Scanner(ex25c12.class.getResourceAsStream("times.txt"));
        while (txt.hasNextLine()) {
            time[conta] = txt.nextLine();
            posicao[conta] = Integer.parseInt(txt.nextLine());
            conta++;
        }
        Scanner keyb = new Scanner(System.in);
        /*for (int cont = 0; cont < time.length; cont++) {
            System.out.println("Digite o nome do time: ");
            time[cont] = keyb.nextLine();
            System.out.println("Digite a posição do " + time[cont] + ": ");
            posicao[cont] = keyb.nextInt();
            keyb.nextLine();
        } */
        for (int cont = 0; cont < time.length; cont++) {
            for (int aux = 0; aux < time.length - 1; aux++) {
                if (posicao[aux] < posicao[aux + 1]) {
                    bolhaInt = posicao[aux];
                    bolhaStr = time[aux];
                    posicao[aux] = posicao[aux + 1];
                    time[aux] = time[aux + 1];
                    posicao[aux + 1] = bolhaInt;
                    time[aux + 1] = bolhaStr;
                }
            }
        }
        System.out.println("Time  ---  Pontuação");
        for (int cont = 0; cont < time.length; cont++) {
            System.out.println(time[cont] + " --- " + posicao[cont]);
        }
        System.out.println("Qual time você deseja procurar? ");
        timePesq = keyb.nextLine();
        System.out.println(timePesq);
        int pos = Arrays.binarySearch(time, timePesq);
        System.out.println(pos);
        if (pos < 0) {
            System.out.println("Time não encontrado!");
        } else {
            if (posicao[pos] >= 0 && posicao[pos] <= 4) {
                status = "na Copa libertadores";
            } else if (posicao[pos] <= 12) {
                status = "na Copa Sul-Americana";
            } else {
                status = "Rebaixada";
            }
            System.out.printf("%s  está %s", time, status);
        }
    }
}