package Lab2;

public class singleLinkedList {
    private Node head;
    private Node tail;
    private int size;
    
    /*
    constrocture
    */
    public singleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    /*
    addFirst method: used when the user want to add a new node at the beginning
    */
    public void addFirst (int e){
        //doing the same in circlar but instaid of using HEAD gonna use TAIL.NEXT
        //1- creat the new node
        Node newest = new Node (e);
        
        //leting the newest refers to head
        newest.setNext(head);
        
        //leting neweest the new head
        this.head = newest;
        
        //increase size
        this.size ++;
    }
    
    /*
    removeLast method: used when the user want to delete a node from the end
    */
    public void removeLast(){
        
        if( head == null){
            System.out.println("This list is empty");
        }
        else if(head.getNext() == null){
            System.out.println("your list has only one data");
        } else {
            //initialize a traversing pointer to the head
            Node c = head;
            Node previous = null;
            
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
    
    
    /*
    print method: used when the user want to print all the nodes
    */
    public void print(){
        
       //initialize a traversing pointer to the head
       Node c = this.head;
      
       //while loop: so if we reach the end it will stop
       while(c != null){
           System.out.println( c.getData());
        
       //update the traversing pointer to the next node
       c = c.getNext();
       }
    }
    
    public int getHead(){
           return head.getData();
       }
    
       public Node getTail(){
           return tail;
       }
     
       public int getSize(){
           return size;
       }


       //Add in the end

       public void AddLadt (){
         //1- creat the new node
        Node newest = new Node ();

        newest.setNext(null);

        tail.setNext(newest);

        tail = newest;

        size = size+1;

       }

       //Add in the Middle
       public void AddInMiddle ( ){
        Node newest = new Node ();

        if( head == null){
            head = newest;
        } else if( newest.getData() < head.getData()){
            addFirst(5); // عشان ما يطلع لي ايرور بس
        } else {
            Node c = head;

            while( c.getNext() != null){
                if ( newest.getData() > c.getNext().getData())
                c = c.getNext();
            }
            newest.setNext(c.getNext());
            c.setNext(newest);
        }
         
       }


        /*
         * Circular Linked List
         */

         //Traversal
         public void Traversal (){
            Node c = tail.getNext();

                if(tail != null) {
                    do{
                        //print c.getData();
                        c = c.getNext();
                    } while ( c != tail.getNext());
                }
                
         }

        //deleted circular 
        public void removeCLL (){
            head = tail.getNext();
            if(head == tail){
                tail = null;
            }else {
                tail.setNext(head.getNext());
            }
        }

        public int fun1 (Node c){
            if (c == null)
            return 0;
            int x = fun1(c.getNext());
            x += c.getData();
            x += fun1(c.getNext());
            System.out.println(x);
            return x; 
        }

        public void fun11() {
            fun1(this.head);
            System.out.println();
        }
        //rotate
        /*
         * if ( tail != null)
         *  tail = tail.next
         */
        
}
