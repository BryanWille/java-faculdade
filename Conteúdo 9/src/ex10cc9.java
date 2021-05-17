
public class ex10cc9 {
    public static void main(String[] args) {
        double c = 0;
        System.out.println("1/3 * 100 repetições de (1/2 + 3/4 + 5/6...)² é: ");
        for (double cont = 1; 100 >= cont; cont++) {
            c += (cont * 2 - 1) / (cont * 2);
        }
        c = 1 / 3.0 * Math.pow(c, 2);
        System.out.println(c);
    }
}
