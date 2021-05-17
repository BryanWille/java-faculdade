
public class ex6c9 {
    public static void main(String[] args) {
        double seriem = 0;
        System.out.println("20 repetições de: Serie 10 + (1/raiz de 2 + 2/raiz de 4 + 3/raiz de 6...");
        for (double cont = 1; 20 >= cont; cont++) {
            seriem += cont / Math.pow(cont * 2, 1.0 / 2);
        }
        seriem = 10 + seriem;
        System.out.println("O restulado é: " + seriem);
    }
}
