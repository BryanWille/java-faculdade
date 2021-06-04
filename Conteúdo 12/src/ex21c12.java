import javax.swing.JOptionPane;

public class ex21c12 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        String msg = "Exercício 21, Conteúdo 12";

        JOptionPane.showMessageDialog(null, "Vamos armazenar 20 números!",
                msg, JOptionPane.INFORMATION_MESSAGE);
        for (int index: numeros){
            index = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número: ", msg,
                    JOptionPane.QUESTION_MESSAGE));
        }
        for(int bolha =0; bolha < numeros.length; bolha++){
            if (bolha % 2 == 0){

            }
        }
    }
}
