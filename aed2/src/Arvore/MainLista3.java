package Arvore;

public class MainLista3 {
    public static void main(String[] args){
        /*LBSTree arvore = new LBSTree();
        arvore.inserir("29");
        arvore.inserir("22");
        arvore.inserir("2");
        arvore.inserir("43");
        System.out.println(arvore.consultarRaiz());
        System.out.println(arvore.valorMinimo());*/


        LBSTree arvore = new LBSTree();
        System.out.println(arvore.consultarRaiz());
        String[] v = {"5", "8", "3", "6", "9", "1", "4", "7", "2", "0"};
        for (String elementos : v){
            arvore.inserir(elementos);
        }
        System.out.println(arvore.caminhar(arvore.INORDER));
        System.out.println(arvore.caminhar(arvore.PREORDER));
        System.out.println(arvore.caminhar(arvore.POSTORDER));

        System.out.println(arvore.consultarRaiz());



        /* Questão 2
        String[] vetorArvore = {"5", "8", "3", "6", "9", "1", "4", "7", "2", "0"};
        for (String elementos : vetorArvore){
            arvore.inserir(elementos);
        }
        System.out.println(arvore.caminhar(arvore.PREORDER));
        System.out.println(arvore.caminhar(arvore.INORDER));
        System.out.println(arvore.caminhar(arvore.POSTORDER)); */
    }
}
