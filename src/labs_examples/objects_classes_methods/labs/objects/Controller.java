package labs_examples.objects_classes_methods.labs.objects;

public class Controller {

    public static void main(String[] args) {

        Person person1 = new Person("Amani");
        Person person2 = new Person("Rami",29);
        Person person3 = new Person("Sarah",25,"961898676");

        Book book = new Book("The Alchemist",160);

        System.out.println(person1.name+" reads "+book.title+" book");

        PlaneEngine engine = new PlaneEngine(1000);
        Cockpit cockpit = new Cockpit(15);
        Wing wing = new Wing("Rectangle",200);
        Wheel wheel = new Wheel(500,"AeroSavvy");
        AirPlane airPlane = new AirPlane(engine,cockpit,wing,wheel,1000,5,"Delta",500);

        System.out.println(engine);
        System.out.println(cockpit);
        System.out.println(airPlane);


    }

}
