package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        for (; i < 10 ; i++){

            sum += i;

            if (sum > 20)
                break;          // loop will break at sum = 21 and i = 6
        }
        
        System.out.println(sum+", "+i);
    }
}
