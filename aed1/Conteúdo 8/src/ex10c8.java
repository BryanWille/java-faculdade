import javax.swing.JOptionPane;

public class ex10c8 {
    public static void main(String[] args){
        double custoParcial, custoTotal = 0, maior = 0;
        String msg = "Cálculos para sua obra!", maiorInsumo = "";
        JOptionPane.showMessageDialog(null, "Vamos fazer os calculos para sua obra!", msg, JOptionPane.INFORMATION_MESSAGE);
        int quantIns = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de insumos: ", msg, JOptionPane.QUESTION_MESSAGE));
        for (int cont = 1; quantIns >= cont; cont++){
            String insumo = JOptionPane.showInputDialog(null, "Digite o nome do insumo: ", msg, JOptionPane.QUESTION_MESSAGE);
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite q quantidade de " +insumo +" :", msg, JOptionPane.QUESTION_MESSAGE));
            double preco = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o preço unitário de " +insumo +" :", msg, JOptionPane.QUESTION_MESSAGE));
            custoParcial = quantidade * preco;
            JOptionPane.showMessageDialog(null, "O Custo parcial foi: " +custoParcial, msg, JOptionPane.INFORMATION_MESSAGE);
            custoTotal += custoParcial;
            if(custoParcial > maior){
                maior = custoParcial;
                maiorInsumo = insumo;
            }
        }
        JOptionPane.showMessageDialog(null, "O Custo total foi de: " +custoTotal, msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A média dos custos parciais foi: " +(custoTotal/quantIns), msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O nome do maior insumo é: " +maiorInsumo, msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
