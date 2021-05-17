import javax.swing.JOptionPane;

public class ex8c6 {
	public static void main(String[] args) {
		double pesoMinimo, pesoMaximo;
		String msg = "Calculador peso ideal!";
		int continuar = Integer.valueOf(JOptionPane.showConfirmDialog(null,
				"Você quer saber o peso minimo que você deve ter?", msg, JOptionPane.YES_NO_OPTION));
		if (continuar == 1) {
			JOptionPane.showMessageDialog(null, "Ok, fechando o programa!", msg, JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		String nome = JOptionPane.showInputDialog(null, "Digite o seu nome, por favor:", msg,
				JOptionPane.INFORMATION_MESSAGE);
		Double altura = Double.valueOf(
				JOptionPane.showInputDialog(null, "Digite a sua altura: ", msg, JOptionPane.INFORMATION_MESSAGE));
		pesoMinimo = 20 * Math.pow(altura, 2);
		pesoMaximo = 25 * Math.pow(altura, 2);
		JOptionPane.showMessageDialog(null, nome + ", o seu Peso Mínimo Ideal deve ser " + pesoMinimo
				+ " e o peso máximo deve ser " + pesoMaximo + " !", msg, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "FIM!", msg, JOptionPane.INFORMATION_MESSAGE);
	}
}
