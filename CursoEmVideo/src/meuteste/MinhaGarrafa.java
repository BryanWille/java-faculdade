package meuteste;
import java.util.Random;
import java.util.Scanner;

public class MinhaGarrafa {
    public static GarrafaEmge bryan = new GarrafaEmge();
    public static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args) {
        int index;
        do {
            System.out.println("[1]Status da Garrafa" +
                               "\n[2]Tampar/Destampar" +
                               "\n[3]Mudar líquido" +
                               "\n[4]Colocar/Tirar" +
                               "\n[5]Esvaziar" +
                               "\n[6]Encher");
            System.out.print(">>>");
            index = keyb.nextInt();
            switch (index) {
                case 0:
                    System.out.println("Ok :( Fechando!");
                    break;
                case 1:
                    bryan.status();
                    break;
                case 2:
                    tampar();
                    break;
                case 3:
                    liquido();
                    break;
                case 4:
                    beberColocar();
                    break;
                case 5:
                    bryan.esvaziar();
                    break;
                case 6:
                    bryan.encher();
                    break;
                default:
                    System.out.println("Opção errada! fechando!");
                    break;
            }
        }while (index != 0);
    }

    public static void liquido() {
        int indexSwitch;
        System.out.println("Seu liquido atual é: " + (bryan.getLiquido().equals("vazio") ? "Sem líquido" : bryan.getLiquido()));
            System.out.println("\n[1]Guaraná \n[2]Coca-Cola \n[3]Água \n[4]Café");
            System.out.print(">>> ");
            indexSwitch = keyb.nextInt();
            switch (indexSwitch) {
                case 1:
                    bryan.guarana();
                    break;
                case 2:
                    bryan.coca();
                    break;
                case 3:
                    bryan.agua();
                    break;
                case 4:
                    bryan.cafe();
                    break;
                default:
                    System.out.println("Opção errada! fechando!");
                    break;
            }
    }

    public static void tampar(){
        int indexSwitch;
        do {
            System.out.println("Você deseja tampar ou destampar? \n[0]Sair \n[1]Tampar \n[2]Destampar");
            System.out.print(">>> ");
            indexSwitch = keyb.nextInt();
            if (indexSwitch == 0) {
                System.out.println("Fechando");
            } else if (indexSwitch == 1 || indexSwitch == 2){
                bryan.setTampada(indexSwitch == 1);
            } else {
                System.out.println("Opção errada!");
            }
        } while (indexSwitch != 0);
    }

    public static void beberColocar(){
        int indexSwitch, quant;
            System.out.println("Você deseja beber ou colocar?\n [1]Colocar \n[2]Tirar");
            indexSwitch = keyb.nextInt();
            switch (indexSwitch) {
                case 1:
                    System.out.print("Quanto deseja colocar? ");
                    quant = keyb.nextInt();
                    if ((bryan.getPreenchimento() + quant) > 100) {
                        System.out.println("Acima da capacidade! parando em 100");
                        bryan.setPreenchimento(100);
                    } else {
                        bryan.setPreenchimento(bryan.getPreenchimento() + quant);
                    }
                    break;
                case 2:
                    System.out.println("Quanto deseja tirar? ");
                    quant = keyb.nextInt();
                    if (bryan.getPreenchimento() - quant < 0) {
                        System.out.println("Abaixo da capcidade! parando em 0");
                        bryan.setPreenchimento(0);
                    } else {
                        bryan.setPreenchimento(bryan.getPreenchimento() - quant);
                    }
                    break;
                default:
                    System.out.println("Opção errada! fechando!");
                    break;
            }
    }
}