
public class ex10ec9 {
	public static void main(String[] args) {
		double e = 0;
		System.out.println("Vamos achar a 100 repetições de 1/3*2 + 2/3*4 + 3/3*6 + 4/3*8...: ");
		for (double cont = 1; 100>= cont; cont++) {
			e += cont / (3 * (cont*2));
		}
		System.out.println(e);
	}
}
