import javax.swing.JOptionPane;
public class ex5c4 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome? ", "Ficha Funcional", JOptionPane.QUESTION_MESSAGE);
        String cpf = JOptionPane.showInputDialog(null, "Qual o seu CPF? ", "Ficha Funcional", JOptionPane.QUESTION_MESSAGE);
        String identidade = JOptionPane.showInputDialog(null, "Qual sua identidade? ", "Ficha Funcional", JOptionPane.QUESTION_MESSAGE);
        String tituloEleitor = JOptionPane.showInputDialog(null, "Qual o seu Titulo de Eleitor? ", "Ficha Funcional", JOptionPane.QUESTION_MESSAGE);
        String cartMotorista = JOptionPane.showInputDialog(null, "Qual sua carteira de motorista? ", "Ficha Funcional", JOptionPane.QUESTION_MESSAGE);
        String empresa = JOptionPane.showInputDialog(null, "Qual o nome da empresa onde trabalha?", "Ficha Funcional", JOptionPane.QUESTION_MESSAGE);
        double salario = Double.valueOf(JOptionPane.showInputDialog(null, "Qual o seu salário? ", "Ficha Funcional", JOptionPane.QUESTION_MESSAGE));
        System.out.println("FICHA FUNCIONAL DE: " +nome);
        System.out.println();
        System.out.println("Documentos: ");
        System.out.println("CPF.........................." +cpf);
        System.out.println("Identidade..................." +identidade);
        System.out.println("Titulo de Eleitor............" +tituloEleitor);
        System.out.println("Carteira de Motorista........" +cartMotorista);
        System.out.print("\nNome da Empresa: " +empresa +"\nSalário de R$" +salario);
        System.out.println("\nFim");
    }

}
