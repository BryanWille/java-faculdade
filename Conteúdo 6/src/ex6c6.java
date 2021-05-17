import javax.swing.JOptionPane;

public class ex6c6 {
    public static void main(String[] args) {
        double delta, raizDelta, raiz1, raiz2;
        String msg = "Calculador de equa��o 2�";
        int continuar = Integer.valueOf(JOptionPane.showConfirmDialog(null,
                "Voc� quer saber os valores de uma equa��o do 2� grau?", msg, JOptionPane.YES_NO_OPTION));
        if (continuar == 1) {
            JOptionPane.showMessageDialog(null, "Fechando programa!", msg, JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        Double a = Double.valueOf(
                JOptionPane.showInputDialog(null, "Digite o valor de a (x�): ", null, JOptionPane.QUESTION_MESSAGE));
        if (a == 0) {
            JOptionPane.showMessageDialog(null,
                    "Se o seu valor de a � igual a 0, ent�o voc� n�o tem uma equa��o do segundo grau, mas sim do primeiro grau!",
                    msg, JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        Double b = Double.valueOf(
                JOptionPane.showInputDialog(null, "Digite o valor de b (x): ", null, JOptionPane.QUESTION_MESSAGE));
        Double c = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o valor de c (constante): ", null,
                JOptionPane.QUESTION_MESSAGE));
        delta = Math.pow(b, 2) - 4 * a * c;
        raizDelta = Math.pow(delta, 1 / 2.0);
        raiz1 = (-b + raizDelta) / (2.0 * a);
        raiz2 = (-b - raizDelta) / (2.0 * a);
        if (delta == 0) {
            JOptionPane.showMessageDialog(null, "Como Delta � 0 ent�o s� possui uma raiz que �: " + raiz1, msg,
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (delta < 0) {
                JOptionPane.showMessageDialog(null,
                        "Seu delta foi menor que 0 (" + delta + ") ent�o n�o possui ra�zes reais!", msg,
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Seu delta foi " + delta + " ent�o temos 2 ra�zes, " + raiz1 + " e " + raiz2 + " !", msg,
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Fim, Obrigado!", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
