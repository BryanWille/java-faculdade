import java.util.Scanner;
public class ex3c4 {
    public static void main(String[] args) {
        long var1, var2;
        double var3, var4, var5;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite o valor minimo de poluente: ");
        var1 = keyboard.nextLong();
        System.out.println("Digite o valor da multa inicial de poluente: ");
        var3 = keyboard.nextDouble();
        System.out.println("Digite o valor intermediário 'de " +var1 +" até ... de poluente: ");
        var2 = keyboard.nextLong();
        System.out.println("Digite o valor da multa correspondente: ");
        var4 = keyboard.nextDouble();
        System.out.println("Digite o valor final da multa de poluente: ");
        var5 = keyboard.nextDouble();
        System.out.println("_______________________________________________________________________");
        System.out.println("           Quantidade de Poluente Emitido x Valor da Multa             ");
        System.out.println("_______________________________________________________________________");
        System.out.println("Até " +var1 +" multa de R$" +var3);
        System.out.println("_______________________________________________________________________");
        System.out.println("Acimae " +var1 +" até " +var2 +" a multade R$" +var4);
        System.out.println("_______________________________________________________________________");
        System.out.println("Acima " +var2 +" a multa de R$" +var5 + "Por poluente emitido");
        System.out.println("_______________________________________________________________________");
        keyboard.close();
    }

}
