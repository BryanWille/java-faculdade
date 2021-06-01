import javax.swing.JOptionPane;

public class ex19c12 {
    public static void main(String[] args) {
        boolean testeLog = false;
        String[] bilhete = new String[100];
        String msg = "Bilhete premidado!", premiado;
        JOptionPane.showMessageDialog(null, "Vamos ler todos os seus 100 bilhetes!",
                msg, JOptionPane.INFORMATION_MESSAGE);
        for (int cont = 0; cont < bilhete.length; cont++) {
            bilhete[cont] = JOptionPane.showInputDialog(null, cont + ". Digite o bilhete",
                    msg, JOptionPane.QUESTION_MESSAGE);
        }
        premiado = JOptionPane.showInputDialog(null, "Digite o bilhete sorteado:",
                msg, JOptionPane.QUESTION_MESSAGE);
        for (String s : bilhete) {
            if (s.equalsIgnoreCase(premiado)) {
                JOptionPane.showMessageDialog(null, "Parabéns, você teve o bilhete premiado!" +
                        " que é: " + premiado, msg, JOptionPane.INFORMATION_MESSAGE);
                testeLog = true;
            }
        }
        if (!testeLog) {
            JOptionPane.showMessageDialog(null, "Infelizmente você não " +
                    "acertou nenhum bilhete :(", msg, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}