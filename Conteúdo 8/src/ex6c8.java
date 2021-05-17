import javax.swing.JOptionPane;
public class ex6c8 {
    public static void main(String[] args){
        int soma = 0, contImpar = 0;
        String msg = "Informações de um número!";
        JOptionPane.showMessageDialog(null, "Vamos falar algumas informações do seu número!", msg, JOptionPane.INFORMATION_MESSAGE);
        for (int contador = 1; 11> contador; contador ++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número " +contador, msg, JOptionPane.QUESTION_MESSAGE));
            if (numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "Seu número: " +numero +" é par!", msg, JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(null, "Seu número: " +numero +" é impar!", msg, JOptionPane.INFORMATION_MESSAGE);
            }
            if (numero % 4 == 0){
                soma += numero;
            }
            if (numero % 3 == 0){
                contImpar += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos números divisíveis por 4 é: " +soma +"\nQuantidades de números divisíveis por 3: " +contImpar
                                        , msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "FIM!", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
