package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {
    static float pi = 3.14f;
    public static void main(String[] args) {

      float radius = 3.14f;
      float height = 5;
      System.out.println("Volume is equal to: " + cylVolume(radius,height));
      System.out.println("Surface area is equal to: "+ cylArea(radius,height));

    }

    public static float cylVolume (float radius,float height){
           return pi * radius * radius * height;
    }

    public static float cylArea(float radius,float height){
        return 2 * pi * radius *(radius + height);
    }

}