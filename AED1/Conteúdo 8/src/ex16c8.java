//calculadora da fun��o f(x) = raiz de x - 3, com x de 3 a 12
public class ex16c8 {
    public static void main(String[] args){
        double resultado;
        for (int cont = 3; 12>= cont; cont++){
            resultado = Math.pow(Math.pow(cont, 2) - 3, 1/2f);
            System.out.print("\nA imagem da fun��o f(" +cont +") = raiz" +cont +"�-3 � igual = " +resultado);
        }
    }
}
