package Model;

public class Bicycle extends Vehicle {
    public Bicycle(int id, String make, String model, String engine_size, String color) {
        super(id, make, model, engine_size, color);
    }

    @Override
    public String toString() {
        return "Bicycle: " + super.toString();
    }
}
