import java.util.Scanner;

public class ex15c6 {
    public static void main(String[] args) {
        String cidade;
        int pacote;
        double extra, total, imposto, fixo, diaria;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos calcular o preço da sua conta!");
        System.out.println("\nQual o seu pacote? \n[1]Basic \n[2]Advanced \n[3]Premium: ");
        pacote = keyb.nextInt();
        System.out.println("Quantos dias você usou o pay-per-view? ");
        diaria = keyb.nextInt();
        System.out.println("Qual foi o valor total de serviços extras? R$");
        extra = keyb.nextDouble();
        keyb.nextLine();
        System.out.println("Qual a sua Cidade? ");
        cidade = keyb.nextLine();
        if (cidade.equalsIgnoreCase("belo horizonte")) {
            imposto = 0;
        } else {
            if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                imposto = 0.015;
            } else {
                if (cidade.equalsIgnoreCase("São Paulo")) {
                    imposto = 0.01;
                } else {
                    imposto = 0.02;
                }
            }

        }
        if (pacote == 1 && (diaria * 1.2) < 65) {
            fixo = 65;
            diaria *= 1.20;
        } else {
            if (pacote == 1 && (diaria * 1.2) >= 65) {
                fixo = 65;
                diaria = 65;
            } else {
                if (pacote == 2) {
                    fixo = 104;
                    diaria *= 2.10;

                } else {
                    fixo = 137;
                    diaria *= 0;
                }
            }
        }
        keyb.close();
        total = fixo + diaria + extra + ((fixo + diaria + extra) * imposto);
        System.out.print("O Valor total da sua conta foi de R$" + total);
        System.out.println("\nFim");
    }
}
