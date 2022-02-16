package Ex1;

public class Lista {
    private Funcionario[] funcionarios = new Funcionario[100];
    private int tamanho;

    public void adicionar(Funcionario func) {
        funcionarios[tamanho] = func;
        this.tamanho++;

    }

    public Funcionario buscar(int posicao) {
        Funcionario buscado = null;
        if (this.tamanho < posicao || posicao > 99) {
            System.out.println("Erro: posição não encontrada!");
        } else {
            System.out.println("Funcionário encontrado");
            buscado = funcionarios[posicao];
            System.out.println("O Seu funcionário se chama: " + buscado.getNome() + " e tem um salário de: R$" + buscado.getSalario());
        }
        return buscado;
    }

    public void remover(int posicao) {
        if (funcionarios[posicao] == null) {
            System.out.println("Erro: nenhum funcionário cadastrado ainda!");
        } else {
            funcionarios[posicao] = null;
            int cont = this.tamanho;
            for (int i = 0; i < cont; i++) {
                if (funcionarios[i] == null) {
                    Funcionario clone = funcionarios[i + 1];
                    funcionarios[i] = clone;
                    funcionarios[i + 1] = null;
                    this.tamanho--;
                }
            }
            this.tamanho++;
        }
    }

    public boolean contem(String nome) {
        boolean contem = false;
        for (int i = 0; i <= this.tamanho; i++) {
            if (funcionarios[i].getNome().equalsIgnoreCase(nome)) {
                contem = true;
                break;
            }
        }
        return contem;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void imprimirLista() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println("Nome: " + funcionarios[i].getNome() + "\nSalário: R$" + funcionarios[i].getSalario() + "\n-----------");
        }
    }

    public void ordemAlfabetica(Funcionario[] funcionarios){

    }

}
