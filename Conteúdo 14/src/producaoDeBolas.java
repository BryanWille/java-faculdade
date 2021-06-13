import javax.swing.*;

public class producaoDeBolas {
    public static void estocagem() {
        double caixa, galpao, custoTotal;
        String msg = "Bolas para copa do mundo!";
        int cont = JOptionPane.showConfirmDialog(null, "Voc� quer saber o pre�o de estocagem de bolas para a pr�xima copa do mundo?", msg, JOptionPane.YES_NO_OPTION);
        if (cont == 1) {
            System.exit(0);
        }
        int bola = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas bolas foram produzidas?", msg,
                JOptionPane.QUESTION_MESSAGE));
        int bolaDefeito = Integer.parseInt(JOptionPane.showInputDialog(null, "Dessas bolas quantos tiveram defeitos?",
                msg, JOptionPane.QUESTION_MESSAGE));
        double precoPapelao = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Qual o pre�o �nitario da caixa da papel�o?", msg, JOptionPane.QUESTION_MESSAGE));
        double aluguel = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos reais � o aluguel do galp�o?", msg,
                JOptionPane.QUESTION_MESSAGE));
        int meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Faltam quantos meses para a copa?", msg,
                JOptionPane.QUESTION_MESSAGE));
        caixa = (bola - bolaDefeito) / 10;
        if (((bola - bolaDefeito) % 10) > 0) {
            caixa = caixa + 1;
        }
        galpao = caixa / 850;
        if ((caixa % 850) > 0) {
            galpao = (galpao - galpao % 1) + 1;
        }
        custoTotal = (galpao * (aluguel * meses)) + (caixa * precoPapelao);
        JOptionPane.showMessageDialog(null, "O Custo Total com a armazenagem � de: R$" + custoTotal, msg,
                JOptionPane.INFORMATION_MESSAGE);
    }

}
