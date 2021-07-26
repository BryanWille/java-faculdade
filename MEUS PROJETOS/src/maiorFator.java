public class maiorFator {
    public static void main(String[] args) {
        for (int numero = 1; 1000 > numero; numero += 2) {
            int verificar = 0;
            for (int contador = 0; numero > contador; contador++) {
                if (numero % contador == 0) {
                    verificar ++;
                    System.out.println(verificar);
                }
            }
        }
    }
}
