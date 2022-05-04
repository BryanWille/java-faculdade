package Heap;

public class HeapSelect {
    private int[] vet;
    private int tam, ind;

    public HeapSelect(int tamanho_vetor){
        this.setVet(new int[tamanho_vetor+1]);
        this.setTam(0);
    }


    public int Pai(int x) {
        return x / 2;
    }

    public void imprimirLista(){
        if (tam == 0) System.out.println("Lista vazia!");
        else {
            for (int j = 1; j <= tam; j++)
                System.out.print(vet[j] + " ");
            System.out.println();
        }
    }

    public int menorElemento(){
        return vet[1];
    }

    public void retiraMenor(){
        if (tam == 0) System.out.println("Lista vazia!");
        else {
            int menor_prior = vet[1];
            vet[1] = vet[tam];
            tam--;
            heap_fica(1, tam);
            System.out.println("O elemento removido foi " + menor_prior);
        }
    }

    public void insere(int num){
        if (tam < vet.length - 1) {
            tam++;
            System.out.println("Valor: " +num +" inserido");
            ind = tam;
            while (ind > 1 && vet[Pai(ind)] >= num) {
                vet[ind] = vet[Pai(ind)];
                ind = Pai(ind);
            }
            vet[ind] = num;
        } else
            System.out.println("Lista de prioridades Lotada!");
    }




    public void heap_fica(int i, int qtde) {
        int f_esq, f_dir, menor, aux;
        menor = i;
        if (2 * i + 1 <= qtde) {
            // o nó que está sendo analisado tem filhos p/
            // esquerda e direita
            f_esq = 2 * i + 1;
            f_dir = 2 * i;
            if (vet[f_esq] <= vet[f_dir] &&
                    vet[f_esq] < vet[i])
                menor = 2 * i + 1;
            else if (vet[f_dir] < vet[f_esq] &&
                    vet[f_dir] < vet[i])
                menor = 2 * i;
        } else if (2 * i <= qtde) {
            // o nó que está sendo analisado tem filho
            // apenas p/ a direita
            f_dir = 2 * i;
            if (vet[f_dir] < vet[i])
                menor = 2 * i;
        }
        if (menor != i) {
            aux = vet[i];
            vet[i] = vet[menor];
            vet[menor] = aux;
            heap_fica(menor, qtde);
        }
    }


    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }

    public int[] getVet() {
        return vet;
    }
    public void setVet(int[] vet) {
        this.vet = vet;
    }
}
