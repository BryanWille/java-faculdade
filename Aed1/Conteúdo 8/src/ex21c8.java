import javax.swing.JOptionPane;

public class ex21c8 {
    public static void main(String[] args) {
        int contador, cont = 0;
        String msg = "Verificador de número primo";
        JOptionPane.showMessageDialog(null, "Vamos verificar se seu número primo!", msg, JOptionPane.INFORMATION_MESSAGE);
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", msg, JOptionPane.QUESTION_MESSAGE));
        for (contador = 1; numero >= contador; contador++){
            if (numero % contador == 0) {
                cont += 1;
            }
        }
        if (cont == 2){
            JOptionPane.showMessageDialog(null, "O número " +numero +" é primo! pois só é divisivel por um e ele mesmo", msg, JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Seu número não e primo! pois é dividido por " +cont +" numeros");
        }
    }
}
