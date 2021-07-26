
public class ex11dc9 {
    public static void main(String[] args) {
        double e = 0;
        System.out.println("100 repetições de 1/1 + 8/10 + 27/100 + 64/1000...");
        for (double cont = 1; 100 >= cont; cont++) {
            e += Math.pow(cont, 3) / Math.pow(10, cont - 1);
        }
        System.out.println("É de: " + e);
    }
}
