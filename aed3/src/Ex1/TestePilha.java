package Ex1;

public class TestePilha {
    public static void main(String[] args){
        Funcionario Bryan = new Funcionario("Bryan Wille", 923.3f);
        Funcionario Henrique = new Funcionario("Bruno Augusto", 2913f);
        Funcionario Peter = new Funcionario("Bruna Parker", 0f);
        Funcionario Ash = new Funcionario("Bronze Ketchion", 230f);
        Funcionario Quinn = new Funcionario("Barraco Valor", 3170f);

        Pilha pilhaFuncionarios = new Pilha();
        pilhaFuncionarios.push(Bryan);
        pilhaFuncionarios.push(Henrique);
        pilhaFuncionarios.push(Peter);
        pilhaFuncionarios.push(Ash);
        pilhaFuncionarios.push(Quinn);

        pilhaFuncionarios.print();

        //System.out.println(pilhaFuncionarios.pop(Bryan));

        //pilhaFuncionarios.print();

    }
}
