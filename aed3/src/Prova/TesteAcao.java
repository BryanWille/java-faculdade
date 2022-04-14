package Prova;

import java.io.*;

public class TesteAcao {

    public static void main(String args[]) throws IOException, ClassNotFoundException {

        String ACOES_FILE_NAME = "acoes.dat";
        String MOVIMENTACOES_FILE_NAME = "movimentacoes.dat";

        Acao[] acoes = readAcoesFake();
        writeAcoes(ACOES_FILE_NAME, acoes);
        readAcoes(ACOES_FILE_NAME);

        Movimentacao[] movimentacoes = readMovimentacoesFake();
        writeMovimentacoes(MOVIMENTACOES_FILE_NAME, movimentacoes);
        readMovimentacoes(MOVIMENTACOES_FILE_NAME);

        Acao acao10 = getAcaoInFile(10, ACOES_FILE_NAME);
        conciliacao(acao10, MOVIMENTACOES_FILE_NAME);

        Acao acao11 = getAcaoInFile(11, ACOES_FILE_NAME);
        conciliacao(acao11, MOVIMENTACOES_FILE_NAME);

        Acao acao15 = getAcaoInFile(15, ACOES_FILE_NAME);
        conciliacao(acao15, MOVIMENTACOES_FILE_NAME);

        Acao acao17 = getAcaoInFile(17, ACOES_FILE_NAME);
        conciliacao(acao17, MOVIMENTACOES_FILE_NAME);

        Acao acao21 = getAcaoInFile(21, ACOES_FILE_NAME);
        conciliacao(acao21, MOVIMENTACOES_FILE_NAME);
    }

    public static Acao[] readAcoesFake() {
        Acao[] vet = new Acao[5];

        vet[0] = new Acao(10, "ITAÚ UNIBANCO PN", 25.33f);
        vet[1] = new Acao(11, "BRADESCO PN", 22.8f);
        vet[2] = new Acao(15, "AZUL PN", 29.21f);
        vet[3] = new Acao(17, "B3 ON", 14.6f);
        vet[4] = new Acao(21, "BR MALLS PART ON", 9.63f);

        return vet;
    }

    public static void writeAcoes(String fileName, Acao[] acoes) throws IOException {
        ObjectOutputStream escrever = new ObjectOutputStream(new FileOutputStream(fileName));
        escrever.writeInt(acoes.length);
        for (Acao val : acoes) {
            escrever.writeObject(val);
        }
    }

    public static void readAcoes(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(fileName));
        int size = entrada.readInt();
        Acao[] val = new Acao[size];
        for (int i = 0; i < size; i++) {
            val[i] = (Acao) entrada.readObject();
            System.out.println(val[i]);

        }
    }

    public static Movimentacao[] readMovimentacoesFake() {
        Movimentacao[] vet = new Movimentacao[10];
        vet[0] = new Movimentacao(10, 'a', 1);
        vet[1] = new Movimentacao(21, 'b', 2.5f);
        vet[2] = new Movimentacao(17, 'a', 3.0f);
        vet[3] = new Movimentacao(15, 'b', 2.0f);
        vet[4] = new Movimentacao(10, 'a', 4.0f);
        vet[5] = new Movimentacao(11, 'a', 10.0f);
        vet[6] = new Movimentacao(21, 'a', 3.5f);
        vet[7] = new Movimentacao(11, 'b', 8.0f);
        vet[8] = new Movimentacao(17, 'b', 5.0f);
        vet[9] = new Movimentacao(10, 'b', 3.0f);
        return vet;
    }

    public static void writeMovimentacoes(String fileName, Movimentacao[] movimentacoes) throws IOException {
        ObjectOutputStream escrever = new ObjectOutputStream(new FileOutputStream(fileName));
        escrever.writeInt(movimentacoes.length);
        for (Movimentacao val : movimentacoes) {
            escrever.writeObject(val);
        }
    }

    public static void readMovimentacoes(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(fileName));
        int size = entrada.readInt();
        Movimentacao[] val = new Movimentacao[size];
        for (int i = 0; i < size; i++) {
            val[i] = (Movimentacao) entrada.readObject();
            System.out.println(val[i]);
        }
    }

    public static Acao getAcaoInFile(int idAcao, String acoesFileName) throws IOException, ClassNotFoundException {
        Acao temp = null;
        ObjectInputStream entr = new ObjectInputStream(new FileInputStream(acoesFileName));
        int size = entr.readInt();
        Acao[] val = new Acao[size];
        for (int i = 0; i < size; i++) {
            val[i] = (Acao) entr.readObject();
            if (val[i].getCodigoAcao() == idAcao) {
                temp = val[i];
            }
        }
        return temp;
    }

    public static void conciliacao(Acao acao, String transacoesFileName) throws IOException, ClassNotFoundException {
        ObjectInputStream escr = new ObjectInputStream(new FileInputStream(transacoesFileName));
        int size = escr.readInt();
        Movimentacao[] val = new Movimentacao[size];
        for (int i = 0; i < size; i++) {
            val[i] = (Movimentacao) escr.readObject();
            if (acao.getCodigoAcao() == val[i].getCodigoAcao()) {
                float valorAntigo = acao.getValorAcao();
                String valor = " ";
                if (val[i].getMovimentacao() == 'a') {
                    acao.setValorAcao(acao.getValorAcao() + val[i].getValorMovimentacao());
                    valor = "valorizou";
                } else {
                    acao.setValorAcao(acao.getValorAcao() - val[i].getValorMovimentacao());
                    valor = "desvalorizou";
                }
                System.out.println("A ação: " + acao.getTexto() + " que valia R$" + valorAntigo + " agora " + valor + " e está valendo: R$" + acao.getValorAcao());
            }
        }
    }
}