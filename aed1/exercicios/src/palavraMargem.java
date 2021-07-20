import java.util.Scanner;

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
            if (opcao.equals("1")){
                System.out.println("Digite a sua frase: ");
                frase = keyb.nextLine();
                System.out.println(formatacao(frase));
            }
            cont ++;
        }while(!opcao.equals("0"));
        System.out.println("Programa Encerrado!");
        keyb.close();
    }
    public static String formatacao(String frase){
        int tamanho = frase.length();
        String formatacao = "";
        frase = "  " + frase + "  ";
        for (int cont = 1; cont <= (tamanho+4); cont++ ){
            formatacao += '~';
        }
        return formatacao +'\n' +frase +'\n' +formatacao;
    }
}
