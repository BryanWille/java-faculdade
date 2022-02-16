package Ex1;

public class Lista{
    private Funcionario[] funcionarios = new Funcionario[100];
    private int tamanho;

    public void adicionar(Funcionario func){
        funcionarios[tamanho] = func;
        this.tamanho++;

    }

    public Funcionario buscar(int posicao){
        if(this.tamanho < posicao){
            System.out.println("Erro posição não encontrada!");
        } else {
            System.out.println("Funcionário encontrado");

        }
    }

    public void remover(int posicao){
    }

    public boolean contem(String nome){
    }

    public int tamanho(){
    }

    public void imprimirLista(){
    }



}
