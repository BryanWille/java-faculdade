package Exercicios;

import java.io.*;

public class Exerc4 {
    public static void main(String[] args) throws IOException{
        double[] valores = {1.23, 1.31, 21.41, 123.45, 123.623};
        writeData(valores, "coxinha");
        double[] val = readData("coxinha");
        for(double numeros : val ){
            System.out.println(numeros);
        }

    }

    public static void writeData(double[] data, String nome_arq) throws IOException{
        FileOutputStream arquivo = new FileOutputStream(nome_arq);
        DataOutputStream escrever = new DataOutputStream(arquivo);
        escrever.writeInt(data.length);
        for (double datum : data) {
            escrever.writeDouble(datum);
        }
    }

    public static double[] readData (String nome_arq) throws IOException{
        FileInputStream arquivo = new FileInputStream(nome_arq);
        DataInputStream ler = new DataInputStream(arquivo);
        double[] valores = new double[ler.readInt()];
        for(int i = 0; i < valores.length; i++){
            valores[i] = ler.readDouble();
        }
        return valores;
    }

}
