import java.util.Scanner;

public class Competicao {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String quantidadeGeral;

        do{
            quantidadeGeral = keyb.nextLine();
            if(!quantidadeGeral.equalsIgnoreCase("0 0")){
                boolean zerou = false, fechou = false, nenhumAcertou = false;
                int menor = 0, maior = 0, cont, checklist = 0, todoProb = 0;

                int quantPlayer = Integer.parseInt(quantidadeGeral.substring(0, quantidadeGeral.indexOf(" ")));
                int quantQuest = Integer.parseInt(quantidadeGeral.substring(quantidadeGeral.indexOf(" ")+1));
                int[][] jogador = new int[quantPlayer][quantQuest];
                for(int i = 0; i < quantPlayer; i++){
                    cont = 0;
                    String[] jogo = keyb.nextLine().split(" ");
                    for(int j = 0; j < quantQuest; j++){
                        jogador[i][j] = Integer.parseInt(jogo[j]);
                        cont += jogador[i][j];
                        if(maior < cont){
                            maior = cont;
                        } else if (menor > cont){
                            menor = cont;
                        }
                    }
                    if (cont == 0){
                        zerou = true;
                    } else if (cont == quantQuest){
                        fechou = true;
                    }
                }


                for(int i = 0; i < quantQuest; i++){
                    int somaColuna = 0;
                    for(int j = 0; j < quantPlayer; j++){
                        somaColuna += jogador[j][i];
                    }
                    if(somaColuna > 0){
                        nenhumAcertou = true;
                        todoProb++;
                    }
                }

                if(!zerou) checklist++;
                if(!fechou) checklist++;
                if(nenhumAcertou) checklist++;
                if(todoProb == quantQuest) checklist++;
                System.out.print(checklist +"\n");

            }

        } while (!quantidadeGeral.equals("0 0"));

    }
}
