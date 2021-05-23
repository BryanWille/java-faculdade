import javax.swing.JOptionPane;

public class ex7c12 {
    public static void main(String[] args) {
        String nome[] = new String[3], rank[] = new String[3], msg = "Notas! ";
        JOptionPane.showMessageDialog(null, "Vamos te dar a relação dos 50 alunos");
        for (int cont = 0; nome.length > cont; cont++) {
            nome[cont] = JOptionPane.showInputDialog(null,
                    "Digite o nome: ", msg, JOptionPane.QUESTION_MESSAGE);
            int nota = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Qual a nota do aluno(a) " + nome[cont], msg, JOptionPane.QUESTION_MESSAGE));
            if (nota <= 30) {
                rank[cont] = "D";
            } else if (nota <= 60) {
                rank[cont] = "C";
            } else if (nota <= 80) {
                rank[cont] = "B";
            } else {
                rank[cont] = "A";
            }
        }
        for (int cont = 0; cont < nome.length; cont++) {
            JOptionPane.showMessageDialog(null, nome[cont] + " - "
                    + rank[cont], msg, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
