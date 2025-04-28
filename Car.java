public class Car extends Vehicle {
    //variable setup
    private int NumberOfDoors;

    //constructor setup
    public Car(int speed, double fuel, int NumberOfDoors) {
        super(speed, fuel); //Using Inheritance to call the parent class constructor
        this.NumberOfDoors = NumberOfDoors;
    }

    //Object Method setup
    @Override
    public void start() {
        System.out.println("Car started.");
    }
    public void stop() {
        System.out.println("Car stopped.");
    }
    public void honk() {
        System.out.println("Honk! Honk!");
    }

    //getter and setter methods for NumberOfDoors
    public int getNumberOfDoors() {
        return NumberOfDoors;
    }
    public void setNumberOfDoors(int NumberOfDoors) {
        this.NumberOfDoors = NumberOfDoors; 
    }

}
