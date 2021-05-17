import javax.swing.JOptionPane;

public class ex12c5 {
    public static void main(String[] args) {
        int segundos, minutos, horas;
        String transformar = "Transformador de Segundos para Minutos e Horas!";
        int confirmar = Integer.valueOf(
                JOptionPane.showConfirmDialog(null, "Você quer transformar segundos em horas e minutos e segundos?",
                        transformar, JOptionPane.YES_NO_OPTION));
        if (confirmar == 1) {
            System.exit(0);
        }
        int tempo = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o valor total em segundos: ", transformar,
                JOptionPane.QUESTION_MESSAGE));
        horas = tempo / 3600;
        minutos = (tempo % 3600) / 60;
        segundos = (tempo % 3600) % 60;
        JOptionPane.showMessageDialog(null, +tempo + " segundos convertido fica: \n" + horas + " hora(s)\n" + minutos
                + " minuto(s)\n" + segundos + " segundo(s)", transformar, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Fim", transformar, JOptionPane.INFORMATION_MESSAGE);
    }
}
