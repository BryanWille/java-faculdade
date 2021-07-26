import javax.swing.JOptionPane;

public class ex4c4 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual seu primeiro nome?", "Primeiro nome", JOptionPane.QUESTION_MESSAGE);
        String segundoNome = JOptionPane.showInputDialog(null, "Qual seu segundo nome? ", "Segundo nome", JOptionPane.QUESTION_MESSAGE);
        String sobrenome = JOptionPane.showInputDialog(null, "Qual o seu sobroneme? ", "Sobrenome", JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual a sua idade? ", "Idade", JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null, sobrenome + ", " + nome + " " + segundoNome + "\nIdade: " + idade + " anos", "Nome cidade idade quantos anos você tem", JOptionPane.INFORMATION_MESSAGE);
    }

}
