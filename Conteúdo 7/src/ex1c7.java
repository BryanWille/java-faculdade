import javax.swing.JOptionPane;

public class ex1c7 {
    public static void main(String[] args) {
        String msg = "Loteria esportiva", premio = "";
        JOptionPane.showMessageDialog(null, "Vamos ver se você recebeu um prêmio da loteria esportiva!", msg,
                JOptionPane.INFORMATION_MESSAGE);
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ", msg, JOptionPane.QUESTION_MESSAGE);
        int jogos = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite quantos jogos você acertou:", msg,
                JOptionPane.QUESTION_MESSAGE));
        switch (jogos) {
            case 0: case 1: case 2: case 3: case 4: case 5:
                premio = "Nenhum pr�mio";
                break;
            case 6: case 7: case 8: case 9: case 10:
                premio = "Ganhou outro cartão";
                break;
            case 11:
                premio = "R$100,00";
                break;
            case 12:
                premio = "R$1000,00";
                break;
            case 13:
                premio = "R$50.000,00";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você digitou um número de jogos inválidos!", msg, JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                break;
        }
        JOptionPane.showMessageDialog(null, nome +", você recebeu um prêmio de: " +premio, msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
