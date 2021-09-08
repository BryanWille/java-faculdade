package Lista1;

public class teste {
    public static void main(String[] args){
        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(vetor);
    }

    public static int MaiorElemento(int[] vetor){
        int aux = vetor[0];
        for( int i = 1; i <= (vetor.length - 1); i++ ){
            if( aux > vetor[i])
                aux = vetor[i];
        }
        return(aux);
    }
}
