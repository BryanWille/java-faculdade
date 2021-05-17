public class ex10dc9 {
	public static void main(String[] args) {
		double d = 0;
		System.out.println("100 repetições de: 1 + 0 / 1 + 2 + 1/ 4 + 3 + 2 / 9...");
		for (double cont = 1; 100 >= cont; cont++) {
			d += (cont + (cont - 1)) / Math.pow(cont, 2);
		}
		System.out.println("é igual a: " + d);
	}
}
