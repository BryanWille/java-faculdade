package Pessoa;

import java.io.*;

public class ReadPessoaTel {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("telefones.dat"));
            PessoaComTel[] vetor = new PessoaComTel[in.readInt()];
            for(int i = 0; i < vetor.length; i++){
                vetor[i] = (PessoaComTel) in.readObject();
            }
            in.close();
            System.out.println("\nLista de Pessoas");
            System.out.println("------------------");
            for(Pessoa vet : vetor){
                System.out.println(vet);
            }
        } catch (IOException e){

        }
    }
}
