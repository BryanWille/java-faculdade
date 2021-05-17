public class ex25c8 {
    public static void main(String[] args) {
        int cont;
        for (int contador = 0; 10 >= contador; contador++) {
            for (cont = 1; 10 >= cont; cont++) {
                for (int c = 1; cont >= c; c++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (cont = 1; 10 >= cont; cont++) {
                for (int c = 10; c >= cont; c--) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}