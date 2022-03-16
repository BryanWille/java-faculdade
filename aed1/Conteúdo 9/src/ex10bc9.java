
public class ex10bc9 {
    public static void main(String[] args) {
        double b = 0;
        System.out.println("1 + raiz de (100 repetições) 2/3 + 4/6 + 6/9 + 8/12... são:");
        for (double cont = 1; 100 >= cont; cont++) {
            b += (cont*2) / (cont*3);
        }
        b = 1 + Math.pow(b, 1/2.0);
        System.out.println(b);
    }
}
