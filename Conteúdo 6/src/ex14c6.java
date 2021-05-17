import javax.swing.JOptionPane;

public class ex14c6 {
	public static void main(String[] args) {
		String msg = "Decompositor de n�mero de 4 digitos";
		int unidade, dezena, centena, milhar;
		int cont = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Voc� quer decompor um numero de 4 dig�tos? ",
				msg, JOptionPane.YES_NO_OPTION));
		if (cont == 1) {
			System.exit(0);
		}
		int numero = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o seu n�mero com 4 digitos: ", msg,
				JOptionPane.QUESTION_MESSAGE));
		if (numero / 10000 > 0) {
			JOptionPane.showMessageDialog(null, "VOC� TEM QUE INFORMAR UM N�MERO COM 4 D�GITOS", msg,
					JOptionPane.QUESTION_MESSAGE);
		}
		unidade = numero % 10;
		dezena = (numero % 100) / 10;
		centena = (numero / 100) % 10;
		milhar = numero / 1000;
		JOptionPane.showMessageDialog(null, "O seu n�mero de tr�s pra frente � " + unidade + dezena + centena + milhar,
				msg, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "FIM", msg, JOptionPane.INFORMATION_MESSAGE);
	}

}
