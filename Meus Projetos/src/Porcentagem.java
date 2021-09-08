import javax.swing.JOptionPane;

public class Porcentagem {
    public static void main(String[] args){
        int tot, num, continuar = 1;
        String msg = "Calculador de Porcentagem";
        String[] opcoes = {"Sim", "Não"};
        JOptionPane.showMessageDialog(null, "Vamos calcular a porcentagem a relativa a um número seu!",
                msg, JOptionPane.INFORMATION_MESSAGE);
        do {
            if(continuar != 0) {
                tot = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o total do seu número: ",
                        msg, JOptionPane.QUESTION_MESSAGE));
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número que quer saber a porcentagem de "
                        + tot, msg, JOptionPane.QUESTION_MESSAGE));
                double porc = (num / tot) * 100;
                JOptionPane.showMessageDialog(null, "A sua porcentagem é: " +porc +"%", msg,
                        JOptionPane.INFORMATION_MESSAGE);
            }
            continuar = JOptionPane.showOptionDialog(null, "Você quer continuar?", msg,
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        } while (continuar != 0);
    }
}
