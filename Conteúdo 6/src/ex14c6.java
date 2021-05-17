import javax.swing.JOptionPane;

public class ex14c6 {
	public static void main(String[] args) {
		String msg = "Decompositor de número de 4 digitos";
		int unidade, dezena, centena, milhar;
		int cont = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Você quer decompor um numero de 4 digítos? ",
				msg, JOptionPane.YES_NO_OPTION));
		if (cont == 1) {
			System.exit(0);
		}
		int numero = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o seu número com 4 digitos: ", msg,
				JOptionPane.QUESTION_MESSAGE));
		if (numero / 10000 > 0) {
			JOptionPane.showMessageDialog(null, "VOCÊ TEM QUE INFORMAR UM NÚMERO COM 4 DÍGITOS", msg,
					JOptionPane.QUESTION_MESSAGE);
		}
		unidade = numero % 10;
		dezena = (numero % 100) / 10;
		centena = (numero / 100) % 10;
		milhar = numero / 1000;
		JOptionPane.showMessageDialog(null, "O seu número de trás pra frente é " + unidade + dezena + centena + milhar,
				msg, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "FIM", msg, JOptionPane.INFORMATION_MESSAGE);
	}

}
