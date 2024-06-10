package Lab4;
public class stack {
    private node top;
    private node bottom;
    private int stackSize;

    singleLinkedList stackLinkedList = new singleLinkedList();
public void addStack ( int u) {
stackLinkedList.addFirst (u);
}

public void returnTop ( ) {
  System.out.println("This is your Top: " + stackLinkedList.getHead());
}

public void printStack ( ) {
stackLinkedList.print();
}

public void pop(){
  stackLinkedList.removeLast();
  //print it
}

public int getTop() {
  return stackLinkedList.getHead();
}

public int getBottom() {
  return stackLinkedList.getTail();
}

public int getStackSize() {
  return stackLinkedList.getHead();
}

}
