import java.util.Scanner;
import java.io.*;

public class palavraMargem {
    public static void main(String[] args) {
        int cont = 0;
        String frase, opcao = "1";
        Scanner keyb = new Scanner(System.in);
        do {
            if (cont > 0){
                System.out.println("Você quer continuar? \n[0]Não \n[2]Sim");
                System.out.print(">>>");
                opcao = keyb.nextLine();
            }
            System.out.println("Digite a sua frase: ");
            frase = keyb.nextLine();
            if (opcao.equals("1")){
                System.out.println(formatacao(frase));
            }
            cont ++;
        }while(!opcao.equals("0"));
    }
    public static String formatacao(String frase){
        int tamanho = frase.length();
        String formatacao;
        frase = "  " + frase + "  ";
        formatacao = frase.repeat(tamanho);
    }
}
