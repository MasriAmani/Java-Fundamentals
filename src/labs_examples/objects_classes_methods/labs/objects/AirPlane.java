package labs_examples.objects_classes_methods.labs.objects;

public class AirPlane {

    PlaneEngine engine;

    Cockpit cockpit;

    Wing wing ;

    Wheel wheel;


    double fuelCapacity;

    double currentFuelLevel;

    String model;

    double speed;


    public AirPlane(PlaneEngine engine, Cockpit cockpit, Wing wing, Wheel wheel, double fuelCapacity, double currentFuelLevel, String model, double speed) {
        this.engine = engine;
        this.cockpit = cockpit;
        this.wing = wing;
        this.wheel = wheel;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.model = model;
        this.speed = speed;
    }

    public double getEnginePower() {
        return engine.getPower();
    }

    public void setEnginePower(double power) {
        engine.setPower(power);
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "PlaneEngine=" + engine.toString() +
                ", cockpit=" + cockpit.toString() +
                ", wing=" + wing.toString() +
                ", wheel=" + wheel.toString() +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", model=" + model +
                ", speed=" + speed +
                '}';
    }
}


class PlaneEngine {

    private double power;

    public PlaneEngine(double power) {

        this.power = power;

    }
    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
    @Override
    public String toString() {
        return "PlaneEngine{" +
                "Power=" + power +
                '}';
    }
}

class Cockpit{

    private int numberOfScreens;

    public Cockpit(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }


    @Override
    public String toString() {
        return "Cockpit{" +
                "numberOfScreens=" + numberOfScreens +
                '}';
    }
}

class Wing{

    private String shape;
    private double length;

    public Wing(String shape, double length) {
        this.shape = shape;
        this.length = length;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Wing{" +
                "shape='" + shape + '\'' +
                ", length=" + length +
                '}';
    }
}


class Wheel {

    private double size;

    private String model;

    public Wheel(double size, String model) {
        this.size = size;
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", model='" + model + '\'' +
                '}';
    }
}
