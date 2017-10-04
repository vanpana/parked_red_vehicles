package Model;

public class Car extends Vehicle {
    public Car(int id, String make, String model, String engine_size, String color) {
        super(id, make, model, engine_size, color);
    }

    @Override
    public String toString() {
        return "Car: " + super.toString();
    }
}
