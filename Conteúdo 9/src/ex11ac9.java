
public class ex11ac9 {
	public static void main(String[] args) {
		double a = 0;
		System.out.println("100 Repeti��es do seguinte termo: raiz cubica de: 1+1/1 + 2+8/4 +3+15/16...");
		for (double cont = 1; 100 >= cont; cont++) {
			a += (cont + (cont * 7 - 6)) / Math.pow(4, cont - 1);
		}
		a = Math.pow(a, 1.0 / 3);
		System.out.println("� igual a: " + a);
	}
}
