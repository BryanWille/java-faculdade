import javax.swing.JOptionPane;
public class ex6c8 {
    public static void main(String[] args){
        int soma = 0, contImpar = 0;
        String msg = "Informa��es de um n�mero!";
        JOptionPane.showMessageDialog(null, "Vamos falar algumas informa��es do seu n�mero!", msg, JOptionPane.INFORMATION_MESSAGE);
        for (int contador = 1; 11> contador; contador ++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero " +contador, msg, JOptionPane.QUESTION_MESSAGE));
            if (numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "Seu n�mero: " +numero +" � par!", msg, JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(null, "Seu n�mero: " +numero +" � impar!", msg, JOptionPane.INFORMATION_MESSAGE);
            }
            if (numero % 4 == 0){
                soma += numero;
            }
            if (numero % 3 == 0){
                contImpar += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos n�meros divis�veis por 4 �: " +soma +"\nQuantidades de n�meros divis�veis por 3: " +contImpar
                                        , msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "FIM!", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
