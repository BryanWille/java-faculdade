package Ex1;

public class Main {
    public static void main(String[] args){
        Funcionario Bryan = new Funcionario("Bryan Wille", 923.3f);
        Funcionario Henrique = new Funcionario("Henrique Augusto", 2913f);
        Funcionario Peter = new Funcionario("Peter Parker", 0f);
        Funcionario Ash = new Funcionario("Ash Ketchion", 230f);
        Funcionario Quinn = new Funcionario("Quinn Valor", 3170f);


        Lista listaFuncionario = new Lista();
        listaFuncionario.adicionar(Bryan);
        listaFuncionario.adicionar(Henrique);
        listaFuncionario.adicionar(Peter);
        listaFuncionario.adicionar(Ash);
        listaFuncionario.adicionar(Quinn);

        listaFuncionario.imprimirLista();

        listaFuncionario.remover(2);

        System.out.println(listaFuncionario.buscar(3));
        System.out.println(listaFuncionario.buscar(22));
        System.out.println(listaFuncionario.contem("Bryan Wille"));
        System.out.println(listaFuncionario.contem("Trundle"));


    }
}
