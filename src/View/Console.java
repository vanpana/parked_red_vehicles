package View;

import Controller.Controller;
import Model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {

    private Controller ctrl;

    public Console(Controller ctrl) {
        this.ctrl = ctrl;
    }

    private void showMenu(){
        System.out.println("=====================================");
        System.out.println("Choose option: ");
        System.out.println("1. Show all vehicles and their types.");
        System.out.println("2. Show all red vehicles and their types.");
        System.out.println("3. Exit.");
    }

    private void showAll(){
        Vehicle[] items = ctrl.getItems();
        System.out.println(String.format("There are %d parked vehicles", items.length));
        for(Vehicle v : items){
            System.out.println(v);
        }
    }

    private void showRed(){
        Vehicle[] items = ctrl.getRedVehicles();
        System.out.println(String.format("There are %d parked red vehicles", items.length));
        for(Vehicle v : items){
            System.out.println(v);
        }
    }

    private void loop(){
        int option = -1;
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            showMenu();
            option = scan.nextInt();


            if (option == 1) showAll();
            else if (option == 2) showRed();
            else if (option == 0) break;
            else System.out.println("Option is not available yet!");
        }
        scan.close();
    }

    public void runApp(){
        loop();
    }
}
