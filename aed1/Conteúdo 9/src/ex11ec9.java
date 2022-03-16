
public class ex11ec9 {

    public static void main(String[] args) {
        double e = 0;
        System.out.println("100 repetições de: 2/3(1*raiz de 5/2¹ + 4*raiz de 7/3² + 9 * raiz de 9/4³...)");
        for (double cont = 1; 100 >= cont; cont++) {
            e += (Math.pow(cont, 2) * Math.sqrt((cont * 2) + 3)) / Math.pow(cont + 1, cont);
        }
        e *= 2 / 3.0;
        System.out.println("é igual a: " + e);
    }

}
