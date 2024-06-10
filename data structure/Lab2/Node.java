package Lab2;

public class Node {
    private int data;
    private Node next;
    
    /*
    construture
    */
    public Node(){
        this.data = 0;
        this.next = null;
    }
    
    public Node( int data){
        this.data = data;
        this.next = null;
    }
    
    public Node ( int data, Node next ){
        this.data = data;
        this.next = next;
    }
    
    /*
    sters
    */

    public void setData ( int data){
        this.data = data;
    }
    
    public void setNext ( Node next){
        this.next = next;
    }
    
    /*
    getters
    */
    
    public int getData (){
        return data;
    }
    
    public Node getNext (){
        return next;
    }
}
