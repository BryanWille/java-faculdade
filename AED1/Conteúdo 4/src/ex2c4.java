import java.util.Scanner;
public class ex2c4 {
    public static void main(String[] args) {
        String nome, identidade, cpf, tituloEleitor, carteiraMotorista, nomeEmpresa;
        double salario;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = keyboard.nextLine();
        System.out.println("Digigte seu CPF:");
        cpf = keyboard.nextLine();
        System.out.println("Digite a sua Carteira de Identidade: ");
        identidade = keyboard.nextLine();
        System.out.println("Digite o seu Titulo de Eleitor");
        tituloEleitor = keyboard.nextLine();
        System.out.println("Digite a sua Carteira de Motorista: ");
        carteiraMotorista = keyboard.nextLine();
        System.out.println("Digite o nome da empresa: ");
        nomeEmpresa = keyboard.nextLine();
        System.out.println("Digite o seu salário: ");
        salario = keyboard.nextDouble();
        keyboard.close();
        System.out.println();
        System.out.print("FICHA FUNCIONAL DE: " +nome );
        System.out.print("\n");
        System.out.print("\nDocumentos: ");
        System.out.print("\nCPF...........................................   " +cpf);
        System.out.print("\nCarteira de Identidade........................   " + identidade);
        System.out.print("\nTitulo de Eleitor.............................   " +tituloEleitor);
        System.out.print("\nCarteira de Motorista.........................   " +carteiraMotorista);
        System.out.print("\n");
        System.out.print("\nEmpresa: " +nomeEmpresa +"\nSalário: R$" +salario);
        System.out.print("\n                            Fim");
    }

}
