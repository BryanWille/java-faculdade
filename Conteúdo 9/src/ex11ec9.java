
public class ex11ec9 {

	public static void main(String[] args) {
		double e = 0;
		System.out.println("100 repeti��es de: 2/3(1*raiz de 5/2� + 4*raiz de 7/3� + 9 * raiz de 9/4�...)");
		for (double cont = 1; 100 >= cont; cont++) {
			e += (Math.pow(cont, 2) * Math.sqrt((cont * 2) + 3)) / Math.pow(cont + 1, cont);
		}
		e *= 2/3.0;
		System.out.println("� igual a: " + e);
	}

}
