package Revisao;

public class Main {
    public static void main(String[] args) {
        Funcionario Bryan = new Funcionario("Bryan Wille", 923.3f);
        Funcionario Henrique = new Funcionario("Bruno Augusto", 2913f);
        Funcionario Peter = new Funcionario("Bruna Parker", 0f);
        Funcionario Ash = new Funcionario("Bronze Ketchion", 230f);
        Funcionario Quinn = new Funcionario("Barraco Valor", 3170f);


        Lista listaFuncionario = new Lista();
        listaFuncionario.adicionar(Bryan);
        listaFuncionario.adicionar(Henrique);
        listaFuncionario.adicionar(Peter);
        listaFuncionario.adicionar(Ash);
        listaFuncionario.adicionar(Quinn);
        listaFuncionario.imprimirLista();

        //listaFuncionario.imprimirLista();

        System.out.println(listaFuncionario.buscar(3));
        System.out.println(listaFuncionario.buscar(22));
        System.out.println(listaFuncionario.contem("Bryan Wille"));
        System.out.println(listaFuncionario.contem("Trundle"));


        Funcionario[] ordenado = listaFuncionario.ordemAlfabetica(listaFuncionario.getFuncionarios());
        listaFuncionario.imprimirLista(ordenado);

    }
}
