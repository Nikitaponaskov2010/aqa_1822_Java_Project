package projekt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ControllerCollection {

    public List readFile() {
        List<String>  warehouse = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\aqa_1822_Java_Project\\src\\resources\\Products.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                warehouse.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String str :  warehouse) {
            System.out.println(str);
        }
        String[] array =  warehouse.get(0).split(",");
        double stoimost = Double.parseDouble(array[1]);
        System.out.println("stoimost = " + stoimost);

        return  warehouse;
    }






    }