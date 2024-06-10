package Lab4;

public class queue {
    private node front;
    private node back;
    private int queueSize;
    

    singleLinkedList queueLinkedList = new singleLinkedList();
/* 
    public queue(singleLinkedList x){
      this.front = x.getHead();
      this.back = x.getTail();
      this.queueSize = x.getSize();
    }
*/
public void addQueue (int u) {
  queueLinkedList.addLast (u);
}
  
 public void returnQueue () {
  System.out.println(" This is your Front: " + queueLinkedList.getHead());
 } 

 public void removeQueue(){
  queueLinkedList.removeLast();
  //print it
 }

 public void printQueue ( ) {
queueLinkedList.print();
}

public int getFront() {
  return queueLinkedList.getHead();
}

public int getBack() {
 return queueLinkedList.getTail();
}

public int getQueueSize() {
  return queueLinkedList.getHead();
}
}
