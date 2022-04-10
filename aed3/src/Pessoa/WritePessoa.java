package Pessoa;

import java.io.*;

public class WritePessoa {
    public static void main(String[] args) throws IOException {
        int numElem = 2;
        //Pessoa[] vetor = consoleReadPessoa(numElem);
        Pessoa[] vetor = readVetorPessoa();

        try{
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("person.dat"));
            out.writeInt(vetor.length);
            for(Pessoa alunos : vetor){
                out.writeObject(alunos);
            }

        } catch (IOException e){
            System.out.println("Erro de E/S\n");
        }
    }

    public static Pessoa[] consoleReadPessoa(int numElem) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int id;
        Pessoa[] vet = new Pessoa[numElem];
        for (int i = 0; i < numElem; i++) {
            String nome;
            System.out.println("\nEntre com os dados da " + (i + 1) + "a. pessoa");
            System.out.println("Id: ");
            id = Integer.parseInt(in.readLine());
            System.out.println("Nome: ");
            nome = in.readLine();
            vet[i] = new Pessoa(id, nome);
        }

        return vet;
    }

    private static Pessoa[] readVetorPessoa() throws IOException{
        Pessoa[] vet = new Pessoa[5];
        vet[0] = new Pessoa(10, "Maria Cláudia Santos");
        vet[1] = new Pessoa(11, "Ana Paula Souza");
        vet[2] = new Pessoa(15, "João Fernando Silva");
        vet[3] = new Pessoa(17, "Pedro Cardoso Queiroz");
        vet[4] = new Pessoa(21, "Beatriz Miranda de Oliveira");
        return vet;
    }

}
