//~ Design and develop a context for given case study and implement an interface for Vehicles Consider the example of vehicles like bicycle, car and bike. All Vehicles have common functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all these common functionalities. Bicycle, Bike, Car classes should be implemented for all these functionalities in their own class in their own way.

// Vehicle interface
interface Vehicle {
    void gearChange(int gear);

    void speedUp(int speed);

    void applyBreaks();
}

// Bicycle class
class Bicycle implements Vehicle {
    public void gearChange(int gear) {
        // Implementation for changing gears on a bicycle
    }

    public void speedUp(int speed) {
        // Implementation for speeding up a bicycle
    }

    public void applyBreaks() {
        // Implementation for applying breaks on a bicycle
    }
}

// Bike class
class Bike implements Vehicle {

    public void gearChange(int gear) {
        // Implementation for changing gears on a bike
    }

    public void speedUp(int speed) {
        // Implementation for speeding up a bike
    }

    public void applyBreaks() {
        // Implementation for applying breaks on a bike
    }
}

// Car class
class Car implements Vehicle {

    public void gearChange(int gear) {
        // Implementation for changing gears on a car
    }

    public void speedUp(int speed) {
        // Implementation for speeding up a car
    }

    public void applyBreaks() {
        // Implementation for applying breaks on a car
    }
}

public class chit5 {
    public static void main(String[] args) {

        // you can use System.out.println from perticuler method or from below to get output
        Bicycle bicycle = new Bicycle();
        bicycle.gearChange(3);
        bicycle.speedUp(10);
        bicycle.applyBreaks();

        Bike bike = new Bike();
        bike.gearChange(2);
        bike.speedUp(20);
        bike.applyBreaks();

        Car car = new Car();
        car.gearChange(1);
        car.speedUp(30);
        car.applyBreaks();
    }
}
