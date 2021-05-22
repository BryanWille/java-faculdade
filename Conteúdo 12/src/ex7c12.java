import javax.swing.JOptionPane;

public class ex7c12 {
    public static void main(String[] args) {
        String notaNome[][] = new String[50][1], msg = "Notas! ";
        JOptionPane.showMessageDialog(null, "Vamos te dar a relação dos 50 alunos");
        for(int cont = 0; notaNome.length > cont; cont++){
            JOptionPane.showInputDialog(null, "Digite o nome: ");
        }
    }
}
