package dao;

import servise.loader.LoaderModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoaderFail extends DaoFail {
    @Override
    public List readFile() {
        List<LoaderModel> loader = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\srs\\resources\\loader.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                String[] tempArray = line.split(",");

                loader.add(new LoaderModel(
                                Integer.parseInt(tempArray[0]),
                                tempArray[1],
                                Integer.parseInt(tempArray[2]),
                                tempArray[3])
                );

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loader;
    }
}
