package Pessoa;

import java.io.*;

public class WritePessoaTelefone {
    public static void main(String[] args) throws IOException {
        int numElem = 3;
        PessoaComTelefone[] vet = consoleReadPessoaComTel(numElem);
        //PessoaComTelefone[] vet = readVetorPessoaTel(numElem);

        try{
            ObjectOutputStream escrever = new ObjectOutputStream( new FileOutputStream("pessoalTel.dat"));
            escrever.writeInt(vet.length);
            for(PessoaComTelefone pessoas : vet){
                escrever.writeObject(pessoas);
            }
            escrever.close();
        } catch( IOException e){
            System.out.println("Erro de E/S");
        }
    }

    private static PessoaComTelefone[] consoleReadPessoaComTel(int numElem) throws IOException{
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        PessoaComTelefone[] vet = new PessoaComTelefone[numElem];
        for(int i = 0; i < vet.length; i++){
            int id, numTel;
            String nome, tel;
            System.out.print("Digite o nome da " +(i+1) +". pessoa: ");
            nome = leitor.readLine();
            System.out.print("\tId: ");
            id = Integer.parseInt(leitor.readLine());
            System.out.print("\tQuantidade de telefones: ");
            numTel = Integer.parseInt(leitor.readLine());
            vet[i] = new PessoaComTelefone(id, nome);
            vet[i].setNumTel(numTel);
            System.out.println("-------------");
            for(int j = 0; j < numTel; j++){
                System.out.print("\t\tDigite o "  +(j+1) +"° telefone: ");
                tel = leitor.readLine();
                vet[i].setTel(j, new Telefone(tel));
            }
            System.out.println("=======================\n");
        }
        return vet;
    }

    private static PessoaComTelefone[] readVetorPessoaTel(int numElem) throws IOException{
        PessoaComTelefone[] vet = new PessoaComTelefone[5];

        vet[0] = new PessoaComTelefone(10, "Maria Cláudia Santos");
        vet[0].setNumTel(2);
        vet[0].setTel(0,new Telefone("9999-1234"));
        vet[0].setTel(1,new Telefone("9898-7898"));

        vet[1] = new PessoaComTelefone(11, "Ana Paula Souza");
        vet[1].setNumTel(3);
        vet[1].setTel(0,new Telefone("8888-1234"));
        vet[1].setTel(1,new Telefone("7897-2254"));
        vet[1].setTel(2,new Telefone("9988-7788"));

        vet[2] = new PessoaComTelefone(15, "João Fernando Silva");
        vet[2].setNumTel(1);
        vet[2].setTel(0,new Telefone("9977-1515"));

        vet[3] = new PessoaComTelefone(17, "Pedro Cardoso Queiroz");
        vet[3].setNumTel(2);
        vet[3].setTel(0,new Telefone("3375-1234"));
        vet[3].setTel(1,new Telefone("2425-7898"));

        vet[4] = new PessoaComTelefone(21, "Beatriz Miranda de Oliveira");
        vet[4].setNumTel(1);
        vet[4].setTel(0,new Telefone("3444-2784"));

        return vet;
    }
}
