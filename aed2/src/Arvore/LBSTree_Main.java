package Arvore;

public class LBSTree_Main {

    public static void main(String[] args){

        String[] vNumeros = {"5", "8", "3", "6", "9", "1", "4", "7", "2"};

        LBSTree lbs = new LBSTree();

        for(String numeros : vNumeros){
            lbs.inserir(numeros);
        }

        System.out.println((String) lbs.obterValorMinimo());

        /* Exercicio
        System.out.println("Tamanho da Árvore: " +lbs.contador);
        System.out.println("Conteúdo: " +lbs.toString());
        System.out.println("PRE-ORDER: " +lbs.caminhar(lbs.PREORDER));
        System.out.println("IN-ORDER: " +lbs.caminhar(lbs.INORDER));
        System.out.println("POST-ORDER: " +lbs.caminhar(lbs.POSTORDER));

        System.out.println("Item '4' está na ávore? " +lbs.buscar("4"));
        System.out.println("Raiz da ávore: " +lbs.raiz);

        System.out.println("Altura " +lbs.altura()); */

    }
}
