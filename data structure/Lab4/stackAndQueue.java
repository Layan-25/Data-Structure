package Lab4;
import java.util.Scanner;

/**
 *
 * @author layan
 */
public class stackAndQueue {
public static void main (String[] args){
 
  stack SLLS = new stack();
  queue SLLQ = new queue();
        Scanner key = new Scanner(System.in);
        int number;
        do {
            System.out.println("pleas choose the which one that you want to work on by entering: \n \" 1 \" Stack \n \" 2 \" Queue" );
            System.out.println(" And if you want to Exit from the program pleas enter \" 3 \" ");
              number = key.nextInt();


          switch (number) {

            //Stack
                case 1:
                    // Working on the Stack menu

                    System.out.println("pleas choose the process that you want to do by entering: \n \" 1 \" for add new number \n \" 2 \" ot show you your Top \n \" 3 \" to print all the numbers ");
            System.out.println("Note:  And if you want to Exit from the Stack menu pleas enter \" 4 \"  ");
            int stackNumber = key.nextInt();

                    switch ( stackNumber ){

                      case 1:

                        int answer;
                    System.out.println("pleas enter your number that you want to add in your list");
                    int addNumber = key.nextInt();
                    do {
                        SLLS.addStack(addNumber);

                        System.out.println("Do you want to add another number? \n enter \" 1 \" for yes and \" 2 \" for no");
                        answer = key.nextInt();
                        if (answer == 1) {
                            System.out.println("Now, pleas enter another number");
                            int newNumber = key.nextInt();
                            addNumber = newNumber;
                        }
                    } while (answer != 2);
                    
                    System.out.println("Now do you want to show you the data at your Top? \n enter \" 1 \" for yes and \" 2 \" for no");
                    int topAnswer = key.nextInt();
                    if( topAnswer == 2){
                        break;
                    }


                      case 2:

                      SLLS.returnTop();
                    System.out.println("okay do you want to print your data? \n enter \" 1 \" for yes and \" 2 \" for no");
                        int printAnswer = key.nextInt();
                        if( printAnswer == 2){
                            break;
                        }


                      case 3:
                      
                      System.out.println("this is your Top, Bottom, and the Size: ");
                    System.out.println("Top = " + SLLS.getTop());
                    System.out.println("Bottom = " + SLLS.getBottom());
                    System.out.println("Size = " + SLLS.getStackSize());

                    System.out.println("and this is your data: ");
                    SLLS.printStack();

                    }
                    


            //Queue
                case 2:

                // Working on the Queue menu

                    System.out.println("pleas choose the process that you want to do by entering: \n \" 1 \" for add new number \n \" 2 \" ot show you your Front \n \" 3 \" to print all the numbers ");
            System.out.println("Note: \" And if you want to Exit from the Queue menu pleas enter \" 4 \" \" ");
            int queueNumber = key.nextInt();

                    switch ( queueNumber ){

                      case 1:

                        int answer;
                    System.out.println("pleas enter your number that you want to add in your list");
                    int addNumber = key.nextInt();
                    do {
                        SLLQ.addQueue(addNumber);

                        System.out.println("Do you want to add another number? \n enter \" 1 \" for yes and \" 2 \" for no");
                        answer = key.nextInt();
                        if (answer == 1) {
                            System.out.println("Now, pleas enter another number");
                            int newNumber = key.nextInt();
                            addNumber = newNumber;
                        }
                    } while (answer != 2);
                    
                    System.out.println("Now do you want to show you the data at your Front? \n enter \" 1 \" for yes and \" 2 \" for no");
                    int frontAnswer = key.nextInt();
                    if( frontAnswer == 2){
                        break;
                    }


                      case 2:

                      SLLQ.returnQueue();
                    System.out.println("okay do you want to print your data? \n enter \" 1 \" for yes and \" 2 \" for no");
                        int printAnswer = key.nextInt();
                        if( printAnswer == 2){
                            break;
                        }


                      case 3:
                      
                      System.out.println("this is your Front, Back, and the size: ");
                    System.out.println("Top = " + SLLQ.getFront());
                    System.out.println("Bottom = " + SLLQ.getBack());
                    System.out.println("Size = " + SLLQ.getQueueSize());

                    System.out.println("and this is your data: ");
                    SLLQ.printQueue();

                    }



                  }      
  }while (number != 3);

        System.out.println("Exit");



  }
}