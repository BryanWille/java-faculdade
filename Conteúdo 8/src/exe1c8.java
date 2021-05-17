import javax.swing.JOptionPane;

public class exe1c8 {
	public static void main(String[] args) {
		String msg = "Estatísticas de Empregados", maiorNome = "", maiorCargo = "";
		int dezoito = 0;
		double mediaDezoito = 0, maiorSalario = 0;
		JOptionPane.showMessageDialog(null, "Vamos fazer umas análise do seus funcionários!", msg,
				JOptionPane.INFORMATION_MESSAGE);
		for (int contador = 1; 5 >= contador; contador++) {
			String nome = JOptionPane.showInputDialog(null, "Digite o Nome do funcionário: ", msg,
					JOptionPane.QUESTION_MESSAGE);
			String cargo = JOptionPane.showInputDialog(null, "Qual o cargo de" + nome + ": ", msg,
					JOptionPane.QUESTION_MESSAGE);
			Double salario = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o sálario de: " + nome + ":", msg,
					JOptionPane.QUESTION_MESSAGE));
			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade de " + nome + ":", msg,
					JOptionPane.QUESTION_MESSAGE));
			if (cargo.equalsIgnoreCase("sênior") && salario > 10000 && idade > 50) {
				JOptionPane.showMessageDialog(null,
						"O Funcionário " + nome
								+ " é sênior\ntem sálario maior que R$10.000,00! \ne tem mais que 50 anos",
						msg, JOptionPane.INFORMATION_MESSAGE);
			}
			if (idade < 18) {
				dezoito++;
				mediaDezoito += salario;
			}
			if (contador == 1 || maiorSalario > salario) {
				maiorSalario = salario;
				maiorNome = nome;
				maiorCargo = cargo;
			}
		}
		JOptionPane.showMessageDialog(null,
				"A média dos salarios do funcionários até 18 foi de R$" + (mediaDezoito / dezoito), msg,
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"O nome do funcionário que tem maior sálario é: " + maiorNome + " com cargo de " + maiorCargo, msg,
				JOptionPane.INFORMATION_MESSAGE);
	}
}
