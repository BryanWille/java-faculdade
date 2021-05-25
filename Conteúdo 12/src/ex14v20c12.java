import java.util.*;

public class ex14v20c12 {
    public static void main(String[] args) {
        String city[][] = new String[10][3], bolha;
        int cont = 0, pop[] = new int[city.length];
        /* Scanner keyb = new Scanner(System.in);
        for (cont = 0; cont < city.length; cont++) {
            System.out.println("Digite o nome da cidade: ");
            city[cont][0] = keyb.nextLine();
            System.out.println("Digite de que estado a cidade " + city[cont][0] + ", é:");
            city[cont][1] = keyb.nextLine();
            System.out.println("Digite a população da cidade " + city[cont][0] + ": ");
            city[cont][2] = keyb.nextLine();
        } */
        Scanner keyb = new Scanner(ex14v20c12.class.getResourceAsStream("cidades.txt"));
        while (keyb.hasNextLine()) {
            city[cont][0] = keyb.nextLine();
            city[cont][1] = keyb.nextLine();
            city[cont][2] = keyb.nextLine();
            cont++;
        }
        System.out.println(Integer.parseInt(city[0][2]));
        for (cont = 0; 10 > cont; cont++) {
            for (int contador = 0; 10 > contador; contador++) {
                pop[contador] = Integer.parseInt(city[cont][2]);
                pop[contador+1] = Integer.parseInt(city[cont + 1][2]);
                if (pop[contador] > pop[contador+1]) {
                    bolha = city[cont][2];
                    city[cont][2] = city[cont + 1][2];
                    city[cont + 1][2] = bolha;
                }
            }
        }
        for (cont = 9; cont >= 0; cont--) {
            System.out.println(cont + 1 + ". " + city[cont][0] + " - " + city[cont][1]
                    + ". População: " + city[cont][2]);
        }
        keyb.close();
    }
}
