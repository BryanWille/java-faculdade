import java.util.Scanner;

public class ex9c5 {
    public static void main(String[] args) {
        double n1, n2, n3, media;
        String nome;
        Scanner keyb = new Scanner(System.in);
        System.out.print("Calculdor da média de um aluno!");
        System.out.print("\nDigite o nome do aluno: ");
        nome = keyb.nextLine();
        System.out.print("\nDigite a primeira nota: ");
        n1 = keyb.nextDouble();
        System.out.print("\nDigite a segunda nota: ");
        n2 = keyb.nextDouble();
        System.out.print("\nDigite a terceira nota: ");
        n3 = keyb.nextDouble();
        media = (n1 * 2 + n2 * 3 + n3 * 5) / (2 + 3 + 5f);
        System.out.print("\nA média do aluno " + nome + " foi de " + media + "!");
        keyb.close();
    }
}
