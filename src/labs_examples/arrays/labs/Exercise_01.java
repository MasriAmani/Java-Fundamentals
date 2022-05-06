package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers separated by space:");
        int [] arrayNum = new int [10];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 10; i++){

            arrayNum[i] = scanner.nextInt();
            System.out.println(arrayNum[i]);
            sum += arrayNum[i];
            count += 1;

        }
        System.out.println("Sum is: "+ sum +" and Average is: " +(float)sum/(float)count);



    }

}