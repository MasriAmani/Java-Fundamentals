package labs_examples.objects_classes_methods.labs.oop.A_inheritance;



public class Exercise_01 {

    public static void main(String[] args) {

        Shape s = new Shape("Black");
        Circle cir = new Circle("Red",5);
        Cylinder cyl = new Cylinder("White",5,11);
        Triangle tri = new Triangle("Green",12,6,10,9);
        Rectangle rec = new Rectangle("Blue",10,6);

        System.out.println("The color of the shape is "+s.getColor());
        System.out.println("The area of circle is "+cir.area()+" and the perimeter is "+cir.perimeter());
        System.out.println("The volume of cylinder is "+cyl.volume());
        System.out.println("The area of triangle is "+tri.area()+" and the perimeter is "+tri.perimeter());
        System.out.println("The area of rectangle is "+rec.area()+" and the perimeter is "+rec.perimeter());





    }
}

class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double area () {
        return 0;
    }

    public double perimeter () {
        return 0;
    }
}


class Circle extends Shape {

    private static final double PI = Math.PI;
    private double diameter;

    public Circle(String color, double diameter) {
        super(color);
        this.diameter = diameter;
    }

    @Override
    public double area () {
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }
    @Override
    public double perimeter () {
        return PI * diameter;
    }
}


class Cylinder extends Circle {

    private double height;

    public Cylinder(String color, double diameter, double height) {
        super(color, diameter);
        this.height = height;
    }

    public double volume() {
        return super.area()*height;
    }

}




class Triangle extends Shape {

    private double side1;
    private double side2;
    private double base;
    private double height;

    public Triangle(String color, double side1, double side2, double base, double height) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
    }

    @Override
    public double area () {
        return (height * base) / 2.0;
    }

    @Override
    public double perimeter () {
        return side1 + side2 + base ;
    }
}



class Rectangle extends  Shape{

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area () {
        return length * width   ;
    }

    @Override
    public double perimeter () {
        return (length + width) * 2.0 ;
    }

}


