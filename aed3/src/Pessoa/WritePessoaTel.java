package Pessoa;

import java.io.*;

public class WritePessoaTel {
    public static void main(String[] args) throws IOException {
        int numElem = 2;
        //PessoaComTel[] vetor = consoleReadPessoaComTel(numElem);
        PessoaComTel[] vetor = readVetorPessoaComTel();

        try {
            // Cria stream para escrita de objetos
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("telefones.dat"));
            // Escreve tamanho do vetor
            out.writeInt(vetor.length);
            for (Pessoa pessoa : vetor)
                out.writeObject(pessoa); // Escreve objeto da classe
            // PessoaComTelefone juntamente com
            // os objetos da classe Telefone
            out.close(); // Fecha stream
        } catch (IOException e) {
            System.out.println("Erro de E/S !!!\n");
        }

    }

    private static PessoaComTel[] consoleReadPessoaComTel(int numElem) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String linha, nome;
        int Id, numTel;
        PessoaComTel[] vet = new PessoaComTel[numElem];
        for (int i = 0; i < numElem; i++) {
            System.out.println("\nEntre com dados da " + (i + 1) + "a. pessoa:");
            System.out.print("Id : ");
            linha = in.readLine();
            Id = Integer.parseInt(linha);
            System.out.print("Nome : ");
            linha = in.readLine();
            nome = linha;
            vet[i] = new PessoaComTel(Id, nome);
            System.out.print("Num.Telefones : ");
            linha = in.readLine();
            numTel = Integer.parseInt(linha);
            vet[i].setNumTel(numTel);
            for (int j = 0; j < numTel; j++) {
                System.out.print("\t" + (j + 1) + "o. Numero : ");
                linha = in.readLine();
                vet[i].setTel(j, new Telefone(linha));
            }
        }
        return vet;
    }

    private static PessoaComTel[] readVetorPessoaComTel() throws IOException {
        PessoaComTel[] vet = new PessoaComTel[5];

        vet[0] = new PessoaComTel(10, "Maria Cláudia Santos");
        vet[0].setNumTel(2);
        vet[0].setTel(0,new Telefone("9999-1234"));
        vet[0].setTel(1,new Telefone("9898-7898"));

        vet[1] = new PessoaComTel(11, "Ana Paula Souza");
        vet[1].setNumTel(3);
        vet[1].setTel(0,new Telefone("8888-1234"));
        vet[1].setTel(1,new Telefone("7897-2254"));
        vet[1].setTel(2,new Telefone("9988-7788"));

        vet[2] = new PessoaComTel(15, "João Fernando Silva");
        vet[2].setNumTel(1);
        vet[2].setTel(0,new Telefone("9977-1515"));

        vet[3] = new PessoaComTel(17, "Pedro Cardoso Queiroz");
        vet[3].setNumTel(2);
        vet[3].setTel(0,new Telefone("3375-1234"));
        vet[3].setTel(1,new Telefone("2425-7898"));

        vet[4] = new PessoaComTel(21, "Beatriz Miranda de Oliveira");
        vet[4].setNumTel(1);
        vet[4].setTel(0,new Telefone("3444-2784"));

        return vet;
    }

}
