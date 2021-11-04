package Lista;

public class ListaEstatica {

    private int inicio;
    private int fim;
    private int contador;
    private int capacidade;
    private Object[] itemArray;

    public ListaEstatica() {
        this(10);
    }

    public ListaEstatica(int maxCapacidade) {
        this.inicio = 0;
        this.fim = 0;
        this.contador = 0;
        this.capacidade = maxCapacidade;
        this.itemArray = new Object[capacidade];
    }

    public boolean vazia() {
        return (this.contador == 0);
    }

    public int tamanho() {
        return (this.contador);
    }

    private boolean chaveValida(int posicao) {
        return (1 <= posicao && posicao <= this.contador);
    }

    public void inserir(Object newItem) {
        this.inserir(newItem, this.contador + 1);
    }

    public void inserirInicio(Object novoItem) {
        inserir(novoItem, 0);
    }

    public void inserirFim(Object novoItem) {
        inserir(novoItem, this.contador + 1);
    }

    public void inserir(Object novoItem, int posicao) {
        if (contador == capacidade) {
            System.out.println("Erro: Capacidade da Lista foi excedida!");
        } else if (posicao == contador + 1) {
            itemArray[fim] = novoItem;
            fim = (fim + 1) % capacidade;
            contador++;
        } else if (posicao == 0) {
            mover(inicio, fim, 1);
            itemArray[0] = novoItem;
            inicio = 0;
            contador++;
        } else if (!chaveValida(posicao)) {
            System.out.println("Erro: Indice inválido!");
        } else {
            mover(posicao - 1, fim, 1);
            itemArray[posicao - 1] = novoItem;
            contador++;
        }
    }


    private void mover(int begin, int end, int shift) {
        int i, j;
        if (shift == 1) {
            if (end <= capacidade) {
                if (end == fim) {
                    fim = (fim + 1) % capacidade;
                }
                if (fim != inicio) {
                    j = (end + 1) % capacidade;
                    i = end;
                } else {
                    j = end;
                    i = end - 1;
                }
                while (i != begin && i != inicio) {
                    itemArray[j] = itemArray[i];
                    j = i;
                    i = (i + capacidade - 1) % capacidade;
                }
                itemArray[j] = itemArray[i];
                if (begin == inicio) {
                    inicio = (inicio + 1) % capacidade;
                }
            }
        } else {
            if (begin <= capacidade) {
                if (begin == inicio) {
                    inicio = (inicio + capacidade - 1) % capacidade;
                }
                if (fim != inicio) {
                    j = (begin + capacidade - 1) % capacidade;
                    i = begin;
                } else {
                    j = begin - 1;
                    i = begin % capacidade;
                }
                while (i != end && i != fim) {
                    itemArray[j] = itemArray[i];
                    j = i;
                    i = (i + 1) % capacidade;
                }
                if (end != fim) {
                    itemArray[j] = itemArray[i];
                }
                if (end == fim) {
                    fim = (fim + capacidade - 1) % capacidade;
                }
            }
        }
    }

    public Object retirar() {
        return (retirar(inicio));
    }

    public Object retirarInicio() {
        return (retirar(inicio));
    }

    public Object retirarFim() {
        return (retirar(fim));
    }

    public Object retirar(int posicao) {
        Object x;
        int i, j;
        if (vazia()) {
            x = "'Erro: Lista vazia!'";
        } else if (posicao == inicio) {
            x = itemArray[inicio];
            inicio = (inicio + 1) % capacidade;
            contador--;
        } else if (posicao == fim) {
            if (fim != 0) {
                x = itemArray[fim - 1];
                fim = (fim + capacidade - 1) % capacidade;
            } else {
                fim = (fim + capacidade - 1) % capacidade;
                x = itemArray[fim];
            }
            contador--;
        } else if (!chaveValida(posicao)) {
            x = "'Erro: Indice invalido!'";
        } else {
            i = inicio;
            for (j = 1; j < posicao; j++) {
                i = (i + 1) % capacidade;
            }
            x = itemArray[i];
            mover(posicao + 1, fim, -1);
            contador--;
        }
        return (x);
    }

    public String toString() {
        String listaCompleta = "";
        if (vazia()) {
            listaCompleta = null;
        } else {
            int i = inicio;
            for (int j = 1; j <= contador; j++) {
                listaCompleta = listaCompleta + "\n" + itemArray[i];
                i = (i + 1) % capacidade;
            }
        }
        return (listaCompleta);
    }
}
