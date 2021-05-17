public class ex15c8 {
    public static void main(String[] args){
        int impar = 0, soma = 0;
        for(int contador = 1000; 2000 > contador; contador ++){
            if ((contador % 2) == 0) {
            } else {
                soma += contador;
                impar += 1;
            }
        }
       System.out.println("A média aritmética da soma dos números impares compreendidos entre 1000 e 2000 é = " +(soma/impar));
    }
}
