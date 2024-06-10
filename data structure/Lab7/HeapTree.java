package Lab7;
import java.util.Scanner;
//import Tree.HeapTree;

public class HeapTree {
    public static void main(String[] arg) { 
        // declare variable   
        int heapSize; 
boolean min=false; 
        // create scanner class object   
        Scanner sc = new Scanner(System.in); 
        int ch = 0; 
        Heap heapObj = null; 
        while (ch != 5) { 
            System.out.println("1. Add element to heap\n" 
                    + "2. Remove element from heap\n" 
                    + "3. Create Max  heap\n" 
                    + "4. Create min heap\n" 
                    + "5. Exit"); 
            ch=sc.nextInt(); 
            switch (ch) { 
                case 1: 
                    System.out.println("Enter the size of Min Heap"); 
                    heapSize = sc.nextInt(); 
 
                    heapObj = new Heap(heapSize); 
 
                    for (int i = 1; i <= heapSize; i++) { 
                        System.out.print("Enter " + i + " element: "); 
                        int data = sc.nextInt(); 
                        heapObj.insertNode(data); 
                    } 
                    heapObj.designMinHeap(true); 
                    min=true; 
                    break; 
                case 2: 
                    System.out.println("After removing the minimum element(Root Node) " + heapObj.removeRoot(min) + ", Min heap is:"); 
                    heapObj.displayHeap(); 
                    break; 
                 
                case 3: 
                    heapObj.designMinHeap(false); 
                    min=false; 
 
                    //display the min heap data   
                    System.out.println("The Max Heap is "); 
                    heapObj.displayHeap(); 
                    break; 
                    case 4: 
                    heapObj.designMinHeap(true); 
                    min=true; 
 
                    //display the min heap data   
                    System.out.println("The Min Heap is "); 
                    heapObj.displayHeap(); 
                    break; 
                case 5: 
                    break; 
 
            }  
           
        } 
        sc.close(); 
        } 
}
