import javax.swing.JOptionPane;

public class ex9c11 {

    public static void main(String[] args) {
        // 132198
        // 13 = Ano ex: 2013
        // 2 = Setor onde trabalha
        // 198 = Ordem de admissão
        int ano;
        String nome = "", msg = "Registro Funcional";
        while (!nome.equalsIgnoreCase("FIM")) {
            nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionário: ('FIM' para encerrar", msg,
                    JOptionPane.QUESTION_MESSAGE);
            if (nome.equalsIgnoreCase("FIM"))
                break;
            int registro = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o registro de: " + nome + " :",
                    msg, JOptionPane.QUESTION_MESSAGE));
            ano = registro % 1000;
            if (ano > 14 || ano < 10 || registro % 100000 == 2) {

            }
        }
    }

}
