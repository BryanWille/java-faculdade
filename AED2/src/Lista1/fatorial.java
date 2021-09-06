package Lista1;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite o número que você deseja saber o fatorial: ");
        int num = /* estou fazendo uma atribuição */ keyb.nextInt();
        System.out.println("O seu fatorial é: " +fatorialRecursivo(num));
    }

    public static int fatorialRecursivo(int num){
        if(num <= 1){
            return 1;
        } else {
            return num * fatorialRecursivo(num-1);
        }
    }

}
