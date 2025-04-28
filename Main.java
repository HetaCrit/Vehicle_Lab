public class Main {
    public static void main(String[] args) {
        // Create object
        Car car = new Car(180, 40.0, 4);
        Bicycle bike = new Bicycle(21, 150.0, true);
        

        //storyboarding time

        //log the car starts
        System.out.println("A man drives his car to work");
        car.start();
        car.displayFuel();

        System.out.println("As he drives he spots a bike infront of the road too late!");
        bike.start();
        bike.displayFuel(); 
        System.out.println("He swerves to avoid the bike that has fuel attached and honks his horn!");
        bike.setHasBell(true);
        bike.ringBell();
        car.stop();
        car.honk();
        System.out.println("its too late! the car crashes into the bike! and the car gets more doors! WHAT IS GOING ON?");
        bike.stop();
        bike.setFuel(0);
        bike.setHasBell(false);
        car.setNumberOfDoors(8);
        car.setFuel(15);

        System.out.println("The remaining stats on the vehicles are as follows: bike fuel: " + bike.getFuel() + " Horn availbility: " + bike.hasBell() +  " | Car stats: " + car.getFuel() + " pixels, and the car has now " + car.getNumberOfDoors() + " doors.");

    }
}
