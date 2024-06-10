package Lab6;
import java.util.List;
import java.util.Scanner;




/**
 *
 * @author layan
 */

public class TreeMain {

    public static void main(String[] args) {
        Tree tree = new Tree();
      Scanner key = new Scanner(System.in);

      int number;
        do {
            System.out.println( "pleas choose the process that you want to do by entring: \n \" 1 \" for add new number in your tree \n \" 2 \" to delete from your tree \n \" 3 \" to search for a soecific number in your tree \n \" 4 \" for showing you the maximum number of your data \n \" 5 \" to print all the data you have in your list");
            System.out.println("Note: \" if you want to exit pleas enter 6 \" ");
            number = key.nextByte();


            switch (number) {
              case 1:
                int answer;
                System.out.println("pleas enter your number that you want to add in your Tree");
                int data = key.nextInt();
                do{
                    tree.add(data);

                    System.out.println("Do you want to add another number? \n enter \" 1 \" for yes and \" 2 \" for no");
                    answer = key.nextInt();
                      if (answer == 1) {
                        System.out.println("Now, pleas enter another number");
                        int newNumber = key.nextInt();
                        data = newNumber;
                      }
                } while (answer != 2);

                    System.out.println("Now do you want to delete a number? \n enter \" 1 \" for yes and \" 2 \" for no");
                    int deleteAnswer = key.nextInt();
                    if (deleteAnswer == 2) {
                        break;
                    }


              case 2:
                System.out.println("Pleas enter the number that you want to delete");
                int answer2;
                answer2 = key.nextInt();
                  tree.deleteNode(answer2);

              System.out.println("okay do you want to search for a soecific number in your tree? \n enter \" 1 \" for yes and \" 2 \" for no");
              int searchAnswer = key.nextInt();
                if (searchAnswer == 2) {
                  break;
                }


              case 3:
                System.out.println("Pleas enter the number that you want to search for");
                int answer3;
                answer3 = key.nextInt();
                  if(tree.findNode(answer3) == true){
                    System.out.println("The number: " + answer3 + " are exit in the Tree");
                  } else {
                    System.out.println("The number: " + answer3 + " are Not exit in the Tree");
                  }
                  

                System.out.println("If you want to know how many numbers you have in your tree \n enter \" 1 \" for yes and \" 2 \" for no ");
                int maximumAnswer = key.nextInt();
                  if (maximumAnswer == 2) {
                    break;
                  }
              case 4:
                tree.publicMaximum();

                System.out.println("If you want to print all the numbers you have in your tree pleas enter \n \" 1 \" for yes and \" 2 \" for no");
                int printAnswer = key.nextInt();
                  if (printAnswer == 2) {
                    break;
                  }

              
              case 5:
                System.out.println("Here is your numbers: ");
                tree.printpost();

                tree.printHTL2();

                tree.printUpTpDown2();

                tree.printPreorder2();

                tree.printPostorder2();
            }
        } while (number != 6);

        System.out.println("Exit");
    }
  }