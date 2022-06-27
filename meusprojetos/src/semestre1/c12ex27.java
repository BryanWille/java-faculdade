import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c12ex27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> enderecoLista = new ArrayList<>();
        List<Integer> cpf_lista = new ArrayList<>();
        String endereco;
        int cpf;
        do {
            System.out.println("Digite o endereço: ");
            endereco = teclado.nextLine();
            if (!endereco.equalsIgnoreCase("x")) {
                System.out.println("Digite o cpf: ");
                cpf = teclado.nextInt();
                teclado.nextLine();
                enderecoLista.add(endereco);
                cpf_lista.add(cpf);
            }
        } while (!endereco.equalsIgnoreCase("x"));

        // b)Pedir um CPF qualquer
        int cpfPesquisar;
        System.out.print("Informe o CPF: ");
        cpfPesquisar = teclado.nextInt();
        teclado.nextLine();
        // c)Pesquisar o CPF informado na lista de CPFs;
        int pos = -1;
        for (int aux = 0; aux < cpf_lista.size(); aux++) {
            if (cpf_lista.get(aux) == cpfPesquisar) {
                pos = aux;
                break;
            }
        }
        if (pos == -1)
            System.out.println("O CPF não encontrado!");
        else {
            System.out.println("Nome encontrado na posição " + (pos + 1) + "!");
            System.out.println("Quer atualizá-lo ou removê-lo da lista ((A)Altalização/(R)Remove)?");
            String responda = teclado.nextLine();
            if (responda.equalsIgnoreCase("A")) {
                System.out.print("Peça novo endereço: ");
                endereco = teclado.nextLine();
                enderecoLista.set(pos, endereco);
                System.out.println("Endereço atualizado com sucesso! ");
                // ATUALIZA A LISTA
            }
            if (responda.equalsIgnoreCase("R")) {
                // REMOVE A LISTA
                cpf_lista.remove(pos);
                enderecoLista.remove(pos);
                System.out.println("Removidos com sucesso!");

            }
            for (int aux = 0; aux < cpf_lista.size(); aux++) {
                System.out.println(cpf_lista.get(aux) + "-" + enderecoLista.get(aux));
            }
        }

        teclado.close();
    }
}