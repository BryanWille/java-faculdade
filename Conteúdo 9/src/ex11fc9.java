
public class ex11fc9 {

	public static void main(String[] args) {
		double f = 0;
		System.out.println("100 repetições de 5 * raiz de (1*4/2² + 3 * 8/7² + 5*16/12²...");
		for (double contador = 1; 100 >= contador; contador++) {
			f += ((contador * 2 - 1) * Math.pow(2, contador + 1)) / Math.pow(contador * 5 - 3, 2);
		}
		f = 5.0 * Math.sqrt(f);
		System.out.println("é igual a: " + f);
	}

}
