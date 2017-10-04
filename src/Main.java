import Repository.*;
import Controller.Controller;
import View.Console;

public class Main {
    public static void main(String[] args) {
        Repository repo = new FileRepository("/Users/vanpana/Documents/Uni/An2/MAP/src/Data/vehicles.csv");
        Controller ctrl = new Controller(repo);
        Console ui = new Console(ctrl);

        ui.runApp();
    }
}
