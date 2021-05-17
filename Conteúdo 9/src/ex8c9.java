
public class ex8c9 {
	public static void main(String[] args) {
		double serieo = 0;
		System.out.println(
				"Vamos calcular os 20 primeiros termos de: 3*raiz de 5/ 5 + 5 * raiz de 9 / 25 + 7* raiz de 13/ 125...");
		for (double contador = 1; 20 >= contador; contador++) {
			serieo += (((contador * 2) + 1) * Math.pow((contador * 4) + 1, 1.0 / 2)) / Math.pow(5, contador);
		}
		serieo = Math.pow(serieo, 2);
		System.out.println("O Valor da série matemática foi: " + serieo);
	}
}
