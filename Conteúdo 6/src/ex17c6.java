import java.util.Scanner;

public class ex17c6 {
    public static void main(String[] args) {
        String p1, p2, p3, p4, p5, p6, p7, p8, p9;
        Scanner keyb = new Scanner(System.in);
        System.out
                .println("Vamos ver se você está apto para o emprego \nResponda com V para verdadeiro e F para falso");
        System.out.println("Você tem curso técnico de programação? ");
        p1 = keyb.nextLine();
        System.out.println("Você tem curso superior de programação? ");
        p2 = keyb.nextLine();
        System.out.println("Você tem menos de 3 anos de experiência em programação? ");
        p3 = keyb.nextLine();
        System.out.println("Você se considera uma pessoa criativa? ");
        p4 = keyb.nextLine();
        System.out.println("Você prefere liderar a ser liderado? ");
        p5 = keyb.nextLine();
        System.out.println("Você prefere trabalhar sozinho a trabalhar em equipe? ");
        p6 = keyb.nextLine();
        System.out.println("Você é autodidata (aprende sozinho)? ");
        p7 = keyb.nextLine();
        System.out.println("Você aceitaria uma remuneração inicial de R$1500,00? ");
        p8 = keyb.nextLine();
        System.out.println("Você só aceitaria trabalhar em escritórios da empresa \n dentro da grande BH? ");
        p9 = keyb.nextLine();
        System.out.println(p1 + p2 + p3 + p4 + p5 +p6 +p7 +p8 +p9);
        keyb.close();
    }
}
