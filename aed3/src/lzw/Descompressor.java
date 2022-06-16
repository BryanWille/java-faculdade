package lzw;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Descompressor {
    private LinkedHashMap<Integer, String> dicionario = new LinkedHashMap<>();
    private int tam = 0;
    private BufferedWriter escrever;
    private BufferedReader ler;

    public Descompressor(File arquivoOriginal, File arquivoDescomprimido) throws IOException {
        ler = new BufferedReader(new InputStreamReader(new FileInputStream(arquivoOriginal)));
        escrever = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivoDescomprimido)));

        fazerDicionario();

        String texto, todoTexto = "";
        while ((texto = ler.readLine()) != null) todoTexto += texto;

        lzw(todoTexto);
        escrever.close();
    }

    private void fazerDicionario() {
        while (tam < 256) {
            dicionario.put(tam, String.valueOf((char) tam));
            tam++;
        }
    }

    private void lzw(String texto) throws IOException {
        String[] elementos = texto.split(" ");
        int cw, pw;
        cw = Integer.parseInt(elementos[0]);
        escreverDescomprimido(dicionario.get(cw));
        String p;
        char c;
        for(int i = 1; i < elementos.length; i++){
            pw = cw;
            cw = Integer.parseInt(elementos[i]);
            if(dicionario.get(cw) != null){
                escreverDescomprimido(dicionario.get(pw));
                p = dicionario.get(pw);
                c = dicionario.get(cw).charAt(0);
                dicionario.put(tam++, p+c);
            } else {
                p = dicionario.get(cw);
                c = dicionario.get(pw).charAt(0);
                escreverDescomprimido(p+c);
                dicionario.put(tam++, p+c);
            }
        }


    }

    private void escreverDescomprimido(String palavra) throws IOException {
        escrever.write(palavra);
    }

}
