import javax.swing.JOptionPane;

public class ex10c6 {
    public static void main(String[] args) {
        double rendimento, impostoRenda, valorResgatado;
        String msg = "Aplicação financeira a ser resgatada!";
        int continuar = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Você quer saber o seus rendimentos?", msg, JOptionPane.YES_NO_OPTION));
        if (continuar == 1) {
            System.exit(0);
        }
        double capital = Double.valueOf(
                JOptionPane.showInputDialog(null, "Qual foi o capital aplicado? ", msg, JOptionPane.QUESTION_MESSAGE));
        int dias = Integer.valueOf(
                JOptionPane.showInputDialog(null, "Por quantos dias foi aplicado?", msg, JOptionPane.QUESTION_MESSAGE));
        double taxa = Double
                .valueOf(JOptionPane.showInputDialog(null, "Qual a taxa diária? ", msg, JOptionPane.QUESTION_MESSAGE));
        rendimento = capital * (taxa / 100.0) * dias;
        impostoRenda = rendimento * 0.15;
        valorResgatado = capital + rendimento - impostoRenda - 10;
        JOptionPane.showMessageDialog(null, "O Seu rendimento foi de R$" + rendimento, msg,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O Imposto de renda de R$" + rendimento + " foi R$" + impostoRenda, msg,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "E portanto o valor resgatado foi de R$" + valorResgatado, msg,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Fim", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
