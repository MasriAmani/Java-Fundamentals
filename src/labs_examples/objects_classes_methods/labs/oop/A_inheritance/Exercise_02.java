package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: It prints 10
 * Because in the main method the object "a" created of type subclass "B" is referenced using superclass reference
 * so it will have access only to those parts(methods and variables) of the object defined by the superclass "A"
 * so it can only access the variable "i" in the superclass "A", which has the value 10
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}