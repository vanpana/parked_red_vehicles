package Repository;

import Model.Array;
import Model.Vehicle;

import java.util.ArrayList;

public class Repository {
    private Array arr;

    public Repository(){
        arr = new Array();
    }

    public void add(Vehicle v) throws Exception
    {
//        for(Vehicle vehicle : arr.getItems()){
//            if (v.equals(vehicle))
//                throw new Exception("Vehicle already exists!");
//        }

        arr.add(v);
    }

//    public void del(int index) throws Exception
//    {
//        if (index > arr.size())
//            throw new Exception("Index exceeds array size!");
//        arr.remove(index);
//    }

//    public void del(Vehicle v) throws Exception
//    {
//        int counter = 0;
//        for(Vehicle vehicle : arr) {
//            if (vehicle.equals(v)){
//                arr.remove(counter);
//                break;
//            }
//            counter++;
//        }
//        throw new Exception("Vehicle does not exist!");
//    }

    public Vehicle[] getItems() { return arr.getItems(); }
}
