import java.util.Scanner;

public class ex11c5 {
    public static void main(String[] args) {
        int cheque, banco, agencia, sequencial;
        Scanner keyb = new Scanner(System.in);
        System.out.print("Vamos separar os seus numeros do cheque!");
        System.out.print("\nDigite o seu número do cheque: ");
        cheque = keyb.nextInt();
        sequencial = cheque % 1000;
        agencia = (cheque % 1000000) / 1000;
        banco = cheque / 1000000;
        System.out.print("O seu cheque é: " + cheque + "\nBanco é ........." + banco + "\nAgência é ......." + agencia
                + "\nSequencial é ...." + sequencial);
        System.out.print("\nFim");
        keyb.close();
    }
}
