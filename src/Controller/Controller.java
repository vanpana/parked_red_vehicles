package Controller;

import Model.*;
import Repository.Repository;

import java.util.ArrayList;

public class Controller {
    private Repository repo;

    public Controller(Repository repo) {
        this.repo = repo;
    }

    public void add(String type, int id, String make, String model, String engine_size, String color) throws Exception
    {
        Vehicle v = null;
        type = type.toLowerCase();

        if (type.equals("car")) v = new Car(id, make, model, engine_size, color);
        else if (type.equals("motorbike")) v = new Motorbike(id, make, model, engine_size, color);
        else if (type.equals("bike") || type.equals("bicycle")) v = new Bicycle(id, make, model, engine_size, color);

        try{
            repo.add(v);
        }
        catch (Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

//    public void del(int id) throws Exception
//    {
//        int counter = 0;
//        for (Vehicle v : repo.getArr())
//            if (v.getId() == id){
//                try{
//                    del(id);
//                    break;
//                }
//                catch (Exception e){
//                    throw new Exception(e.getMessage());
//                }
//            }
//        throw new Exception("No vehicle with this ID!");
//    }

    public Vehicle[] getRedVehicles(){
        Array redVehicles = new Array();

        for(Vehicle v : repo.getItems()){
            if (v.getColor().toLowerCase().equals("red")) try{redVehicles.add(v);}catch (Exception e){System.out.println(e.getMessage());}
        }

        return redVehicles.getItems();
    }
    public Vehicle[] getItems() { return repo.getItems(); }
}
