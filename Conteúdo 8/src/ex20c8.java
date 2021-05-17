import java.util.Scanner;

public class ex20c8 {
    public static void main(String[] args) {
        double imc, altura;
        String status = "";
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos testar o imc da sua altura entre 60 a 100kg!");
        System.out.println("Digite a sua altura (em m): ");
        altura = keyb.nextDouble();
        altura = Math.pow(altura, 2);
        System.out.println("Peso (kg) -     IMC     - Situação Corpórea");
        for (int contador = 60; 100 >= contador; contador++) {
            imc = contador / altura;
            if (18.5 > imc) {
                status = "Abaixo do Peso";
            } else if (24.9 > imc) {
                status = "Peso Normal";
            } else if (29.9 > imc) {
                status = "Sobrepeso";
            } else if (34.9 > imc) {
                status = "Obesidade Grau 1";
            } else if (39.9 > imc) {
                status = "Obesidade Grau 2";
            } else {
                status = "Obesidade Grau 3";
            }
            System.out.println(contador +"        -   " +imc +" - " +status);
        }
        keyb.close();
        System.out.println("Peso (kg) -     IMC     - Situação Corpórea");
    }
}