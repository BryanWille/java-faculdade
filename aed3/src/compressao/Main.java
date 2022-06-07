package compressao;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        String arquivoOriginal = "aed3/src/compressao/imgs/dragon.pgm";
        String arquivoSaida = "aed3/src/compressao/imgs/dragon-compressed.pgm";
        String arquivoDescomprimido = "aed3/src/compressao/imgs/dragon-descomprimido.pgm";

        BufferedWriter arquivocsv = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("aed3/src/compressao/imgs/dragon-data.csv")));
        arquivocsv.write("caracteres, tempo (ms), tamanho (kb)");
        arquivocsv.newLine();

        for (int i = 0; i <= 12000; i += 200) {
            long start = System.currentTimeMillis();
            Compressor balao = new Compressor(arquivoOriginal, arquivoSaida , i);
            long elapsed = System.currentTimeMillis() - start;

            File arquivo = new File(arquivoSaida);
            long kbytes = arquivo.length();
            String tamanho = String.format("%,d", kbytes / 1024);

            String linha = i + ", " + elapsed + "," + tamanho;
            arquivocsv.write(linha);
            arquivocsv.newLine();


        }
        arquivocsv.close();


        //Compressor balao = new Compressor(arquivoOriginal, arquivoSaida , 12000);
        Uncompressor unc = new Uncompressor(arquivoSaida, arquivoDescomprimido);

    }

    /*

         */
}