import javax.swing.JOptionPane;

public class ex9c9 {

	public static void main(String[] args) {
		double seriek = 0;
		int repet = Integer.valueOf(JOptionPane.showInputDialog(null,
				"Quantas repeti��es para a s�rie: \n100 - (9 / 10 * raiz de 1 + 27/11*raiz de 16 + 81/12*raiz de 81...",
				"S�rieK", JOptionPane.QUESTION_MESSAGE));
		for (double contador = 1; repet >= contador; contador++) {
			seriek += Math.pow(3, contador + 1) / ((9 + contador) * Math.pow(Math.pow(contador, 4), 1 / 2.0));
		}
		seriek = 100 - Math.pow(seriek, 3);
		JOptionPane.showMessageDialog(null, "O Restulado da s�rie k foi de: " + seriek, "S�rieK",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
