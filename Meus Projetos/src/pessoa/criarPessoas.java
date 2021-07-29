package pessoa;

public class criarPessoas {
    public static void main(String[] args) {
        Pessoa bryan = new Pessoa();
        bryan.nome = "Bryan";
        bryan.anoNasc = 2002;
        bryan.ocupacao = "Editor de Vídeos";

        System.out.println(Pessoa.calcularIdade());

    }
}
