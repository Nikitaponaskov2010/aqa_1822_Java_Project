package projekt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionClass {
    public static void main(String[] args) {
       CollectionClass collectionClass = new CollectionClass();
        List<String> warehouse = collectionClass.readFile();

        Scanner sc = new Scanner(System.in);

        int chtoMenyaem = sc.nextInt();
        String s = warehouse.get(chtoMenyaem);
        String[] array = s.split(",");
        array[1] = "43";

        String afterChanges = "";

        for (int i = 0; i < array.length; i++) {

            afterChanges += array[i];
            if (i != array.length - 1) {
                afterChanges += ",";
            }
        }

        warehouse.remove(chtoMenyaem);
        warehouse.add(afterChanges);
        BufferedReader bufferedWriter = null;
        try {
            bufferedWriter = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\aqa_1822_Java_Project\\src\\resources\\Products.txt"));
            for (String str1 : warehouse) {
                bufferedWriter.write(str1);
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }


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