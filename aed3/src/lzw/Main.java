package lzw;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String arquivoOriginal = "aed3/src/lzw/imgs/lena.pgm";
        String arquivoSaida = "aed3/src/lzw/imgs/lena-compressed.pgm";
        String arquivoDescomprimido = "aed3/src/lzw/imgs/dragon-descomprimido.pgm";
        Compressor comp = new Compressor(arquivoOriginal, arquivoSaida);
        //Uncompressor unc = new Uncompressor(arquivoSaida, arquivoDescomprimido);


    }
}