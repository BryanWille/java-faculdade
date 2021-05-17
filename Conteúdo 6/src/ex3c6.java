import java.util.Scanner;

public class ex3c6 {
    public static void main(String[] args) {
        double vendas, salario, comissao;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos calcular a sua comissão!");
        System.out.print("\nDigite o valor mensal vendido: ");
        vendas = keyb.nextDouble();
        if (vendas <= 1000) {
            comissao = 0;
            salario = 240;
        } else {
            if (vendas > 1000 && vendas < 10000) {
                comissao = vendas * 0.10;
                salario = 240 + comissao;
            } else {
                comissao = 1000;
                salario = 240 + comissao;
            }
        }
        keyb.close();
        System.out.println("A sua comissão foi de R$" + comissao);
        System.out.println("E o seu salário é de R$" + salario);
    }
}
