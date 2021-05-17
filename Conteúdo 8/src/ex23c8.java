public class ex23c8 {
	public static void main(String[] args) {
		double serie, somador = 0;
		for (int c = 1; 99 >= c; c += 2) {
			System.out.println(somador + " + " + Math.pow(2, c));
			serie = Math.pow(2, c);
			somador += serie;
		}
		System.out.println(somador * (1.0 / 3));
	}
}