package lzw;

import java.io.*;
import java.util.*;

public class lzw {
    static LinkedHashMap<String, Integer> dicionario = new LinkedHashMap<String, Integer>();
    static int tam = 255;

    public static void main(String[] args) {
        fazerDict();
        System.out.println(lzw("aaaaaaaab"));

    }

    static void fazerDict() {
        for (int i = -128; i < 128; i++) {
            dicionario.put(String.valueOf((char) i), i);
        }
    }

    static String lzw(String texto) {
        String[] elementos = texto.split("");
        int i = 0;
        String comprimido = " ", p = "", c="";
        while (i < elementos.length) {
            c = elementos[i];
            if (existeDicionario(p + c))
                p += c;
            else {
                comprimido = (p + " ");
                System.out.print(comprimido);
                adicionarDict(p + c);
                p = c;
            }
            i++;
        }
        comprimido = p;
        return comprimido;
    }

    static boolean existeDicionario(String texto) {
        return dicionario.get(texto) != null;
    }

    static void adicionarDict(String texto){
        tam += 1;
        dicionario.put(texto, tam);
    }
}
