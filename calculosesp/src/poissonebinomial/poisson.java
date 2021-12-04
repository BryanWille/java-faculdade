package poissonebinomial;

public class poisson {public static void main(String[] args){
    int         inicio = 1;
    double      media = 2;
    int         fim = 1;
    double probabilidade = 0;
    for(int i = inicio; i <= fim; i++){
        double neperiano = Math.pow(Math.E, (-media));
        double elevar = Math.pow(media, i) / fatorial(i);
        probabilidade += neperiano * elevar;
    }
    System.out.println(probabilidade);

}

    public static int fatorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * fatorial(n-1));
    }

}
