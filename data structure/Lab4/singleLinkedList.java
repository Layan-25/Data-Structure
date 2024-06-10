package Lab4;
public class singleLinkedList {
  
    private node head;
    private node tail;
    private int size;
    
    /*
    contracture
    */
    public singleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    

    public int getHead(){
           return head.getData();
       }
    
       //public int getTail(){
          // return tail.getData();
       //}

       public int getTail (){
        if (this.head == null ) {
            this.tail = null;
            System.out.println(" This list is empty");
        } else {
    node c = this.head;
        while ( c.getNext() != null ){
            c = c.getNext();
        }
        this.tail = c;
        }
        
        if ( this.tail != null ){
            return tail.getData();
        } else {
            return -1;
        }
        }

    
    
       public int getSize(){
           return size;
       }
/* 
       public void setHead ( node head){
        this.head = head;
    }

    public void setTail ( node tail){
        this.tail = tail;
    }

    public void setSize ( int size){
      this.size = size;
  }
  */

    /*
    addFirst method: used when the user want to add a new node at the beginning
    */
    public void addFirst (int e){
        
        //1- Create the new node
        node newest = new node (e);
        
        //letting the newest refers to head
        newest.setNext(head);
        
        //letting newest the new head
        this.head = newest;
        
        //increase size
        this.size ++;
    }
     



    /*
    addLast method: used when the user want to add a new node at the end
    */
    public void addLast (int e){
      node newest = new node (e);
      if ( this.head == null ){
        this.head = newest;
        this.tail = newest;
      }else {
        this.tail.setNext(newest);
        this.tail = newest;
      }
      
      this.size ++;
    }
    

    /*
    print method: used when the user want to print all the nodes
    */
    public void print(){
        // checking if the list is Empty
        if( head == null)
        System.out.println("Your list is Empty");
        else{
       //initialize a traversing pointer to the head
       node c = this.head;
      
       //while loop: so if we reach the end it will stop
       while(c != null){
           System.out.println( c.getData());
        
       //update the traversing pointer to the next node
       c = c.getNext();
       }
       }
    }

    public void removeLast(){
        
        if( head == null){
            System.out.println("This list is empty");
        }
        else if(head.getNext() == null){
            System.out.println("your list has only one data");
        } else {
            //initialize a traversing pointer to the head
            node c = head;
            node previous = null;
            
            //Traversing
            while( c.getNext() != null){
                previous = c;
                c = c.getNext();
            }
            previous.setNext(null);
            size --;
            
        }
    }

    public void removieFirst (){
        if ( head == null ){
            System.out.println("this list is empty");
        }else {
            head = head.getNext();
            size--;
        }
        }
    
    
      }