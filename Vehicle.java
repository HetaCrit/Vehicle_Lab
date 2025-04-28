//no needed imports for object

public class Vehicle {
    //variable setup
    protected int speed;
    private double fuel;

    //constructor setup
    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    //Object methods setup
    public void start() {
        System.out.println("Vehicle started.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    public final void displayFuel() {
        System.out.println("Fuel level: " + fuel + " pixels.");
    }


    //getter and setter methods for speed and fuel
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public double getFuel() {
        return fuel;
    }
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}