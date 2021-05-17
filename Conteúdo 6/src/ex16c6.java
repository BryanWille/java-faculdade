import javax.swing.JOptionPane;

public class ex16c6 {
    public static void main(String[] args) {
        String msg = "Resultado Final", resultadoFinal = "";
        Double maiorNota, peso1 = 0.0, peso2 = 0.0, notaFinal;
        int continuar = JOptionPane.showConfirmDialog(null, "Quer saber o Resultado final?", msg,
                JOptionPane.YES_NO_OPTION);
        if (continuar == 1) {
            JOptionPane.showMessageDialog(null, "Fechando o programa!", msg, JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        String aluno = JOptionPane.showInputDialog(null, "Qual o nome do aluno? ", msg, JOptionPane.QUESTION_MESSAGE);
        int faltas = Integer.valueOf(JOptionPane.showInputDialog(null, "Quantas faltas teve o aluno " + aluno + " ?",
                msg, JOptionPane.QUESTION_MESSAGE));
        Double prova1 = Double.valueOf(JOptionPane.showInputDialog(null,
                "Quanto o aluno " + aluno + ", tirou na primeira prova? ", msg, JOptionPane.QUESTION_MESSAGE));
        Double prova2 = Double.valueOf(JOptionPane.showInputDialog(null,
                "Quanto o aluno " + aluno + ", tirou na segunda prova? ", msg, JOptionPane.QUESTION_MESSAGE));
        Double prova3 = Double.valueOf(JOptionPane.showInputDialog(null,
                "Quanto o aluno " + aluno + ", tirou na terceira prova? ", msg, JOptionPane.QUESTION_MESSAGE));
        Double trabalho = Double.valueOf(JOptionPane.showInputDialog(null,
                "Quanto o aluno " + aluno + ", tirou no trabalho?", msg, JOptionPane.QUESTION_MESSAGE));
        int idade = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual a idade do aluno " + aluno + " ?", msg,
                JOptionPane.QUESTION_MESSAGE));
        if (prova1 > prova2 && prova2 > prova3 || prova1 > prova3 && prova2 > prova3) {
            maiorNota = prova1 + prova2;
        } else {
            if (prova1 > prova3 && prova3 > prova2 || prova1 > prova2 && prova3 > prova2) {
                maiorNota = prova1 + prova3;
            } else {
                maiorNota = prova2 + prova3;
            }
        }
        if (5 > faltas) {
            peso1 += 3;
        } else {
            if (faltas >= 5 && 10 > faltas) {
                peso1 += 2;
            } else {
                peso1 += 1;
            }
        }
        if (idade <= 17) {
            peso2 += 1;
        } else {
            if (idade >= 18 && 50 > idade) {
                peso2 += 2;
            } else {
                peso2 += 3;
            }
        }
        notaFinal = (maiorNota / 2.0) * peso1 + trabalho * peso2;
        if (notaFinal < 50) {
            resultadoFinal = "Reprovado!";
        } else {
            if (notaFinal >= 50 && 70 > notaFinal) {
                resultadoFinal = "Regular!";
            } else {
                if (notaFinal >= 70 && 80 > notaFinal) {
                    resultadoFinal = "Bom!";
                } else {
                    if (notaFinal >= 80 && 90 > notaFinal) {
                        resultadoFinal = "Muito Bom!";
                    } else {
                        resultadoFinal = "Excelente!";
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null,
                "A nota final do aluno " + aluno + ", foi de " + notaFinal + " e o seu Resultado é " + resultadoFinal,
                msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "FIM", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
