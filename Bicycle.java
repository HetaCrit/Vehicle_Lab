public class Bicycle extends Vehicle {
    //variable setup
    boolean hasBell;
    //constructor setup
    public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel); //Using Inheritance to call the parent class constructor (why does a bicycle have fuel? calories?)
        this.hasBell = hasBell;
    }

    //Object Method setup
    @Override
    public void start() {
        System.out.println("Bicycle started.");
    }
    public void stop() {
        System.out.println("Bicycle stopped.");
    }
    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring ring!");
        } else {
            System.out.println("This bicycle has no bell.");
        }
    }

    //getter and setter methods for typeOfBicycle and numberOfGears
    public boolean hasBell() {
        return hasBell;
    }
    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}