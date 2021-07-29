
public class ex11cc9 {
    public static void main(String[] args) {
        double c = 0;
        System.out.println("100 sequências de: (3*raiz de 5/5 + 5 * raiz de 9 / 25 + 7 * raiz de 13/125...");
        for (double cont = 1; 100 >= cont; cont++) {
            c += ((cont * 2 + 1) * (Math.pow((cont * 4) + 1, 1.0/2))) / Math.pow(5, cont);
        }
        c = Math.pow(c, 2);
        System.out.println("Foi de: " + c);
    }
}
