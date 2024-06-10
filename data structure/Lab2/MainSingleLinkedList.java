package Lab2;

import java.util.Scanner;

public class MainSingleLinkedList {
    public static void main(String[] args) {

        //creating single linked list
        singleLinkedList SLL = new singleLinkedList();
        Scanner key = new Scanner(System.in);
        int number;
        do {
            System.out.println("pleas choose the process that you want to do by entring: \n \" 1 \" for add new number \n \" 2 \" for delete from the end \n \" 3 \" for print all the numbers ");
            System.out.println("Note: \" number 4 is NEVER including \" ");
            number = key.nextByte();

            switch (number) {
                case 1:
                    int answer;
                    System.out.println("pleas enter your number that you want to add in your list");
                    int h = key.nextInt();
                    do {
                        SLL.addFirst(h);

                        System.out.println("Do you want to add another number? \nenter \" 1 \" for yes and \" 2 \" for no");
                        answer = key.nextInt();
                        if (answer == 1) {
                            System.out.println("Now, pleas enter another number");
                            int newNumber = key.nextInt();
                            h = newNumber;
                        }
                    } while (answer != 2);
                    
                    System.out.println("Now do you want to delete from the end? \nenter \" 1 \" for yes and \" 2 \" for no");
                    int deleteAnswer = key.nextInt();
                    if( deleteAnswer == 2){
                        break;
                   
                    }
                    

                case 2:
                    SLL.removeLast();
                    System.out.println("okay do you want to print your data? \nenter \" 1 \" for yes and \" 2 \" for no");
                        int printAnswer = key.nextInt();
                        if( printAnswer == 2){
                            break;
                        }

                case 3:

                    System.out.println("this is your head, tail, and the size: ");
                    System.out.println("Head = " + SLL.getHead());
                    System.out.println("Tail = " + SLL.getTail());
                    System.out.println("Size = " + SLL.getSize());

                    System.out.println("and this is your data: ");
                    SLL.print();
                    System.out.println("***");
                    SLL.fun11();

            }
        } while (number != 4);

        System.out.println("Exit");

    }
}
