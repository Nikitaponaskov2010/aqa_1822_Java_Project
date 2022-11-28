package controller;

import java.util.Scanner;

public class MenuController {
    private Scanner sc = new Scanner(System.in);
    private Menu menu;
    private LoginController loginController;

    public MenuController(Menu menu, LoginController loginController) {
        this.menu = menu;
        this.loginController = loginController;
    }

    private void showMenu(Menu menu) {
        for (String s : menu.getMenu()) {
            System.out.println(s);
        }
    }

    private void showSubMenu(String[] submenu) {
        for (String s : submenu) {
            System.out.println(s);
        }
    }

    public void workWithMenu() {
        if (menu instanceof AdminMenu) {
            workWithAdminMenu();
        } else {
            workWithUserMenu();
        }
    }

}
