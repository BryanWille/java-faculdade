package Lista1;

import java.util.Scanner;

public class potencia {
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int numero = keyb.nextInt();
        System.out.println("Digite a sua potência: ");
        int potencia = keyb.nextInt();

        System.out.println(potenciaRecursiva(numero, potencia));
    }

    public static int potenciaRecursiva(int numero, int potencia){
        if(potencia < 1){
            return 1;
        } else {
            return numero * potenciaRecursiva(numero, potencia - 1);
        }
    }
}
