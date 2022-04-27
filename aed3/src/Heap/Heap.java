package Heap;

public class Heap {
    private int[] vet;

    public Heap(int[] vet){
        this.setVet(vet);
    }


    public int Pai(int x) {
        return x / 2;
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

    public int[] getVet() {
        return vet;
    }
    public void setVet(int[] vet) {
        this.vet = vet;
    }
}
