package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);

        // 2) prompt user
        System.out.print("Enter a number corresponding to the week day:");

        // 3) assign input to variable as int
        int number = scanner.nextInt();

        // 4) write completed code here

        //using if-else

        if (number == 1)

            System.out.println("Monday");

        else if (number == 2)

            System.out.println("Tuesday");

        else if (number == 3)

            System.out.println("Wednesday");

        else if (number == 4)

            System.out.println("Thursday");

        else if (number == 5)

            System.out.println("Friday");

        else if (number == 6)

            System.out.println("Saturday");

        else if (number == 7)

            System.out.println("Sunday");

        else
            System.out.println("Other");
        

        // using nested-if

        if (number <= 7){
            if(number <= 6){
                if(number <= 5){
                    if (number <= 4){
                        if (number <= 3){
                            if (number <= 2){
                                if (number <= 1){
                                    System.out.println("Monday");
                                    return;
                                }
                                System.out.println("Tuesday");
                                return;
                            }
                            System.out.println("Wednesday");
                            return;
                        }
                        System.out.println("Thursday");
                        return;
                    }
                    System.out.println("Friday");
                    return;
                }
                System.out.println("Saturday");
                return;
            }
            System.out.println("Sunday");
            return;
        }

        else

            System.out.println("Other");
    }
}
