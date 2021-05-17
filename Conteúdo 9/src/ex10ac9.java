
public class ex10ac9 {
	public static void main(String[] args) {
		double a = 0;
		System.out.println("As 100 repetições de 1/raiz de 2 + 2 /raiz de 4 + 3/raiz de 6... são: ");
		for (double c = 1; 100 >= c; c++) {
			a += c / Math.pow(c*2, 1.0/2);
		}
		System.out.println(a);
	}
}
