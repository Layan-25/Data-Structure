package Lab4;

public class node {
    private int data;
    private node next;
    
    /*
    construer
    */
    public node(){
        this.data = 0;
        this.next = null;
    }
    
    public node( int data){
        this.data = data;
        this.next = null;
    }
    
    public node ( int data, node next ){
        this.data = data;
        this.next = next;
    }
    
    /*
    setters
    */
    public void setData ( int data){
        this.data = data;
    }
    
    public void setNext ( node next){
        this.next = next;
    }
    
    /*
    getters
    */
    public int getData (){
        return data;
    }
    
    public node getNext (){
        return next;
    }

}
