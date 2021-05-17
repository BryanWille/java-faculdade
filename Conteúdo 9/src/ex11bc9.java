
public class ex11bc9 {

	public static void main(String[] args) {
		double b = 0;
		System.out.println("100 repetições de: 5/3 *(1/raiz de 7 + 4/raiz de 10 + 7/raiz de 13...)");
		for (double cont = 1; 100 >= cont; cont++) {
			b += ((cont * 3) - 2) / Math.pow((cont * 3) + 4, 1 / 2.0);
		}
		b = 5 / 3.0 * b;
		System.out.println("O total foi de: " + b);
	}

}
