public class ex24c8 {
    public static void main(String[] args) {
        int c, contDez = 0;
        do {
            c = 1;
            do {
                for (int cont = 1; c >= cont; cont++) {
                    System.out.print("*");
                }
                c++;
                System.out.println("");
            } while (c != 11);
            c = 1;
            do {
                for (int cont = 10; cont >= c; cont--) {
                    System.out.print("*");
                }
                c++;
                System.out.println("");
            } while (c != 11);
            contDez += 1;
        } while (contDez < 10);
    }
}
