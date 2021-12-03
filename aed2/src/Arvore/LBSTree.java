package Arvore;

class LBSTreeNode {
    Object item;
    LBSTreeNode linkEsquerdo;
    LBSTreeNode linkDireito;

    public LBSTreeNode() {
        this(null);
    }

    public LBSTreeNode(Object valorItem) {
        item = valorItem;
        linkEsquerdo = null;
        linkDireito = null;
    }

    public int compararCom(Object valorItem) {
        String chaveAtual = (String) this.item;
        String chaveValor = (String) valorItem;
        return (chaveAtual.compareTo(chaveValor));
    }

    public String toString() {
        return (item.toString());
    }

}

public class LBSTree {

    protected LBSTreeNode raiz;
    protected int contador;
    protected String treeString;

    public final int PREORDER = 1;
    public final int INORDER = 2;
    public final int POSTORDER = 3;

    public LBSTree() {
        raiz = null;
        contador = 0;
    }

    public boolean vazia() {
        return (raiz == null);
    }

    public Object consultarRaiz(){
        Object x = null;
        if(!vazia()) {
            x = String.valueOf(this.raiz);
        }
        return x;
    }

    public void inserir(Object novoItem) {
        raiz = inserir(novoItem, raiz);
    }

    public LBSTreeNode inserir(Object novoItem, LBSTreeNode treeRef) {
        int resultado;
        if (treeRef == null) {
            LBSTreeNode newNode = new LBSTreeNode(novoItem);
            treeRef = newNode;
            contador++;
        } else {
            resultado = treeRef.compararCom(novoItem);
            if (resultado > 0)
                treeRef.linkEsquerdo = inserir(novoItem, treeRef.linkEsquerdo);
            else
                treeRef.linkDireito = inserir(novoItem, treeRef.linkDireito);
        }
        return (treeRef);
    }

    public void retirar(Object item) {
        retirar(item, raiz);
    }

    public void retirar(Object item, LBSTreeNode treeRef) {
        LBSTreeNode antecessor = null;
        if (vazia()) {
            System.out.println("Erro: Árvore vazia!");
        } else {
            if (buscar(item) == null) {
                System.out.println("Erro: Item Inexistente!");
            } else {
                while (treeRef != null && treeRef.item != item) {
                    antecessor = treeRef;
                    if (treeRef.compararCom(item) > 0)
                        treeRef = treeRef.linkEsquerdo;
                    else
                        treeRef = treeRef.linkDireito;
                }
                if (treeRef.linkEsquerdo == null && treeRef.linkDireito == null) {
                    if (treeRef != raiz) {
                        if (treeRef == antecessor.linkEsquerdo)
                            antecessor.linkEsquerdo = null;
                        else
                            antecessor.linkDireito = null;
                    } else {
                        raiz = null;
                    }
                    contador--;
                } else if (treeRef.linkEsquerdo != null && treeRef.linkDireito != null) {
                    LBSTreeNode sucessor;
                    sucessor = valorMaximo(treeRef.linkEsquerdo);
                    Object valorItem = sucessor.item;
                    retirar(sucessor.item);
                    treeRef.item = valorItem;
                    contador--;
                } else {
                    LBSTreeNode folha = (treeRef.linkEsquerdo != null) ? treeRef.linkEsquerdo : treeRef.linkDireito;
                    if (treeRef != raiz) {
                        if (treeRef == antecessor.linkEsquerdo)
                            antecessor.linkEsquerdo = folha;
                        else
                            antecessor.linkDireito = folha;
                    } else {
                        raiz = folha;
                    }
                    contador--;
                }
            }
        }
    }

    protected  LBSTreeNode valorMaximo(LBSTreeNode treeNode){
        while(treeNode.linkDireito != null){
            treeNode = treeNode.linkDireito;
        }
        return(treeNode);
    }

    public Object valorMinimo(){
        if(vazia()){
            System.out.println("Erro: Arvore Vazia");
            return null;
        } else if(raiz.linkEsquerdo == null){
            return raiz;
        } else {
            LBSTreeNode treeRef = raiz;
            do{
                treeRef = treeRef.linkEsquerdo;
            } while (treeRef.linkEsquerdo != null);
            return treeRef;
        }
    }

    LBSTreeNode buscar(Object valorItem){
        LBSTreeNode treeRef = raiz;
        int resultado = 1;
        while (treeRef != null && resultado != 0){
            resultado = treeRef.compararCom((String) valorItem);
            if(resultado > 0){
                treeRef = treeRef.linkEsquerdo;
            } else {
                if(resultado < 0){
                    treeRef = treeRef.linkDireito;
                }
            }
        }
        return (treeRef);
    }

    protected void inOrder(LBSTreeNode treeRef){
        if(treeRef != null){
            treeString = treeString + "(";
            inOrder(treeRef.linkEsquerdo);
            treeString = treeString + " " + treeRef.item+ " ";
            inOrder(treeRef.linkDireito);
            treeString = treeString + ")";
        }
    }

    protected void preOrder(LBSTreeNode treeRef){
        if(treeRef != null){
            treeString = treeString + "(";
            treeString = treeString + " " + treeRef.item+ " ";
            preOrder(treeRef.linkEsquerdo);
            preOrder(treeRef.linkDireito);
            treeString = treeString + ")";
        }
    }

    protected void postOrder(LBSTreeNode treeRef){
        if(treeRef != null){
            treeString = treeString + "(";
            postOrder(treeRef.linkEsquerdo);
            postOrder(treeRef.linkDireito);
            treeString = treeString + " " + treeRef.item+ " ";
            treeString = treeString + ")";
        }
    }

    public String caminhar(){
        return(caminhar(INORDER));
    }

    public String caminhar(int modo){
        treeString = "\n";
        switch(modo){
            case PREORDER:
                 preOrder(raiz);
                 break;
            case INORDER:
                inOrder(raiz);
                break;
            case POSTORDER:
                postOrder(raiz);
                break;
            default:
                System.out.println("Erro: Modo de caminhamento desconhecido!");
                break;
        }
        return(treeString);
    }

    public String toString(){
        treeString = "";
        inOrder(raiz);
        return(treeString);
    }
}
