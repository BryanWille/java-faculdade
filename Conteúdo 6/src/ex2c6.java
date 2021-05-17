import javax.swing.JOptionPane;

public class ex2c6 {
	public static void main(String[] args) {
		double multa;
		String secretaria = "Secretaria do Meio Ambiente";
		int confirmar = Integer.valueOf(JOptionPane.showConfirmDialog(null,
				"Você quer calcular se tem que pagar multa de poluentes? ", secretaria, JOptionPane.YES_NO_OPTION));
		if (confirmar == 1) {
			System.exit(0);
		}	
		double poluente = Double.valueOf(JOptionPane.showInputDialog(null,
				"Digite a quantidade de poluentes emitidos em [mg/(t*m²)] ", secretaria, JOptionPane.QUESTION_MESSAGE));
		if (poluente <= 1500) {
			JOptionPane.showMessageDialog(null, "Você está isento de pagar a multa, continue assim!", secretaria,
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			if (poluente > 1500 && poluente <= 3500) {
				JOptionPane.showMessageDialog(null,
						"Você excedeu a quantidade de poluentes e deve pagar uma multa de R$3.000,00!", secretaria,
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				multa = 5000.0 * poluente;
				JOptionPane.showMessageDialog(null,
						"Você excedeu muito a quantidade de poluentes e deve pagar uma multa de R$" + multa + " !",
						secretaria, JOptionPane.INFORMATION_MESSAGE);
			}
		}
		JOptionPane.showMessageDialog(null, "Fim!", secretaria, JOptionPane.INFORMATION_MESSAGE);
	}
}
