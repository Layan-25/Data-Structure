package Lab6;
public class Node {
    private int data;
    private Node right;
    private Node left;

    /*
     * construer
     */
    public Node() {
        this.data = 0;
        this.right = null;
        this.left = null;
    }

    public Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public Node(int data, Node right, Node left) {
        this.data = data;
        this.right = right;
        this.left = left;
    }

    /*
     * ster
     */
    public void setData(int data) {
        this.data = data;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    /*
     * getters
     */
    public int getData() {
        return data;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }
}