package parImpar;

import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;

public class ParOuImpar {
    public static void main(String[] args) throws IOException {
        String msg = "Jogo Par ou Ímpar", nomeArquivo;
        String[] opcoesString = {"Sim", "Não"};

        int opcaoInt = JOptionPane.showOptionDialog(null, "Você já tem algum save? ", msg,
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesString, opcoesString[0]);


        ArrayList<Integer> jogo = new ArrayList<>();

        if (opcaoInt == 0) {
            nomeArquivo = JOptionPane.showInputDialog(null, "Digite o nome do arquivo: ", msg, JOptionPane.QUESTION_MESSAGE);
            jogo = lerArquivo(nomeArquivo);
            JOptionPane.showMessageDialog(null, resultados(jogo), msg, JOptionPane.QUESTION_MESSAGE);
        } else {
            nomeArquivo = JOptionPane.showInputDialog(null, "Qual será o nome do seu arquivo: ", msg, JOptionPane.QUESTION_MESSAGE);
        }
        String[] opcoesJogo = {"Par", "Ímpar", "Sair do Jogo"};
        int opcaoJogador;
        do {
            int opcaoPc = (int) (Math.random() * 10);
            opcaoJogador = JOptionPane.showOptionDialog(null, "Você quer Par ou Ímpar? ", msg, JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoesJogo, opcoesJogo[0]);
            String nomeOpcaoPc = (opcaoPc % 2 == 0) ? "Par" : "Ímpar";
            if (opcaoJogador != 2) {
                if ((opcaoJogador == 0 && opcaoPc % 2 == 1) || (opcaoJogador == 1 && opcaoPc % 2 == 1)) {
                    JOptionPane.showMessageDialog(null, "O Computador Selecionou " +nomeOpcaoPc +", então você Perdeu!", msg, JOptionPane.INFORMATION_MESSAGE);
                    jogo.add(0);
                } else {
                    JOptionPane.showMessageDialog(null, "O Computador Selecionou " +nomeOpcaoPc +", então você Ganhou!", msg, JOptionPane.INFORMATION_MESSAGE);
                    jogo.add(1);
                }
            }
        } while (opcaoJogador != 2);
        criarArquivo(nomeArquivo, jogo);
        JOptionPane.showMessageDialog(null, resultados(jogo), msg, JOptionPane.INFORMATION_MESSAGE);
    }

    public static ArrayList<Integer> lerArquivo(String nome) throws IOException {
        nome += ".dat";
        FileInputStream arquivo = new FileInputStream(nome);
        DataInputStream ler = new DataInputStream(arquivo);
        //int[] result = new int[ler.readInt()];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < ler.readInt(); i++) {
            result.add(ler.readInt());
        }
        return result;
    }

    public static void criarArquivo(String nome, ArrayList<Integer> result) throws IOException {
        nome += ".dat";
        FileOutputStream arquivo = new FileOutputStream(nome);
        DataOutputStream escrever = new DataOutputStream(arquivo);
        escrever.writeInt(result.size());
        for (Integer num : result) {
            escrever.writeInt(num);
        }
    }

    public static String resultados(ArrayList<Integer> resultados){
        int pc = 0, usuario = 0;
        for(int i = 0; i < resultados.size(); i++){
            if(resultados.get(i) == 0){
                pc ++;
            } else {
                usuario ++;
            }
        }
        return ("O Computador ganhou: " +pc +" vezes\n" +"Você ganhou: " +usuario +" vezes!");
    }
}
