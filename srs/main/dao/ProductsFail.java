package dao;


import servise.products.ProdModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductsFail extends DaoFail {


    @Override
    public List readFile() {
        List<ProdModel> products = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\srs\\main\\resources\\products.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                String[] tempArray = line.split(",");

                products.add(new ProdModel(
                        Integer.parseInt(tempArray[0]),
                        tempArray[1],
                        Integer.parseInt(tempArray[2]),
                        tempArray[3]
                ));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}
