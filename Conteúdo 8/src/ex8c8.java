import java.util.Scanner;

public class ex8c8 {
    public static void main(String[] args) {
        int nota, falta = 0, quantFalt = 0, quantMedia = 0, somaMedia = 0;
        Double media;
        Scanner keyb = new Scanner(System.in);
        for (int cont = 1; 3 >= cont; cont++) {
            System.out.println(cont + ". digite a nota do aluno: ");
            nota = keyb.nextInt();
            System.out.println(cont + ". digite a quantidade de faltas: ");
            falta = keyb.nextInt();
            if (nota >= 65 && 16 > falta) {
                System.out.println(cont + ". ALUNO APROVADO!");
                quantMedia += 1;
                somaMedia += nota;
            } else {
                System.out.println("ALUNO REPROVADO!");
            }
            if (falta >= 16) {
                quantFalt += 1;
            }
        }
        media = (double) somaMedia / quantMedia;
        System.out.println("A quantidade de media da nota de alunos aprovados é: " + media);
        System.out.println("A quantidade de alunos com mais de 16 faltas é: " + quantFalt);
        keyb.close();
    }
}
