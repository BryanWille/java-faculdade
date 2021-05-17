import javax.swing.JOptionPane;

public class ex1c5 {
    public static void main(String[] args) {
        String fx = "f(x)= x³ + 4x + 10";
        double funcao;
        JOptionPane.showMessageDialog(null, "Vamos calcular o x de " + fx, fx, JOptionPane.INFORMATION_MESSAGE);
        double x = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o valor de x: ", fx, JOptionPane.QUESTION_MESSAGE));
        funcao = Math.pow(x, 3) + (4 * x) + 10;
        JOptionPane.showMessageDialog(null, "O valor da sua função f(" + x + ") = " + funcao, fx, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Fim", fx, JOptionPane.INFORMATION_MESSAGE);
    }
}
