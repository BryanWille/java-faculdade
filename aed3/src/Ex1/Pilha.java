package Ex1;

public class Pilha {
    private Funcionario[] funcionarios = new Funcionario[100];
    private int tamanho = 0;

    public boolean isEmpty( ) {
        return this.tamanho == 0;
    }

    public void push(Funcionario f) {
        if(tamanho < 100){
            funcionarios[tamanho] = f;
            tamanho++;
        } else {
            System.out.println("ERRO: Tamanho da Pilha Excedido");
        }
    }


    public Funcionario pop( ) {
        Funcionario removido = funcionarios[tamanho-1];
        funcionarios[tamanho-1] = null;
        tamanho--;
        return removido;
    }

    public Funcionario pop(Funcionario f){
        Funcionario ret = null;
        Pilha clone = new Pilha();
        while (this.size() != 0){
            Funcionario aux = this.pop();
            if(aux == f){
                funcionarios[this.tamanho-1] = null;
                ret = f;
            }
            if(aux != null){
                clone.push(aux);
            }
        }
        return ret;
    }

    public boolean contain(String nome) {
        boolean contem = false;
        for(Funcionario func : funcionarios){
            if(func.getNome().equalsIgnoreCase(nome)){
                contem = true;
                break;
            }
        }
        return contem;
    }

    public void print( ) {
        System.out.println("===================================");
        System.out.println("===========Funcionários============");
        int j = 0;
        for(int i = this.tamanho-1; i >= 0; i--){
            j++;
            System.out.println(j +". Nome: " +this.funcionarios[i].getNome());
            System.out.println(j +". Salário R$" +this.funcionarios[i].getSalario());
            System.out.println("-----");
        }
        System.out.println("===================================");
    }

    public int size( ) {
        return this.tamanho;
    }

}
