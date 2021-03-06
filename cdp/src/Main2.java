import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main2 {

    public static String[] conversaoCar = {"4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"};
    public static String[] conversaoNaipe = {"D", "S", "H", "C"};
    public static int[][] cartas = criarVetorCartas();

    public static void main(String[] args) throws IOException {

        int cont = 0;

        Scanner keyb = new Scanner(System.in);
        String partida = keyb.nextLine().toUpperCase();
        int rodada = Integer.parseInt(partida.substring(0, partida.indexOf(" ")));
        String manilha = partida.substring(partida.indexOf(" ") + 1);
        setarMaiorManilha(manilha);

        String[] jogadores = new String[4];
        int[][] chute = new int[4][2];

        for (int i = 0; i < jogadores.length; i++) {
            String jogada = keyb.nextLine();
            jogadores[i] = jogada.substring(0, jogada.indexOf(" "));
            chute[i][0] = Integer.parseInt(jogada.substring(jogada.indexOf(" ") + 1));
        }

        for (int i = 0; i < rodada; i++) {
            String[] cartasJogadas = keyb.nextLine().split(" ");
            chute[ganhadorRodada(cartasJogadas)][1] += 1;
            System.out.println(jogadores[ganhadorRodada(cartasJogadas)]);
        }

        String ganhador = "*";
        int contGanha = 0;

        for (int i = 0; i < chute.length; i++) {
            if (chute[i][0] == chute[i][1]) {
                ganhador = jogadores[i];
                contGanha++;
            }
        }

        if (contGanha == 1) {
            System.out.print(ganhador);
        } else {
            System.out.print("*");
        }
    }

    public static int[][] criarVetorCartas() {
        int cont = 0;
        int[][] cartas = new int[10][4];
        for (int i = 0; i < cartas.length; i++) {
            for (int j = 0; j < cartas[0].length; j++) {
                cartas[i][j] = cont;
                cont++;
            }
        }
        return cartas;
    }

    public static void setarMaiorManilha(String manilha) {
        for (int i = 0; i < conversaoCar.length; i++) {
            if (conversaoCar[i].equalsIgnoreCase(manilha.substring(0, 1))) {
                for (int j = 0; j < cartas[i].length; j++) {
                    cartas[(i + 1) % conversaoCar.length][j] = 40 + i;
                }
            }
        }
    }

    public static int converter(String carta) {
        int valorCarta = 0;
        for (int i = 0; i < conversaoCar.length; i++) {
            for (int j = 0; j < conversaoNaipe.length; j++) {
                String num = carta.substring(0, 1);
                String naipe = carta.substring(1);
                if (num.equalsIgnoreCase(conversaoCar[i]) && naipe.equalsIgnoreCase(conversaoNaipe[j])) {
                    valorCarta = cartas[i][j];
                }
            }
        }
        return valorCarta;
    }

    public static int ganhadorRodada(String[] cartasJogadas) {
        int maiorCarta = 0, jogador = 0;
        for (int i = 0; i < cartasJogadas.length; i++) {
            int valor = converter(cartasJogadas[i]);
            if (valor > maiorCarta) {
                maiorCarta = valor;
                jogador = i;
            }
        }
        return jogador;
    }
}