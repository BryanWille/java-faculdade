import javax.swing.JOptionPane;

public class ex5c8 {
	public static void main(String[] args) {
		int beltrano = 0, ciclano = 0, fulano = 0;
		String[] botoes = { "Beltrano", "Ciclano", "Fulano" };
		String msg = "Supremo Tribunal Eleitoral", vencedor;
		JOptionPane.showMessageDialog(null, "Vamos fazer o contador de votos, 100 votos!", msg,
				JOptionPane.INFORMATION_MESSAGE);
		for (int contador = 1; 100 >= contador; contador++) {
			int indice = JOptionPane.showOptionDialog(null, "Em quem você quer voltar: ", msg + "! Voto " + contador,
					JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
			switch (indice) {
			case 0:
				beltrano += 1;
				break;
			case 1:
				ciclano += 1;
				break;
			case 2:
				fulano += 1;
				break;
			}
		}
		JOptionPane.showMessageDialog(null,
				"Beltrano teve: " + beltrano + "\nCiclano teve: " + ciclano + "\nFulano teve: " + fulano,
				"Votos Finais", JOptionPane.INFORMATION_MESSAGE);
		if (beltrano > ciclano && beltrano > fulano) {
			vencedor = "Beltrano";
		} else {
			if (ciclano > fulano) {
				vencedor = "Ciclano";
			} else {
				vencedor = "Fulano";
			}
		}
		JOptionPane.showMessageDialog(null, "Por isso o vencedor foi: " + vencedor, msg,
				JOptionPane.INFORMATION_MESSAGE);
	}
}
