
public class exe2c8 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular os números triangulares menores que 1000!");
		int triangular = 0, media = 0, c = 0;
		for (int contador = 1; 1000 >= triangular; contador++) {
			triangular = contador * (contador + 1) * (contador + 2);
			if (1000 >= triangular) {
				media += triangular;
				c++;
				System.out.println(triangular);
			}
		}
		System.out.println("a média foi de: " + media / c);
	}
}
