package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {


        int [][] arrayIrr = {
                {1,2,3},
                {11,12,13,14,15},
                {20,30,40,50}
        };

        for(int[] row : arrayIrr){
            for(int val : row){
                
                System.out.print(val+" ");
            }
                System.out.println();
        }
    }
}
