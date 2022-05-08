public class contrario {
    public static void main(String[] args) {
        String cartas = "2222";
        String contrario = "";
        for (int i = cartas.length() - 1; i >= 0; i--) {

            contrario += cartas.charAt(i);


        }
        System.out.println(contrario + " " + cartas);
    }
}
