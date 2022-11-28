package servise.user;

import dao.DaoFail;
import dao.UserFail;

import java.util.ArrayList;

public class ValidationOfCredentials {
    private DaoFail usersFile = new UserFail();

    private boolean existVerification (String login, String password) {
        ArrayList<UserModel> users = (ArrayList<UserModel>) usersFile.readFile();
        for (UserModel user: users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public TypeOfUser getTypeOfUser (String login, String password) throws ClassNotFoundException {
        if (existVerification(login, password)) {
            ArrayList<UserModel> users = (ArrayList<UserModel>) usersFile.readFile();
            for (UserModel user: users) {
                if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                    return user.getTypeOfUser();
                }
            }
        }
        throw new ClassNotFoundException("Cant find TypeOfUser");
    }
}
