import javax.swing.JOptionPane;

public class ex3c7 {
	public static void main(String[] args) {
		double multa;
		String msg = "Calculadora de multa de imposto";
		JOptionPane.showMessageDialog(null, "Vamos calcular quanto voc� deve de imposto ", msg, JOptionPane.INFORMATION_MESSAGE);
		double imposto = Double.valueOf(JOptionPane.showInputDialog(null, "Digite quanto voc� deve em imposto: ", msg, JOptionPane.QUESTION_MESSAGE));
		int dias = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite quantos dias o imposto est� atrasado: ", msg, JOptionPane.QUESTION_MESSAGE));
		switch (dias) {
		case 0: case 1: case 2: case 3: case 4: case 5:
			multa = imposto * 0;
			break;
		case 6: case 7: case 8:
			multa = imposto * 0.02;
			break;
		case 9: case 10:
			multa = imposto *  (0.10  + dias * 0.005);
			break;
		default:
			multa = imposto * 1.50 + dias;
			break;
		}
		JOptionPane.showMessageDialog(null, "Como voc� est� " +dias +" dias de imposto atrasado, voc� deve pagar R$" +multa, msg, JOptionPane.INFORMATION_MESSAGE);
	}
}
