package meuteste;
import java.util.Random;
import java.util.Scanner;

public class MinhaGarrafa {
    public static GarrafaEmge bryan = new GarrafaEmge();

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int index, quant, indexSwitch;
        String liquido = null;
        do {
            System.out.println("[1]Status da Garrafa" +
                               "\n[2]Tampar/Destampar" +
                               "\n[3]Escolher líquido" +
                               "\n[4]Colocar" +
                               "\n[5]Tirar" +
                               "\n[6]Esvaziar" +
                               "\n[7]Encher");
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
                    bryan.setTampada(true);
                    break;
                case 3:
                    System.out.println("\n[1]Guaraná \n[2]Coca-Cola \n[3]Água \n[4]Café");
                    System.out.print(">>> ");
                    indexSwitch = keyb.nextInt();
                    switch (indexSwitch){
                        case 1:
                            bryan.guarana();
                            liquido = "Guaraná";
                            break;
                        case 2:
                            bryan.coca();
                            liquido = "Coca-Cola";
                            break;
                        case 3:
                            bryan.agua();
                            liquido = "Água";
                            break;
                        case 4:
                            bryan.cafe();
                            liquido = "Café";
                            break;
                    }
                    break;
                case 4:
                    if(liquido == null) {
                        System.out.println("Você primeiro deve escolher o liquído!");
                        break;
                    } else {
                        System.out.print("Quanto você quer colocar em porcentagem? ");
                        quant = keyb.nextInt();
                        bryan.colocarLiquido(liquido, quant);
                    }
                    break;
                case 5:
                    if(liquido == null) {
                        System.out.println("Você primeiro deve escolher o liquído!");
                        break;
                    } else {
                        System.out.print("Quanto você quer tirar em porcentagem? ");
                        quant = keyb.nextInt();
                        bryan.retirarLiquido(liquido, quant);
                    }
                    break;
                case 6:
                    bryan.esvaziar();
                    break;
                case 7:
                    bryan.encher();
                    break;
                default:
                    System.out.println("Opção errada! fechando!");
                    break;
            }
        }while (index != 0);
        keyb.close();
    }
}