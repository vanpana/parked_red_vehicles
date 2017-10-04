package Model;

public class Motorbike extends Vehicle {
    public Motorbike(int id, String make, String model, String engine_size, String color) {
        super(id, make, model, engine_size, color);
    }

    @Override
    public String toString() {
        return "Motorbike: " + super.toString();
    }
}
