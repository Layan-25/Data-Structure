package Lab3;

public class DoubleLinkedList {
    private Node header;
    private Node trailer;
    private int size;

    public DoubleLinkedList() {
        this.header = new Node();
        this.trailer = new Node();
        this.header.setNext(trailer);
        this.trailer.setPrev(header);
        this.size = 0;
    }

    public Node getHeader() {
        return header;
    }

    public void addFirst(int e) {
        addBetween(this.header, this.header.getNext(), e);
    }

    public void addBetween(Node predecessor, Node successor, int e) {
        Node newest = new Node(e);
        newest.setPrev(predecessor.getNext());
        newest.setNext(successor);
        successor.setPrev(newest);
        predecessor.setNext(newest);
        size++;
    }

    public void addLast(int e) {
        addBetween(this.trailer, this.trailer.getNext(), e);
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("this list is empty");
            return;
        } else if (size == 1) {
            header = trailer = null;
            size--;
        } else {
            header = header.getNext();
            size--;
        }
    }

    public void removeMiddle(Node node) {
        if (size == 0) {
            System.out.println("this list is empty");
            return;
        } else {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            node.setNext(null);
            node.setPrev(null);
            size--;
        }
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("this list is empty");
            return;
        } else if (size == 1) {
            header = trailer = null;
            size--;
        } else {
            Node temp = trailer;
            trailer.getPrev().setNext(null);
            trailer = trailer.getPrev();
            temp.setPrev(null);
            size--;
        }
    }

    public void print() {
        Node c = header.getNext();
        while (c != this.trailer) {
            System.out.println(c.getData());
            c = c.getNext();
        }
    }

    public int getFirstNode() {
        if (size == 0) {
            System.out.println("this list is empty");
        }
        return this.header.getNext().getData();
    }

    public int getLastNode() {
        if (size == 0) {
            System.out.println("this list is empty");
        }
        return this.trailer.getPrev().getData();
    }

    public int getSize() {
        return size;
    }
}
