package Pessoa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPessoaTelefone {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream ler = new ObjectInputStream(new FileInputStream("pessoalTel.dat"));
            PessoaComTelefone[] pessoa = new PessoaComTelefone[ler.readInt()];
            for(int i = 0; i < pessoa.length; i++){
                pessoa[i] = (PessoaComTelefone) ler.readObject();
            }
            ler.close();
            System.out.println("Lista de Pessoas");
            System.out.println("----------------");
            for(PessoaComTelefone pessoas : pessoa){
                System.out.println(pessoas);
            }
        } catch (IOException e){
            System.out.println("Erro de E/S...");
        }
    }
}
