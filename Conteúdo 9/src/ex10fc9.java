
public class ex10fc9 {
    public static void main(String[] args) {
        double f = 0;
        System.out.println("Vamos achar as 100 repetições de 1/2² + 4/4² + 9/6²...:");
        for(double cont = 1; 100>= cont; cont++) {
            f += Math.pow(cont, 2) / Math.pow(cont*2, 2);
        }
        System.out.println("Resultado foi: " +f);
    }
}
