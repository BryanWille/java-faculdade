import java.util.Scanner;

public class areaRetangulo {
    public static void main(String[] args) {
        double largura = 0, altura = 0;
        int opcao;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos calcular a área de um retângulo: ");
        do {
            System.out.println("Você quer saber a área? \n[0]Não \n[1]Sim");
            System.out.print(">>>");
            opcao = keyb.nextInt();
            if(opcao == 1){
                System.out.println("Digite a largura: ");
                largura = keyb.nextInt();
                System.out.println("Digite a altura: ");
                altura = keyb.nextInt();
                System.out.println("O valor da área do retângulo foi: "+area(largura, altura));
            } else if(opcao != 0) {
                System.out.println("\n\nValor inválido\n\n");
            }
        } while(opcao != 0);
        System.out.println("Fim do programa! ");
    }
    public static double area(double largura, double altura){
        return largura * altura;
    }

}
