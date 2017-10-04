package Repository;

import Model.Vehicle;

import java.util.ArrayList;

public class Repository {
    ArrayList<Vehicle> items;

    public Repository(){
        items = new ArrayList<>();
    }

    public void add(Vehicle v) throws Exception
    {
        for(Vehicle vehicle : items){
            if (v.equals(vehicle))
                throw new Exception("Vehicle already exists!");
        }

        items.add(v);
    }

    public void del(int index) throws Exception
    {
        if (index > items.size())
            throw new Exception("Index exceeds array size!");
        items.remove(index);
    }

    public void del(Vehicle v) throws Exception
    {
        int counter = 0;
        for(Vehicle vehicle : items) {
            if (vehicle.equals(v)){
                items.remove(counter);
                break;
            }
            counter++;
        }
        throw new Exception("Vehicle does not exist!");
    }

    public ArrayList<Vehicle> getItems(){
        return items;
    }
}
