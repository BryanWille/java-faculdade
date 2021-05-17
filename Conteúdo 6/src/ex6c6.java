import javax.swing.JOptionPane;

public class ex6c6 {
    public static void main(String[] args) {
        double delta, raizDelta, raiz1, raiz2;
        String msg = "Calculador de equação 2°";
        int continuar = Integer.valueOf(JOptionPane.showConfirmDialog(null,
                "Você quer saber os valores de uma equação do 2° grau?", msg, JOptionPane.YES_NO_OPTION));
        if (continuar == 1) {
            JOptionPane.showMessageDialog(null, "Fechando programa!", msg, JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        Double a = Double.valueOf(
                JOptionPane.showInputDialog(null, "Digite o valor de a (x²): ", null, JOptionPane.QUESTION_MESSAGE));
        if (a == 0) {
            JOptionPane.showMessageDialog(null,
                    "Se o seu valor de a é igual a 0, então você não tem uma equação do segundo grau, mas sim do primeiro grau!",
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
            JOptionPane.showMessageDialog(null, "Como Delta é 0 então só possui uma raiz que é: " + raiz1, msg,
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (delta < 0) {
                JOptionPane.showMessageDialog(null,
                        "Seu delta foi menor que 0 (" + delta + ") então não possui raízes reais!", msg,
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Seu delta foi " + delta + " então temos 2 raízes, " + raiz1 + " e " + raiz2 + " !", msg,
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Fim, Obrigado!", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
