package poissonebinomial;


public class binomial {
    public static void main(String[] args){
        int inicio = 12;
        int      n = 20;
        double   p = 0.9;
        int    fim = 20;
        double probabilidade = 0;
        for(int i = inicio; i <= fim; i++){
            double juncao = fatorial(n) / ( fatorial(n-i) * fatorial(i) );
            double calculoBaixo = Math.pow(p, i) * Math.pow(1-p, n-i);
            probabilidade += juncao * calculoBaixo;
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
