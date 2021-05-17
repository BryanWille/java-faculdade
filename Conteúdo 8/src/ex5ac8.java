import javax.swing.JOptionPane;

public class ex5ac8 {
	public static void main(String[] args) {
		int turno2 = 1, voto, beltrano = 0, ciclano = 0, fulano = 0, nulo = 0;
		String vencedor, msg = "STF";
		JOptionPane.showMessageDialog(null, "Contador de votos! \n[0]Nulo\n[1]Beltrano\n[2]Ciclano\n[3]Fulano", msg,
				JOptionPane.INFORMATION_MESSAGE);
		for (int cont = 1; 100 >= cont; cont++) {
			voto = Integer.parseInt(
					JOptionPane.showInputDialog(null, cont + ", em quem vota? ", msg, JOptionPane.QUESTION_MESSAGE));
			switch (voto) {
			case 0:
				nulo += 1;
				break;
			case 1:
				beltrano += 1;
				break;
			case 2:
				ciclano += 1;
				break;
			case 3:
				fulano += 1;
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "Nulo: " +nulo +"\nBeltrano: " +beltrano +"\nCiclano: " +ciclano +"\nFulano: " +fulano, msg, JOptionPane.INFORMATION_MESSAGE);
		if (nulo > 51) {
			JOptionPane.showMessageDialog(null, "Votação encerrada, Houve mais votos nulos!", msg,
					JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		} else if (beltrano == ciclano && beltrano != fulano) {
			JOptionPane.showMessageDialog(null, "Segundo turno! \n[0]Nulo\n[1]Beltrano\n[2]Ciclano", msg,
					JOptionPane.INFORMATION_MESSAGE);
			for (turno2 = 1; 100 >= turno2; turno2++) {
				voto = Integer.parseInt(JOptionPane.showInputDialog(null, turno2 + ", em quem vota? ", msg,
						JOptionPane.INFORMATION_MESSAGE));
				switch (voto) {
				case 0:
					nulo += 1;
					break;
				case 1:
					beltrano += 1;
					break;
				case 2:
					ciclano += 1;
					break;
				}
			}
		} else if (beltrano == fulano && beltrano != ciclano) {
			JOptionPane.showMessageDialog(null, "Segundo turno! \n[0]Nulo\n[1]Beltrano\n[3]Fulano", msg,
					JOptionPane.INFORMATION_MESSAGE);
			for (turno2 = 1; 100 >= turno2; turno2++) {
				voto = Integer.parseInt(JOptionPane.showInputDialog(null, turno2 + ", em quem vota? ", msg,
						JOptionPane.INFORMATION_MESSAGE));
				switch (voto) {
				case 0:
					nulo += 1;
					break;
				case 1:
					beltrano += 1;
					break;
				case 3:
					fulano += 1;
					break;
				}
			}
		} else if (ciclano == fulano && ciclano != beltrano) {
			JOptionPane.showMessageDialog(null, "Segundo Turno! \n[0]Nulo\n[2]Ciclano\n[3]Fulano", msg,
					JOptionPane.INFORMATION_MESSAGE);
			for (turno2 = 1; 100 >= turno2; turno2++) {
				voto = Integer.parseInt(JOptionPane.showInputDialog(null, turno2 + ", em quem vota? ", msg,
						JOptionPane.INFORMATION_MESSAGE));
				switch (voto) {
				case 0:
					nulo += 1;
					break;
				case 2:
					ciclano += 1;
					break;
				case 3:
					ciclano += 1;
					break;
				}
			}
		} else if (beltrano == ciclano && ciclano == fulano){
			JOptionPane.showMessageDialog(null,
					"Segundo Turno Triplo! \n[0]Nulo\n[1]Beltrano\n[2]Ciclano\n[3]Fulano", msg,
					JOptionPane.INFORMATION_MESSAGE);
			for (turno2 = 1; 100 >= turno2; turno2++) {
				voto = Integer.parseInt(JOptionPane.showInputDialog(null, turno2 + ", em quem vota? ", msg,
						JOptionPane.INFORMATION_MESSAGE));
				switch (voto) {
				case 0:
					nulo += 1;
					break;
				case 1:
					beltrano += 1;
					break;
				case 2:
					ciclano += 1;
					break;
				case 3:
					fulano += 1;
					break;
				}
			}
		}
		if (nulo > 51) {
			JOptionPane.showMessageDialog(null, "Votação encerrada, Houve mais votos nulos!", msg,
					JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		if (beltrano > ciclano && beltrano > fulano) {
			vencedor = "Beltrano";
		} else if (ciclano > fulano) {
			vencedor = "Ciclano";
		} else {
			vencedor = "Fulano";
		}
		JOptionPane.showMessageDialog(null, "O Vencedor foi " + vencedor, msg, JOptionPane.INFORMATION_MESSAGE);
	}
}