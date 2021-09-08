import javax.swing.JOptionPane;

public class ex9c8 {
    public static void main(String[] args) {
        String msg = "Estatíscas de Dados de Alunos:";
        String[] botoes = {"Masc", "Fem"};
        int contMulher = 0, contHomem = 0, somaHomem = 0, somaMulher = 0;
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantas pessoas quer tirar a informação: ", msg, JOptionPane.QUESTION_MESSAGE));
        for (int contador = 1; c >= contador; contador++) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno:", msg, JOptionPane.QUESTION_MESSAGE);
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade de " + nome, msg, JOptionPane.QUESTION_MESSAGE));
            int sexo = JOptionPane.showOptionDialog(null, "Qual o sexo de " + nome + ":", msg,
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
            switch (sexo) {
                case 0:
                    contHomem += 1;
                    somaHomem += idade;
                    break;
                case 1:
                    contMulher += 1;
                    somaMulher += idade;
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "A média das idades dos homens foi de: " + ((float) somaHomem / contHomem), msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A média das idades das mulheres foi de: " + ((float) somaMulher / contMulher), msg, JOptionPane.INFORMATION_MESSAGE);
    }
}


