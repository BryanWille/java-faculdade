package compressao;

import java.io.*;

public class Compressor {
    private BufferedReader imagemOriginal;
    private BufferedWriter imagemComprimida;
    private int quantidadeCaracteres;


    public Compressor(String localArquivoOriginal, String nomeArquivoComprimido) throws IOException {
        this(localArquivoOriginal, nomeArquivoComprimido, 1024);
    }

    public Compressor(String localArquivoOriginal, String nomeArquivoComprimido, int quantidadeCaracteres) throws IOException {
        this.setQuantidadeCaracteres(quantidadeCaracteres);
        this.setImagemComprimida(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nomeArquivoComprimido))));
        this.setImagemOriginal(new BufferedReader(new InputStreamReader(new FileInputStream(localArquivoOriginal))));
        comprimir();
    }

    private void escrever(String linhaComprimida) throws IOException {
        this.imagemComprimida.newLine();
        this.imagemComprimida.write(linhaComprimida);
    }

    private void comprimir() throws IOException {
        // ================= LEITURA CABEÇALHO =================
        String cabecalho = imagemOriginal.readLine();     // Tipo de arquivo (P2 ou P5)
        String resolucao = imagemOriginal.readLine();     // Resolução da Tela
        String escalaCinza = imagemOriginal.readLine();   // Até que escala vai o cinza 0-255

        // ================= ESCRITA CABEÇALHO =================
        this.imagemComprimida.write(cabecalho + "*" + resolucao + "*" + escalaCinza + "*"); //Cabeçalho comprimido = 'tipo de arquivo * resolução * escala de cinza'

        // ================= LEITURA LINHAS =================
        String linhaTemp;
        while ((linhaTemp = imagemOriginal.readLine()) != null) {
            linhaTemp = linhaTemp.replaceAll("\\s+", " ");  // remove todos os espaços e substitui por apenas um

            while (linhaTemp.length() <= quantidadeCaracteres) {             // Enquanto linhaTemp não tiver um tamanho minimo, a compressão não inicia
                linhaTemp += " " +imagemOriginal.readLine();
            }
            String compressao = comprimirLinhar(linhaTemp);
            //System.out.println("Antes: " + linhaTemp + "\n" + "Depois: " + compressao
            //        + "\n========================================================" + "\n");
            this.escrever(compressao);

        }
        imagemComprimida.close();
    }

    private String comprimirLinhar(String linha) {
        String compresso = "";
        String[] comparar = linha.split(" "); // Ordena elementos da linha em um vetor
        int cont = 1;
        for (int i = 0; comparar.length > i; i++) {
            if (i + 1 < comparar.length && comparar[i].equals(comparar[i + 1])) { // se for menor que length e i == i+1
                cont++;
            } else {
                if (cont > 1)
                    compresso += cont  +"$" +comparar[i] + " "; // coloca a chave "$" para significar que aquilo está comprimido
                else compresso += comparar[i] + " "; // se for cont == 1, então não tem pq imprimir ele ser um
                cont = 1;
            }
        }
        return compresso;
    }

    public BufferedReader getImagemOriginal() {
        return imagemOriginal;
    }

    public void setImagemOriginal(BufferedReader imagemOriginal) {
        this.imagemOriginal = imagemOriginal;
    }

    public BufferedWriter getImagemComprimida() {
        return imagemComprimida;
    }

    public void setImagemComprimida(BufferedWriter imagemComprimida) {
        this.imagemComprimida = imagemComprimida;
    }

    public int getQuantidadeCaracteres() {
        return quantidadeCaracteres;
    }

    public void setQuantidadeCaracteres(int quantidadeCaracteres) {
        this.quantidadeCaracteres = quantidadeCaracteres;
    }
}