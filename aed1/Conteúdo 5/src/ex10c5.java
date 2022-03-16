import javax.swing.JOptionPane;

public class ex10c5 {
    public static void main(String[] args) {
        int a1, a2, a3, a4, a5;
        String divisor = "Divisor de algarismo!";
        int confirmar = Integer.valueOf(JOptionPane.showConfirmDialog(null,
                "Você quer dividir seu numero em algarismos: ", divisor, JOptionPane.YES_NO_OPTION));
        if (confirmar == 1) {
            System.exit(0);
        }
        int numero = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite um número de 5 digitos: ", divisor,
                JOptionPane.QUESTION_MESSAGE));
        a1 = numero % 10;
        a2 = (numero % 100) / 10;
        a3 = (numero / 100) % 10;
        a4 = (numero / 1000) % 10;
        a5 = numero / 10000;
        JOptionPane.showMessageDialog(null,
                "Número lido: " + numero + "\nImpressão =" + "\n" + a5 + "\n" + a4 + "\n" + a3 + "\n" + a2 + "\n" + a1,
                divisor, JOptionPane.INFORMATION_MESSAGE);
    }
}
