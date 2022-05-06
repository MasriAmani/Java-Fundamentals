package labs_examples.arrays.labs;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(4);

        System.out.println("First element in arraylist is "+list.get(0));
        System.out.println("The index of the number 9 in the arraylist is: "+list.indexOf(9));
        System.out.println("The size of the arraylist is: "+list.size());

        // adding element 10 at index 3
        list.add(3,10);
        System.out.println("Element at index 3 now is: "+list.get(3));
        // size would increase by 1
        System.out.println("The size of the arraylist now is: "+list.size());

        //check if the list is empty
        System.out.println(list.isEmpty());

        // remove index at 0
        list.remove(0);
        System.out.println("Element at index 0 now is: "+list.get(0));
        // size will be reduced by 1
        System.out.println("The size of the arraylist now is: "+list.size());
    }


}
