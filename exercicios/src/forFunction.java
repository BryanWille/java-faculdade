import java.util.Scanner;

public class forFunction {
    public static void main(String[] args) {
        int opcao, inicio, fim, passo;
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("[0]Sair \n[1]Comando For");
            System.out.println(">>>");
            opcao = keyb.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o número de inicio: ");
                inicio = keyb.nextInt();
                System.out.println("Digite o número de fim: ");
                fim = keyb.nextInt();
                System.out.println("Digite o passo: ");
                passo = keyb.nextInt();
                System.out.println(contador(inicio, fim, passo));
            } else if (opcao != 0) {
                System.out.println("Comando inválido!");
            }
        } while (opcao != 0);
        System.out.println("Fim do programa");
        keyb.close();
    }
    public static String contador(int inicio, int fim, int passo){
        String passos = "";
        if(inicio < fim){
            passo = passo * -1;
        }
        for(int cont = inicio; cont <= fim; cont += passo){
            passos += String.valueOf(cont) +" >> ";
        }
        return passos + "Fim";
    }
}
