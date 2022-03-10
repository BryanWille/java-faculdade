package Revisao;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa bryan = new Pessoa("Bryan Wille", 2002, 10, 8, 1.80f);

        System.out.println("Nome: " +bryan.getNome() +"\nNascimento: " +bryan.getNasc()
                +"\nAltura: " +bryan.getAltura() +"\nIdade: " +bryan.idade());

    }
}
