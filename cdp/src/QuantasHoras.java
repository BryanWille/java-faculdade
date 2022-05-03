import java.util.Scanner;

public class QuantasHoras {
    public static void main(String[] args) {
        int dif, totMin1, totMin2;
        String horas, result;

        Scanner keyb = new Scanner(System.in);
        horas = keyb.nextLine();

        String[] numStr = horas.split(" ");
        int[] num = new int[numStr.length];
        for (int i = 0; i < numStr.length; i++) {
            num[i] = Integer.parseInt(numStr[i]);
        }

        totMin1 = num[0] * 60 + num[1];
        totMin2 = num[2] * 60 + num[3];

        if (totMin2 - totMin1 < 0) {
            totMin1 = 1440 - totMin1;
            dif = totMin1 + totMin2;
        } else {
            dif = totMin2 - totMin1;
        }

        result = dif == 0 ? "" : String.valueOf(dif);

        System.out.print(result);
    }
}

