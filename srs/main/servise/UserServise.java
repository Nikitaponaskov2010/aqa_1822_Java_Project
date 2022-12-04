package servise;

import dao.DaoFail;
import dao.UserFail;
import servise.user.UserModel;


import java.util.ArrayList;

public class UserServise {
    private ArrayList<UserModel> user;
    private DaoFail userFail = new UserFail();

    public UserServise() {
        this.user = (ArrayList<UserModel>) userFail.readFile();
    }

    public boolean addNewUser(UserModel userModel) {
        user.add(userModel);
        ArrayList <String> convertedCollection = convertUseToString();
        return userFail.saveFile(convertedCollection, "user");
    }



    private ArrayList<String>  convertUseToString() {
        ArrayList<String> strings = new ArrayList<>();
        for (UserModel model : user) {
            strings.add(model.getId() + "," + model.getLogin() + "," + model.getPassword() + "," + model.getTypeOfUser());
        }
        return strings;
    }
}
