import java.util.Scanner;

public class fat {
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite o número que você deseja saber o fatorial: ");
        int num = keyb.nextInt();
        System.out.println("O seu fatorial é: " +fatorialInterativo(num));
        keyb.close();
    }

    public static int fatorialInterativo(int num) {
        int fat = 1;
        for (int cont = 1; cont <= num; cont++) {
            fat *= cont;
        }
        return fat;
    }
}
