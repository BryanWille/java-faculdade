import java.util.Scanner;

public class ex6c13 {
    public static void main(String[] args) {
        int index, quant = 0;
        String sobrenome, nome;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite o sobrenome: ");
        sobrenome = keyb.nextLine();
        for (int cont = 1; 4 >= cont; cont ++){
            System.out.println(cont +". Digite o nome: ");
            nome = keyb.nextLine();
            String[] sobrPessoa = nome.split(" ");
            index = sobrPessoa.length -1;
            if (sobrPessoa[index].equalsIgnoreCase(sobrenome)){
                quant ++;
            }
        }
        System.out.printf("\nFim, %d pessoas com o sobrenome %s!", quant, sobrenome);
        keyb.close();
    }
}
