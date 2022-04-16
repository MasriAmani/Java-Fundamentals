package labs_examples.fundamentals.labs;


import java.util.Locale;

/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int len = str.length();
        System.out.println(len);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean eql = str.equals(str2);
        System.out.println(eql);

        // please concatenate str & str2 and set the result to a new String variable below
        String newStr = str + str2;
        System.out.println(newStr);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        String newStr2 = str.replace("!","?"); // returns a new string which is a copy of str string with the  character "!" replaced with "?"
        System.out.println(newStr2);

        System.out.println(newStr2.toUpperCase()); // prints the newStr2 string with all the letters in uppercase

        System.out.println(str.contains("he")); // returns true if the str string contains "he" and false otherwise

        System.out.println(str.contains("fa")); // returns true if the str string contains "fa" and false otherwise

        System.out.println(str.isEmpty()); // checks if the str string is empty i.e. has zero characters

        System.out.println(str.substring(1,3)); // returns a substring of str from index 1 (included) till index 3 (excluded)

        System.out.println(str.indexOf("l")); // returns the index of the first occurrence of character "l" in string str


    }


}