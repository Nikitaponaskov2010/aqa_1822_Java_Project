package controller;


import servise.user.TypeOfUser;
import servise.ValidationOfCredentials;

import java.util.Scanner;

public class LoginController {

    private ValidationOfCredentials validationOfCredentials = new ValidationOfCredentials();

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = sc.nextLine();
        System.out.print("Введите пароль: ");
        String password = sc.nextLine();

        Menu menu = tryLogin(login,password);
        MenuController menuController = new MenuController(menu, this);
        menuController.workWithMenu();
    }

    private Menu tryLogin(String login, String password) {
        TypeOfUser typeOfUser = null;
        try {
            typeOfUser = validationOfCredentials.getTypeOfUser(login, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (typeOfUser.equals(TypeOfUser.ADMINISTRATOR)) {
            return new AdminMenu();
        } else {
            return new UserMenu();
            }
        }
    }
