import javax.swing.JOptionPane;

public class ex8c5 {
    public static void main(String[] args) {
        double raio;
        String info = "Valor do raio!";
        int valor = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Você quer achar o valor do raio?", info,
                JOptionPane.YES_NO_OPTION));
        if (valor == 1) {
            System.exit(0);
        }
        Double area = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o valor da área de um setor circular:",
                info, JOptionPane.QUESTION_MESSAGE));
        Double angulo = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o angulo do setor circular: ", info,
                JOptionPane.QUESTION_MESSAGE));
        raio = Math.pow((area * 360) / (angulo * Math.PI), 1 / 2f);
        JOptionPane.showMessageDialog(null, "O seu raio é de " + raio, info, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Fim " + raio, info, JOptionPane.INFORMATION_MESSAGE);
    }

}
