import java.util.Scanner;

public class eleicao {
    public static void main(String[] args) {
        int beltrano = 0, ciclano = 0, fulano = 0, nulo = 0;
        System.out.println("Digite em quem você vota: ");
        System.out.println("[0]nulo \n[1]Beltrano \n[2]Ciclano \n[3]Fulano");
        primeiroTurno(beltrano, ciclano, fulano, nulo);
    }
    public static int[] primeiroTurno(int contBel, int contCic, int contFul, int contNul){
        int voto;
        int[] resultados = new int[4];
        Scanner keyb = new Scanner(System.in);
        for(int cont = 1; cont <= 10; cont++){
            boolean votou = true;
            do{
                System.out.println("\n \n \n " +cont);
                System.out.print("\nSeu voto >>> ");
                voto = keyb.nextInt();
                switch(voto){
                    case 0:
                        contNul ++;
                        resultados[0] = contNul;
                        break;
                    case 1:
                        contBel ++;
                        resultados[1] = contBel;
                        break;
                    case 2:
                        contCic ++;
                        resultados[2] = contCic;
                        break;
                    case 3:
                        contFul ++;
                        resultados[3] = contFul;
                        break;
                    default:
                        votou = false;
                        break;
                }
            }while(!votou);
        }
        keyb.close();
        return resultados;
    }
}
