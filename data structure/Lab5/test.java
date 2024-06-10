package Lab5;

public class test {
     public static void main(String[] args) throws Exception {
        SinglyLinkedLists<Integer> list = new SinglyLinkedLists<>();
        list.addFirst(10);
        list.insert(20);
        list.insert(30);
        list.addLast(40);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next().getData();
            System.out.print(element*2 + " ");
        } // end of while loop
        System.out.println();
    } // end of main method
} // end of class


