package projekt;

import java.util.Scanner;

public class MeinMenu  {
    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);




    public void userMenuController() {
        System.out.println("Welcome to user menu\n");
        menu.showMenu(menu.generateUserMenu());
        int menuPoint = menu.getMenuPointer();
        switch (menuPoint) {
            case 1: {
                userMenuController();
                userMenuController();
            }
            case 2: {
                userSearchSubmenuController();
                userMenuController();
            }

            case 3: {
                System.exit(0);
            }
            default: {
                System.out.println("Not a menu point");
            }
        }
    }


    public void adminMenuController() {
        System.out.println("Welcome to admin menu\n");
        menu.showMenu(menu.generateAdminMenu());
        int adminMenuPoint = menu.getMenuPointer();
        switch (adminMenuPoint) {
            case 1: {
                adminAddSubmenuController();
                adminMenuController();
            }
            case 2: {
                adminChangeSubmenuController();
                adminMenuController();
            }
            case 3: {
                adminDeleteSubmenuController();
                adminMenuController();
            }

            case 4: {
                System.exit(0);
            }
            default: {
                System.out.println("Not a menu point");
            }
        }
    }

}
