//Programa feito por Bryan Wille
//github.com/bryanwille - twitter.com/sr_wille

//Abaixo eu fiz um programa onde se criptografa ou descriptografa com a cifra de césar, onde nada mais é do que
//pular as letras do alfabeto em quatro posições, ou seja A = D, B = E, C = F... e por assim vai!

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CriptografiaDeCesar {
    public static void main(String[] args) {

        // Declaração de Variavéis!

        String botoes[] = {"Criptografar", "Descriptografar"}, crypt = "",
                msg = "Criptografia de César", alpha[][] = new String[26][2];
        int opcao = 0;

        //Aqui estamos pegando o Arquivo txt do nosso alfabeto!

        Scanner alfabeto = new Scanner(CriptografiaDeCesar.class.getResourceAsStream("alfabeto.txt"));

        //Aqui estamos pegando o Arquivo txt da cifra de César!

        Scanner cesar = new Scanner(CriptografiaDeCesar.class.getResourceAsStream("alfabeto_cesar.txt"));
        JOptionPane.showMessageDialog(null, "Vamos Criptografar ou Descriptografar" +
                " a Criptografia de César!", msg, JOptionPane.INFORMATION_MESSAGE);

        //Aqui fazemos uma matriz com o arquivo txt, onde a primeira coluna é o alfabeto, e a segunda a cifra de César

        for (int contador = 0; alpha.length > contador; contador++) {
            alpha[contador][0] = alfabeto.nextLine();
            alpha[contador][1] = cesar.nextLine();
        }

        //Aqui vamos fazer as criptografias até o usuário pedir para parar

        do {

            //Usuário nos dá a mensagem que quer criptografar ou descriptografar

            crypt = JOptionPane.showInputDialog(null,
                    "Digite a sua mensagem: (Para sair digite /fechar)", msg, JOptionPane.QUESTION_MESSAGE);

            //Se o usúario quiser fechar o programa, só usa /fechar

            if (crypt.equalsIgnoreCase("/fechar")) {
                JOptionPane.showMessageDialog(null, "Ok :( \nFechando o Programa!",
                        msg, JOptionPane.INFORMATION_MESSAGE);
                break;

            }

            // Adicionado os espaços para não dar erro na troca de letras!

            crypt = crypt.replace("", " ");

            //Aqui estamos fazendo a Array da mensagem!

            String mensagem[] = crypt.split(" ");

            //Usuário seleciona se quer criptografar ou descriptografar!

            opcao = JOptionPane.showOptionDialog(null, "O que você quer fazer " +
                            "com essa mensagem? ", msg, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);

            //Usando switch para o que o usuário selecionou!

            switch (opcao) {

                //Se for 0 ou a opção "Criptografar", então vamos criptografar a mensagem que ele nos passou!

                case 0:

                    //Temos dois for, o primeiro vai nos dar todas as posições da array da mensagem a ser criptografada!

                    for (int contador = 0; mensagem.length > contador; contador++) {

                        //O segundo for, vai dar as posições da matriz do alfabeto!

                        for (int cont = 0; alpha.length > cont; cont++) {

                            //Quando achar a palavra no alfabeto igual a do usuário, então ele vai passar
                            //a palavra na cifra de César equivalente, e fechar com o break!

                            if (mensagem[contador].equalsIgnoreCase(alpha[cont][0])) {
                                mensagem[contador] = alpha[cont][1];
                                break;
                            }
                        }
                    }
                    break;

                // Se for 1 ou a opção "Descriptografar", vamos descriptografar a mensagem que ele nos passou!

                case 1:

                    //Os for de descriptografia tem a mesma função de criptografia, o que muda é o if dentro do for

                    for (int contador = 0; mensagem.length > contador; contador++) {
                        for (int cont = 0; alpha.length > cont; cont++) {

                            //Agora vamos buscar a mensagem informada pelo usuáriu na cifra de César
                            //E depois a sua equivalente no alfabeto, e fechar o for quando acha-lá

                            if (mensagem[contador].equalsIgnoreCase(alpha[cont][1])) {
                                mensagem[contador] = alpha[cont][0];
                                break;
                            }
                        }
                    }
                    break;
            }

            //Aqui vamos imprimir agora a mensagem de acordo com input e output do usuário

            for (int contador = 0; mensagem.length > contador; contador++) {
                System.out.print(mensagem[contador] + " ");
            }

            //Para separar essa da próxima mensagem Criptofrada!

            System.out.println("\n");
        } while (crypt.equalsIgnoreCase("/fechar"));
        cesar.close();
        alfabeto.close();

        //Fim, obrigado por ler!


    }
}
