import javax.swing.JOptionPane;

public class ex4c6 {
	public static void main(String[] args) {
		double imc;
		String titulo = "Calculador de IMC";
		int continuar = Integer.valueOf(
				JOptionPane.showConfirmDialog(null, "Voc� quer saber o seu IMC?", titulo, JOptionPane.YES_NO_OPTION));
		if (continuar == 1) {
			System.exit(0);
		}
		String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ", titulo, JOptionPane.QUESTION_MESSAGE);
		double altura = Double.valueOf(JOptionPane.showInputDialog(null, "Digite a sua altura em metros: ", titulo,
				JOptionPane.QUESTION_MESSAGE));
		double peso = Double.valueOf(
				JOptionPane.showInputDialog(null, "Digite o seu peso em kg: ", titulo, JOptionPane.QUESTION_MESSAGE));
		imc = peso / (Math.pow(altura, 2));
		if (18 > imc) {
			JOptionPane.showMessageDialog(null,
					nome + ", seu IMC � menor que 18 (" + imc + ") voc� est� desnutrido(a)!", titulo,
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			if (20 > imc && imc >= 18) {
				JOptionPane.showMessageDialog(null,
						nome + ", seu IMC est� entre 18 e 20 (" + imc + ") voc� est� abaixo do peso!", titulo,
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				if (25 > imc && imc >= 20) {
					JOptionPane.showMessageDialog(null,
							nome + ", seu IMC � est� entre 20 e 25 (" + imc + ") voc� est� no peso ideal!", titulo,
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					if (27 > imc && imc >= 25) {
						JOptionPane.showMessageDialog(null,
								nome + ", seu IMC est� entre 25 e 27 (" + imc + ") voc�s est� acima do peso!", titulo,
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null,
								nome + ", seu IMC est� acima de 27 (" + imc + ") voc� est� obeso(a)!", titulo,
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "FIM!", titulo, JOptionPane.INFORMATION_MESSAGE);
	}
}
