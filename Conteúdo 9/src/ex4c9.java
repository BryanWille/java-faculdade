import java.util.Scanner;

public class ex4c9 {
    public static void main(String[] args) {
        double somatorio = 0;
        int repeticoes;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Quantas repetições da série: 1*2/3*4 + 5*6/7*8 + 9*10/11*12...: você quer?");
        repeticoes = keyboard.nextInt();
        for (double c = 1; repeticoes >= c; c++) {
            somatorio += (((c * 4) - 3) * ((c * 4) - 2)) / (((c * 4) - 1) * (c * 4));
        }
        somatorio = Math.sqrt(somatorio);
        System.out.println("O Valor da série n foi: " + somatorio);
        keyboard.close();
    }
}