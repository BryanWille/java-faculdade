public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }

    public void printPreorder(Node node){
        if (node != null){
            System.out.println(node.data + "");
            printPreorder(node.left);
            printPreorder(node.right);
        }

    }

    public void printPostorder(Node node){
        if (node != null){
            printPreorder(node.left);
            printPreorder(node.right);
            System.out.println(node.data + "");
        }

    }

    public void printInorder(Node node){
        if (node != null){
            printPreorder(node.left);
            System.out.println(node.data + "");
            printPreorder(node.right);
        }

    }


    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }
    public void setLeft(Node node) {
        if(left == null) {
            this.left = node;
        }
    }

    public Node getRight() {
        return right;
    }
    public void setRight(Node node) {
        if(right == null) {
            this.right = node;
        }
    }
}
