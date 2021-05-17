import javax.swing.JOptionPane;

public class ex6c5 {
    public static void main(String[] args) {
        double distancia;
        String dist = "Distância entre reta e ponto";
        int continuar = Integer.valueOf(JOptionPane.showConfirmDialog(null,
                "Você quer saber a distância entre as retas e ponto?", dist, JOptionPane.YES_NO_OPTION));
        if (continuar == 1) {
            System.exit(0);
        }
        double a = Double.valueOf(
                JOptionPane.showInputDialog(null, "Digite o coeficiente A da Reta R: ", dist, JOptionPane.QUESTION_MESSAGE));
        double b = Double.valueOf(
                JOptionPane.showInputDialog(null, "Digite o coeficiente B da Reta R: ", dist, JOptionPane.QUESTION_MESSAGE));
        double c = Double.valueOf(
                JOptionPane.showInputDialog(null, "Digite o coeficiente C da Reta R: ", dist, JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null, "Agora os valores x e y do ponto", dist, JOptionPane.INFORMATION_MESSAGE);
        double x = Double.valueOf(
                JOptionPane.showInputDialog(null, "Digite o valor de x: ", dist, JOptionPane.QUESTION_MESSAGE));
        double y = Double.valueOf(
                JOptionPane.showInputDialog(null, "Digite o valor de y: ", dist, JOptionPane.QUESTION_MESSAGE));
        distancia = (a * x + b * y + c) / (Math.pow((Math.pow(a, 2) + Math.pow(b, 2)), 1.0 / 2));
        JOptionPane.showMessageDialog(null, "Achamos a sua distância!", dist, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A distância foi de " + distancia, dist, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Fim " + distancia, dist, JOptionPane.INFORMATION_MESSAGE);
    }
}
