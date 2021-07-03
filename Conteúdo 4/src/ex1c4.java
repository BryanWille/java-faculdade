import java.util.Scanner;

public class ex1c4 {
    public static void main(String[] args) {
        String sobrenome, primeiroNome, segundoNome;
        byte idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu Primeiro Nome: ");
        primeiroNome = teclado.nextLine();
        System.out.println("Digite seu Nome do Meio: ");
        segundoNome = teclado.nextLine();
        System.out.println("Digite seu Sobrenome: ");
        sobrenome = teclado.nextLine();
        System.out.println(("Digite sua idade: "));
        idade = teclado.nextByte();
        System.out.println(sobrenome +", " +primeiroNome +" " +segundoNome);
        System.out.println("Idade: " +idade + " anos.");
        teclado.close();
    }

}
