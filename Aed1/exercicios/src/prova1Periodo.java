import java.util.Scanner;

public class prova1Periodo {
    public static void main(String[] args){
        Scanner tecl = new Scanner(System.in);
        String[][] notas = new String[50][25];
        String[] gabarito = new String[25];
        int[] nota = new int[50];
        for (int i = 0; i < gabarito.length; i++){
            System.out.println("Digite o gabarito da questão" +i +" : ");
            String notaGabarito = tecl.nextLine();
            gabarito[i] = notaGabarito;
        }

        for(int i = 0; i < notas.length; i++){
            int notaAluno = 0;
            for(int j = 0; j < gabarito.length; j++){
                if(notas[i][j].equals(gabarito[j])){
                    notaAluno++;
                }
            }
            nota[i] = notaAluno;
        }

        for(int i = 0; i < notas.length; i++){
            System.out.println("O Aluno [" +i +"] tirou " +nota[i] +" pontos!" );
            String status = nota[i] >= 20 ? "APROVADO" : "REPROVADO";
            System.out.println("Aluno " +status);
        }

        tecl.close();
    }

}
