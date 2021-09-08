import javax.swing.JOptionPane;

public class ex3c5 {
    public static void main(String[] args) {
        double liquido, imposto;
        String receita = "Valor Imposto de Renda!";
        JOptionPane.showMessageDialog(null, "Vamos calcular o imposto de renda;", receita,
                JOptionPane.INFORMATION_MESSAGE);
        double salario = Double.valueOf(
                JOptionPane.showInputDialog(null, "Digite o seu sálario", receita, JOptionPane.QUESTION_MESSAGE));
        int dependentes = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o número de dependentes", receita,
                JOptionPane.QUESTION_MESSAGE));
        liquido = salario - (dependentes * 60);
        imposto = liquido * 15 / 100;
        JOptionPane.showMessageDialog(null, "O Valor líquido é R$" + liquido, receita, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O Imposto de Renda é R$" + imposto, receita,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Fim", receita, JOptionPane.QUESTION_MESSAGE);

    }
}
