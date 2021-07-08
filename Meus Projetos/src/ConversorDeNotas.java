import java.util.Scanner;

public class ConversorDeNotas {
    public static void main(String[] args) {
        int contador = 0;
        String musica, trad[][] = new String[61][2];
        Scanner tradutor = new Scanner(ConversorDeNotas.class.getResourceAsStream("notas.txt"));
        Scanner simb = new Scanner(ConversorDeNotas.class.getResourceAsStream("numeros.txt"));
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("\nDigite fim para finalizar!");
            System.out.println("\nFale a nota que quer traduzir: ");
            musica = keyb.nextLine();
            if (!musica.equalsIgnoreCase("fim")) {
                musica = musica.replace("", " ").replace("[", " [")
                        .replace("]", "] ");
                String notas[] = musica.split(" ");
                while (tradutor.hasNextLine()) {
                    trad[contador][0] = simb.nextLine();
                    trad[contador][1] = tradutor.nextLine();
                    contador++;
                }
                for (int conta = 0; notas.length > conta; conta++) {
                    for (int cont = 0; (contador - 1) > cont; cont++) {
                        if (notas[conta].equals(trad[cont][0])) {
                            notas[conta] = trad[cont][1];
                        }
                    }
                }
                for (int conta = 0; notas.length > conta; conta++) {
                    System.out.print(notas[conta] + " ");
                }
            }
        } while (!musica.equalsIgnoreCase("fim"));
        keyb.close();
    }
}