package Repository;

import Model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRepository extends Repository {
    private String filename;

    public FileRepository(String filename) {
        super();
        this.filename = filename;
        loadFromFile();
    }

    private void loadFromFile() {
        File file = new File(filename);

        try{
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()){
                String[] split = scan.nextLine().split(",");

                Vehicle v = null;
                split[0] = split[0].toLowerCase();

                if (split[0].equals("car")) v = new Car(Integer.parseInt(split[1]), split[2], split[3], split[4], split[5]);
                else if (split[0].equals("motorbike")) v = new Motorbike(Integer.parseInt(split[1]), split[2], split[3], split[4], split[5]);
                else if (split[0].equals("bike") || split[0].equals("bicycle")) v = new Bicycle(Integer.parseInt(split[1]), split[2], split[3], split[4], split[5]);

                try {
                    super.add(v);
                }
                catch (DuplicateIDException e)
                {
                    System.out.print("When loading from file: ");
                    System.out.println(e.getMessage());
                }
            }

            scan.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
