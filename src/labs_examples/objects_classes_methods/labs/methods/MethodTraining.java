package labs_examples.objects_classes_methods.labs.methods;
import java.lang.Math.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {

    public static void main(String[] args) {

        //1.Overloading
        int a = 2;
        int b = 3;
        int c = 5;

        double x = 13.7;
        double y =20.2;

        System.out.println(multiply(a,b));
        System.out.println(multiply(a,b,c));
        System.out.println(multiply(x,y));

        //2.
        //passing by value
        addOne(a); //we passed a copy of a
        System.out.println(a); //the value of a didn't change

        Person person = new Person("Amani",29);
        changeName(person,"rayan"); // we are passing by reference so the person object will be modified
        System.out.println(person.name);

        //3.
        System.out.println(max(5,7,2,1));


        //4.
        System.out.println(consonants("Amani"));

        //5.
        System.out.println(isPrime(13));
        System.out.println(isPrime(9));

        //6.
        int [] arr ={4,1,3,9,11,0,7};
        System.out.println(Arrays.toString(minMax(arr)));

        //7.
        ArrayList<Integer> list = arrayList(20,2,3);
        System.out.println(list);
        System.out.println(list.size());

        //8.
        reverse(arr);
        System.out.println(Arrays.toString((arr)));

    }
    //1.
    //Overloading the multiply method

    public static int multiply(int a, int b){

        return a * b;

    }

    public static int multiply(int a, int b,int c){

        return a * b * c;

    }

    public static double multiply(double a, double b){

        return a * b;

    }

    //2.Passing by value vs. Passing by reference
    public static int addOne (int a){
        a +=1;
        return a;
    }
    public static void changeName (Person p, String name){

        p.name = name;
    }

    //3.

    public static int max(int a , int b , int c , int d){
        int max = a;
        if (b > max)
                max =b;
        if (c > max)
                max = c;
        if (d > max)
               max = d;
        return max;
    }
    //4.
    public static int consonants (String s){

        String vowels ="AEIOUaeiou";
        int count = 0;

        for (int i = 0 ; i < s.length()-1 ; i++){

            if (vowels.contains(""+s.charAt(i))) {
                continue;
            }
            count++;

        }
        return count;
    }

    //5.

    public static boolean isPrime(int a){

        for (int i = 2 ; i <= Math.sqrt(a) ; i++){

            if (a % i == 0)
                    return false;
        }
        return true;
    }

    //6.

    public static int [] minMax (int [] arr) {
        int[] minMaxArr = {arr[0], arr[0]};
        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] < minMaxArr[0])
                minMaxArr[0] = arr[i];
            if (arr[i] > minMaxArr[1])
                minMaxArr[1] = arr[i];
        }
        return minMaxArr;
    }

    //7.
    public static ArrayList<Integer> arrayList(int maxNum, int divisor1, int divisor2){

        ArrayList<Integer> list = new ArrayList();
        for (int i = 0 ; i < maxNum ;i++){
            if(i % divisor1 == 0 && i % divisor2 == 0)
                list.add(i);
        }
        return list;
    }

    //8.
    public static void reverse (int [] arr){
        int temp;
        for (int i = 0 ; i < arr.length /2 ; i++){
            temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i] = temp;
        }
    }

}
