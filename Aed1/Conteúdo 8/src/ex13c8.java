import java.util.Scanner;

public class ex13c8 {
    public static void main(String[] args) {
        String cidade, nomeMenor = "";
        int populacao, eleitores, mulheres, homens, milhao = 0, maisMulher = 0, menor = 0;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos tirar informa��es de 858 cidades de Minas Gerais!");
        for (int contador = 1; 5 >= contador; contador++) {
            System.out.println("Digite o nome da cidade: ");
            cidade = keyb.nextLine();
            System.out.println("Digite a popula��o total: ");
            populacao = keyb.nextInt();
            System.out.println("Digite a quantidade de eleitores: ");
            eleitores = keyb.nextInt();
            System.out.println("Digite a quantidade de homens: ");
            homens = keyb.nextInt();
            System.out.println("Digite a quantidade de mulheres: ");
            mulheres = keyb.nextInt();
            if ((homens + mulheres) != populacao) {
                System.out.println("A soma da popula��o masculina e feminina � diferente da popula��o total!");
            }
            System.out.println("A popula��o de eleitores em rela��o a popula��o total � de: " + (eleitores * 100f / populacao) + "%");
            if (populacao > 1000000) {
                milhao += 1;
            }
            if (mulheres > homens) {
                maisMulher += 1;
            }
            if (contador == 1 || menor > populacao) {
                menor = populacao;
                nomeMenor = cidade;
            }
            keyb.nextLine();
        }
        keyb.close();
        System.out.println("Quantidades de cidades com mais de 1 milh�o de habitantes = " + milhao);
        System.out.println("Cidades com mais mulheres que homens = " + maisMulher);
        System.out.println("Cidade com menor popula��o � " + nomeMenor);
        System.out.println("Fim!");
    }
}