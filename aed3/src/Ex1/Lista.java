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
        for (int i = 0; i < this.tamanho; i++) {
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
        this.imprimirLista(this.funcionarios);
    }

    public void imprimirLista(Funcionario[] funcionarios) {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println("Nome: " + funcionarios[i].getNome() + "\nSalário: R$" + funcionarios[i].getSalario() + "\n-----------");
        }
    }

    public Funcionario[] ordemAlfabetica(Funcionario[] funcionarios) {
        String[] key = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Funcionario[] funcionarioOrdenados = funcionarios;
        for (int i = 0; i < this.tamanho; i++) { // Primeiro for -- Percorrer todos os nomes
            for (int j = 0; j < this.tamanho - 1; j++) { // Segundo for -- Percorrer todos os nomes
                int x = 0;
                boolean igual = funcionarios[j].getNome().substring(x, x + 1).equalsIgnoreCase(funcionarios[j + 1].getNome().substring(x, x + 1)); //Letra X de A é igual a Letra X de B?
                do {
                    if (!igual) {
                        int primeiroIndex = 0, segundoIndex = 0;
                        for (int y = 0; y < key.length; y++) { // Quarto for -- Procurar qual letra é menor
                            if (key[y].equalsIgnoreCase(funcionarios[j].getNome().substring(x, x + 1))) {   // Procura qual o index da letra no nome 1
                                primeiroIndex = y;
                            } else if (key[y].equalsIgnoreCase(funcionarios[j + 1].getNome().substring(x, x + 1))) { // Procura qual o index da letra no nome 2
                                segundoIndex = y;
                            }
                        }
                        if (segundoIndex < primeiroIndex) {
                            Funcionario bolha = funcionarios[j + 1];
                            funcionarioOrdenados[j + 1] = funcionarios[j];
                            funcionarioOrdenados[j] = bolha;
                        }
                    }
                    x++;
                } while (igual);
            }
        }
        return funcionarioOrdenados;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
}
