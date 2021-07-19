import javax.swing.JOptionPane;

public class ex3c8 {
	public static void main(String[] args) {
		String msg = "Reprovado ou Aprovado", status;
		int nota, faltas;
		JOptionPane.showMessageDialog(null, "Vamos calcular se 50 alunos está reprovado ou aprovado!", msg,
				JOptionPane.INFORMATION_MESSAGE);
		for (int contador = 1; 3 >= contador; contador++) {
			nota = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a nota de " + contador + " :", msg,
					JOptionPane.QUESTION_MESSAGE));
			faltas = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite as faltas de " + contador + " :", msg,
					JOptionPane.QUESTION_MESSAGE));
			if (nota >= 65 && 16 >= faltas) {
				status = "Aprovado";
			} else {
				status = "Reprovado";
			}
			JOptionPane.showMessageDialog(null, "O aluno " + contador + " foi " + status + " !", msg,
					JOptionPane.INFORMATION_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, "FIM!", msg, JOptionPane.INFORMATION_MESSAGE);
	}

}
