package lzw;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File arquivoOriginal = new File("aed3/src/lzw/textos/testeTexto.pgm");
        File arquivoCompactado = new File("aed3/src/lzw/textos/teste-compactado.pgm");
        File arquivoDescompactado = new File("aed3/src/lzw/textos/teste-descompactado.pgm");
        Compressor compressor = new Compressor(arquivoOriginal, arquivoCompactado);

        Descompressor descompressor = new Descompressor(arquivoCompactado, arquivoDescompactado);
    }
}
