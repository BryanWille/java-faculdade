package compressao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Compressor {
    private int contLinhas;

    public Compressor(String localArquivo) {
        try {
            FileInputStream arquivo = new FileInputStream(localArquivo);
            this.leitor(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void leitor(FileInputStream arquivo) throws IOException {
        BufferedReader imagem = new BufferedReader(new InputStreamReader(arquivo));
        String cabecalho = imagem.readLine();
        String resolucao = imagem.readLine();
        String escalaCinza = imagem.readLine();
        int contLinhas = 0;
        String linha;
        while ((linha = imagem.readLine()) != null) {
            String comprimido = comprimir(linha);
            System.out.println("Antes: " + linha + "\n" + "Depois: " + comprimido
                    +"\n========================================================" + "\n");
            this.contLinhas++;
        }
    }

    private String comprimir(String linha) {
        String compresso = "";
        String[] comparar = linha.split(" ");
        int cont = 1;
        for (int i = 0; comparar.length > i; i++) {
            if (i + 1 < comparar.length && (comparar[i].equals(comparar[i + 1]))) {
                cont++;
            } else {
                compresso += cont + comparar[i] + " ";
                cont = 1;
            }
        }
        return compresso;
    }

}
