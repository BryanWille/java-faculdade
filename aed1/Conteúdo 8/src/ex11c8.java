import javax.swing.JOptionPane;

public class ex11c8 {
	public static void main(String[] args) {
		int contMulher = 0;
		double maiorSalario = 0, menorSalario = 0;
		String msg = "Analisador de pessoas!", maiorNome = "";
		String[] arraySexo = { "Masculino", "Feminino" }, arrayCivil = { "Casado", "Solteiro" },
				arrayOlho = { "Azul", "Castanho", "Preto", "Outro..." },
				arrayCabelo = { "Loiro", "Preto", "Castanho", "Ruivo" },
				arrayEscolaridade = { "Analfabeto", "Fundamental", "Médio", "Superior" };
		JOptionPane.showMessageDialog(null, "Vamos tirar os dados de varias pessoas!", msg,
				JOptionPane.INFORMATION_MESSAGE);
		for (int contador = 1; 4 >= contador; contador++) {
			String nome = JOptionPane.showInputDialog(null, "Digite o nome: ", msg, JOptionPane.QUESTION_MESSAGE);
			int idade = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Digite a idade de " + nome, msg, JOptionPane.QUESTION_MESSAGE));
			int sexo = JOptionPane.showOptionDialog(null, "Qual o sexo de " + nome + " ?", msg,
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, arraySexo, arraySexo[0]);
			int civil = JOptionPane.showOptionDialog(null, "Qual o estado civil de " + nome + " ?", msg,
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, arrayCivil, arrayCivil[0]);
			int olho = JOptionPane.showOptionDialog(null, "Qual a cor dos olhos de " + nome + " ?", msg,
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, arrayOlho, arrayOlho[0]);
			int cabelo = JOptionPane.showOptionDialog(null, "Qual a cor do cabelo de " + nome + " ?", msg,
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, arrayCabelo, arrayCabelo[0]);
			int escolaridade = JOptionPane.showOptionDialog(null, "Qual a escolaridade de " + nome + " ?", msg,
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, arrayEscolaridade,
					arrayEscolaridade[0]);
			double salario = Double.valueOf(JOptionPane.showInputDialog(null, "Qual é o sálario de " + nome, msg,
					JOptionPane.QUESTION_MESSAGE));
			if (sexo == 1 && cabelo == 0 && olho == 0 && (idade >= 18 && 25 >= idade) && civil == 1 && escolaridade == 3
					&& salario > 10000) {
				contMulher += 1;
			}
			if (sexo == 0) {
				if (contador == 1 || menorSalario > salario) {
					menorSalario = salario;
				}
				if (salario > maiorSalario) {
					maiorSalario = salario;
					maiorNome = nome;
				}
			}
		}
		JOptionPane.showMessageDialog(null,
				"Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, "
						+ "salário maior que R$10.000,00 e curso superior completo: " + contMulher,
				msg, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "A pessoa com maior Salário foi:" + maiorNome, msg,
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"A Diferença entre o maior e o menor salario dos homens foi de: " + (maiorSalario - menorSalario), msg,
				JOptionPane.INFORMATION_MESSAGE);
	}
}
