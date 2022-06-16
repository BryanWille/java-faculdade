package lzw;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Compressor {
    private LinkedHashMap<String, Integer> dicionario = new LinkedHashMap<>();
    private int tam = 0;
    private BufferedWriter escrever;

    private BufferedReader ler;


    public Compressor(File arquivoOriginal, File arquivoComprimido) throws IOException {
        ler = new BufferedReader(new InputStreamReader(new FileInputStream( arquivoOriginal)));
        escrever = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivoComprimido)));

        fazerDicionario();

        String texto, todoTexto = "";
        while ((texto = ler.readLine()) != null) todoTexto += texto;

        lzw(todoTexto);
        escrever.close();


    }

    private void fazerDicionario() {
        while (tam < 256) {
            dicionario.put(String.valueOf((char) tam), tam);
            tam++;
        }
    }

    private void lzw(String texto) throws IOException {
        ArrayList<Integer> sc = new ArrayList<>();
        String p = "";
        char c;
        char[] elementos = texto.toCharArray();
        for (char elemento : elementos) {
            c = elemento;
            if (dicionario.get(p + c) != null) {
                p = p + c;
            } else {
                escreverComprimido(dicionario.get(p));
                dicionario.put(p+c, tam++);
                p = String.valueOf(c);
            }
        }
        escreverComprimido(dicionario.get(p));
    }

    private void escreverComprimido(int num) throws IOException {
        escrever.write(num +" ");
    }

}
