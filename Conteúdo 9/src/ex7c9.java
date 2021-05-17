
public class ex7c9 {
	public static void main(String [] args) {
		double seriej = 0;
		System.out.println("Vamos fazer as 6 repetições de 0+3/7 + 2+6/13 + 4+9/19...");
		for (double contador = 1; 6>= contador; contador ++) {
			seriej += (((contador * 2) - 2) + (3 * contador)) / ((6 * contador)+1);
		}
		System.out.println(seriej);
	}
}
