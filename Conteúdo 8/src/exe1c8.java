import javax.swing.JOptionPane;

public class exe1c8 {
	public static void main(String[] args) {
		String msg = "Estat�sticas de Empregados", maiorNome = "", maiorCargo = "";
		int dezoito = 0;
		double mediaDezoito = 0, maiorSalario = 0;
		JOptionPane.showMessageDialog(null, "Vamos fazer umas an�lise do seus funcion�rios!", msg,
				JOptionPane.INFORMATION_MESSAGE);
		for (int contador = 1; 5 >= contador; contador++) {
			String nome = JOptionPane.showInputDialog(null, "Digite o Nome do funcion�rio: ", msg,
					JOptionPane.QUESTION_MESSAGE);
			String cargo = JOptionPane.showInputDialog(null, "Qual o cargo de" + nome + ": ", msg,
					JOptionPane.QUESTION_MESSAGE);
			Double salario = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o s�lario de: " + nome + ":", msg,
					JOptionPane.QUESTION_MESSAGE));
			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade de " + nome + ":", msg,
					JOptionPane.QUESTION_MESSAGE));
			if (cargo.equalsIgnoreCase("s�nior") && salario > 10000 && idade > 50) {
				JOptionPane.showMessageDialog(null,
						"O Funcion�rio " + nome
								+ " � s�nior\ntem s�lario maior que R$10.000,00! \ne tem mais que 50 anos",
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
				"A m�dia dos salarios do funcion�rios at� 18 foi de R$" + (mediaDezoito / dezoito), msg,
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"O nome do funcion�rio que tem maior s�lario �: " + maiorNome + " com cargo de " + maiorCargo, msg,
				JOptionPane.INFORMATION_MESSAGE);
	}
}
