package Lab1;
import java.util.Scanner; // Scanner so we can use the input process
import java.util.Stack;
public class array {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
    /*
            Do loop stand for if the useer want to exit from the program or not
            the "userInput" is the answer that the user will inter it if he wants to replay the program or not
            */
            String userInput;
        do{
        // making a new array.
            int [] array = new int [5];
           
            
        //insert an element at specific position.
            array [0] = 1;
            array [1] = 2;
            array [2] = 3;
            array [3] = 4;
    
    
        //savimg the element that I want to find in a variable 
            int searchElement = 2;
    
    
        //searching for the element by using for loop. print it and prrint its index
            for ( int i = 0 ; i < array.length ; i++ ){
                if ( array[i] == searchElement){
                  System.out.println("the element is " + searchElement);
                  System.out.println("the index is " + i );
                  break;
                }
            }
    
    
        //delete an element from the array
            int theDeletedElement = 3;
            int deletedIndex = -1;
            for ( int i = 0 ; i < array.length ; i++){
              if ( theDeletedElement == array[i]){
                deletedIndex = i;
                break;
              }
            }
    
    
        // shifting an element in the array
            if ( deletedIndex != -1 ){
              for ( int i = deletedIndex ; i < array.length-1 ; i++){
                array[i] = array[i+1];
                  }
        // the last index = 0.
                array[array.length-1] = 0;
            }
    
            System.out.println(" the elements are: ");
              for ( int i = 0 ; i < array.length ; i++){
                System.out.println( array[i]);
              }
    
        // copying the array in another array
        int[] copyArray = array;
            
        //Asking the user if he want to do the program againg or not
          System.out.println("Do you want to repeat the code? (yes/no): " );
          userInput = input.nextLine();
        }
    
          while ( userInput.equalsIgnoreCase("yes") );
    
    
      }

      public void func2 (boolean max){
        if (max){
          int x = array.get(0);
          for (int i = array.size()/ 2; i < array.size(); i++){
            if (array.get(i) < x){
              x = array.get(i);
            }
          }
          System.out.println(x);
        }
      }


      1- public void func1(){
      2- Stack<E> s1 = new ArrayList();
      3- int i = 0;
      4- for ( i = getSize() - 1; i >= 0; i--){
      5- int x = this.add();
      6-  if ( x% 2 == 0)
      7- s1.insert(x);
      8- else
      9- this.dequeue(x);
      10- }
      11- while ( !s1.isEmpty()){
        12- this.enqueue(s1.pop());
        13- }
        14- for( i = getSize() - 1; i>=0 ; i--){
          15- int x = this.dequeue();
          16- if(x/2!=0)
          17- s1.push(x);
          18- else
          19- this.push(x);
          20- }
          21- while (!s1.isEmpty())
          22- this.enqueue(s1.pop());
          23- }

          input
          empty stack s1:
          queue: 1 2 3 4 5 6 

          output
          empty stacl s1:
          queue: 1 3 5 2 4 6 

          Error in line 2 and the correct is:
          A- LinkedList
          B- Queue
          C- Stack
          D- Tree
      }
      
    }

