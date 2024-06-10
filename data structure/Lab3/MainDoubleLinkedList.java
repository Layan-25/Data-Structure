package Lab3;

import java.util.Scanner;

public class MainDoubleLinkedList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        DoubleLinkedList DLL = new DoubleLinkedList();

        int number;
        do {
            System.out.println(
                    "pleas choose the process that you want to do by entring: \n \" 1 \" for add new number in your list \n \" 2 \" to delete from your list \n \" 3 \" for print all the numbers \n \" 4 \" to show how many numbers you have in your list");
            System.out.println("Note: \" number 5 is NEVER including \" ");
            number = key.nextByte();

            switch (number) {
                case 1:
                    int answer;
                    System.out.println("pleas enter your number that you want to add in your list");
                    int data = key.nextInt();
                    do {
                        DLL.addFirst(data);

                        System.out.println(
                                "Do you want to add another number? \n enter \" 1 \" for yes and \" 2 \" for no");
                        answer = key.nextInt();
                        if (answer == 1) {
                            System.out.println("Now, pleas enter another number");
                            int newNumber = key.nextInt();
                            data = newNumber;
                        }
                    } while (answer != 2);

                    System.out
                            .println("Now do you want to delete a number? \nenter \" 1 \" for yes and \" 2 \" for no");
                    int deleteAnswer = key.nextInt();
                    if (deleteAnswer == 2) {
                        break;
                    }

                case 2:
                    System.out.println(
                            "where would you delete from? \n enter \" 1 \" for from the fisr \" 2 \" for from the middle \" 3 \" for from the last");
                    int answer2;
                    answer2 = key.nextInt();
                    if (answer2 == 1) {
                        DLL.removeFirst();

                    } else if (answer2 == 2) {
                        System.out.println("enter the number that you want to delete in your list");
                        int inputMiddle = key.nextInt();

                        Node c = DLL.getHeader();

                        while (c.getNext() != null) {
                            if (inputMiddle == c.getData())
                                break;
                            c = c.getNext();
                        }
                        DLL.removeMiddle(c);

                    } else if (answer2 == 3) {
                        DLL.removeLast();
                    }
                    System.out
                            .println("okay do you want to print your data? \nenter \" 1 \" for yes and \" 2 \" for no");
                    int printAnswer = key.nextInt();
                    if (printAnswer == 2) {
                        break;
                    }

                case 3:
                    System.out.println("this is your head, tail, and the size: ");
                    System.out.println("Head = " + DLL.getFirstNode());
                    System.out.println("Tail = " + DLL.getLastNode());
                    System.out.println("Size = " + DLL.getSize());

                    System.out.println("and this is your data: ");
                    DLL.print();

                    System.out.println(
                            "okay do you want to show you how many nodes you have? \nenter \" 1 \" for yes and \" 2 \" for no");
                    int printAnswer1 = key.nextInt();
                    if (printAnswer1 == 2) {
                        break;
                    }

                case 4:
                    System.out.println("Here is how many nodes you have now");
                    System.out.println(DLL.getSize());
            }
        } while (number != 5);

        System.out.println("Exit");
    }
}
