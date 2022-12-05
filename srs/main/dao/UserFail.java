package dao;

import servise.user.TypeOfUser;
import servise.user.UserModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserFail extends DaoFail{
    @Override
    public ArrayList<UserModel> readFile() {
        ArrayList<UserModel> userModels = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\srs\\main\\resources\\users.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                String[] tempArray = line.split(",");

                userModels.add(new UserModel(
                        Integer.parseInt(tempArray[0]),
                        tempArray[1],
                        tempArray[2],
                        getTypeOfUserByString(tempArray[3])
                ));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userModels;
    }

    private TypeOfUser getTypeOfUserByString(String typeOfUser) {
        TypeOfUser tempUserType;

        if (typeOfUser.contains("администратор")) {
            tempUserType = TypeOfUser.ADMINISTRATOR;
        } else {
            tempUserType = TypeOfUser.STOREKEEPER;
        }
        return tempUserType;
    }
}
