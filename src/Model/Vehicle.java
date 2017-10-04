package Model;

public class Vehicle {
    private int id;
    private String make;
    private String model;
    private String engine_size;
    private String color;

    public Vehicle(int id, String make, String model, String engine_size, String color) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.engine_size = engine_size;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine_size() {
        return engine_size;
    }

    public void setEngine_size(String engine_size) {
        this.engine_size = engine_size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        Vehicle vehicle = (Vehicle) o;

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return id == vehicle.id;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", Make: " + make +
                ", Model: " + model +
                ", Engine_size: " + engine_size +
                ", Color: " + color;
    }
}
