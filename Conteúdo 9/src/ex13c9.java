public class ex13c9 {
	public static void main(String[] args) {
		double serie_desafio = 0, fatorial;
		System.out.println("Exercicio 13 Conteúdo 9");
		for (double contador = 1; 10 >= contador; contador++) {
			fatorial = 1;
			for (double cont = contador; cont > 1; cont--) {
					fatorial *= cont;
			}
			if (contador % 2 != 0) {
				serie_desafio += fatorial / (Math.pow(2, contador) - 1);
			} else {
				serie_desafio -= fatorial / (Math.pow(2, contador) - 1);
			}
		}
		System.out.println("O valor do desafio é: " +serie_desafio);
	}
}
