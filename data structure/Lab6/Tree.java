package Lab6;
public class Tree {
  private Node root;
  private Node E; //going to use it in "delete method"
  
/*
    constrocture
    */
    public Tree ( ) {
      this.root = null;
      this.E = null;
    }


    public boolean isEmpty ( ) {
      if (root == null)
        return true;
      else
        return false;
    }

    
    public void add (int e) {
      Node newest = new Node (e);
      Node c = new Node();
      Node j = new Node();

      if (isEmpty()) {
        root = newest;
      } else {
        c = root;
        j = c;
        while ( c != null ){
          j = c;
            if ( newest.getData() < c.getData())
              c = c.getLeft();
            else 
              c = c.getRight();
        }
      }

       if ( newest.getData() < j.getData())
         j.setLeft(newest);
       else 
         j.setRight(newest);

    }


public Node delete (Node current, int e) {
      //Node deleteNode = new Node (e);
      //Node c = new Node();
      //Node j = new Node();

      if (isEmpty()) {
        root = null;
      } if (e < current.getData()){
        current.setLeft(delete(current.getLeft(), e));
      } else if ( e > current.getData()){
        current.setRight(delete(current.getRight(), e));
      } else {
        if (current.getLeft() == null && current.getRight() == null){
          return null;
        } else if (current.getLeft() == null) {
          return current.getRight();
        } else if ( current.getRight() == null) {
          return current.getLeft(); 
        } else {
          int minData = findMinData (current.getRight());
          current.setData(minData);
          current.setRight(delete(current.getRight(), minData));
        }
      }
      return current;
    }
      
    private int findMinData ( Node node){
      int minData = node.getData();
      while (node.getLeft() != null){
        minData = node.getLeft().getData();
        node = node.getLeft();
      }
      return minData;
    }
    public void deleteNode (int data){
      delete(this.root, data);
    }
    
    

private int maximum ( Node c) {
  
  int counter = 1;
  
if ( c.getLeft() != null ) {
  counter+= maximum(c.getLeft());
  //maximum( c.getLeft());
}

if ( c.getRight() != null ) {
  counter += maximum(c.getRight());
  //maximum ( c.getRight());
}

  //System.out.println("This is the number of the data you have in your tree: " +counter);
  return counter;
}

public void publicMaximum (){
    int max = maximum( this.root) ;
    System.out.println("This is the number of the data you have in your tree: " +max);
}

public boolean findNode (int e) {
    Node searchNode = new Node (e);
      Node c = root;
      Node j = null;

      if (isEmpty()) {
        System.out.println("This tree is empty");
      } else  {
      while ( c != null) {
        if (searchNode.getData() == c.getData()){
          return true;
        } else {
          j = c;
          if (searchNode.getData() < c.getData()){
            c =c.getLeft();
          }else{
            c = c.getRight();
          }
        }
        }
        
      }
        return false;
      }

private void print ( Node c) {
  //printpost();
//postorder


if ( c.getLeft() != null ) {
  print( c.getLeft());
}

  System.out.println(c.getData() + " ");

if ( c.getRight() != null ) {
  print ( c.getRight());
  }

  //System.out.println(c.getData() + " ");
}

public void printpost (){
 print( this.root) ;
}

private void printHTL ( Node c) {

if ( c.getRight() != null ) {
  printHTL( c.getRight());
}

  System.out.println(c.getData() + " ");

if ( c.getLeft() != null ) {
  printHTL ( c.getLeft());
  }

  //System.out.println(c.getData() + " ");
}

public void printHTL2 (){
 printHTL( this.root) ;
}


  private void printUpTpDown(Node c){

    if (c.getRight() != null) {
      printUpTpDown(c.getRight());
    }
    
    System.out.print(c.getData() + " ");
    
    if (c.getLeft() != null) {
      printUpTpDown(c.getLeft());
    }
  }
  

public void printUpTpDown2() {
  printUpTpDown(this.root);
  System.out.println();
}

  // From up the root to down the root
  private void printPreorder(Node root){ 

           if (root!=null){
            System.out.print(root.getData() +" "); 

            printPreorder(root.getLeft());
            printPreorder(root.getRight()); 
             }
    }

    public void printPreorder2() {
      printPreorder(this.root);
      System.out.println();
}



// From down the tree to up the tree
//dose NOT working
  private void printPostorder(Node root){ 

           if (root!=null){

            printPreorder(root.getLeft());
            printPreorder(root.getRight());
            
            System.out.print(root.getData() +" "); 
             }
    }

    public void printPostorder2() {
      printPostorder(this.root);
      System.out.println();
}
  }
    