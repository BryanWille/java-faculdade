import javax.swing.JOptionPane;

public class ex1c8 {
    public static void main(String[] args) {
        int contador;
        double area;
        String msg = "3 raios e 3 areas!";
        JOptionPane.showMessageDialog(null, "Vamos calcular a area de três raios diferentes!", msg,
                JOptionPane.INFORMATION_MESSAGE);
        for (contador = 1; contador <= 3; contador++) {
            double raio = Double.valueOf(
                    JOptionPane.showInputDialog(null, "Digite o raio " + contador, msg, JOptionPane.QUESTION_MESSAGE));
            area = 3.1416 * Math.pow(raio, 2);
            JOptionPane.showMessageDialog(null, "A area do raio " + contador + " é " + area, msg,
                    JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "FIM", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
