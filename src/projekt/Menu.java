package projekt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private final Map <Integer,String> adminAddSubmenu = new HashMap<>();
    private final Map<Integer,String> adminChangeSubmenu = new HashMap<>();
    private final Map<Integer,String> adminDeleteSubmenu = new HashMap<>();
    private final Map <Integer, String> adminMenu = new HashMap<>();
    private final Map <Integer, String> userMenu = new HashMap<>();

    public Map<Integer, String> generateAdminAddSubmenu(){
        adminAddSubmenu.put(1, "Добавить порошок");
        adminAddSubmenu.put(2, "Добавить сумму товара");
        adminAddSubmenu.put(3, "Добавить мыло");
        adminAddSubmenu.put(4, "Добавить производителя зубной пасты");
        adminAddSubmenu.put(5, "Вернуться в меню");
        return adminAddSubmenu;
    }

    public Map<Integer, String> generateAdminChangeSubmenu(){
        adminChangeSubmenu.put(1, "Поменять порошок");
        adminChangeSubmenu.put(2, "Поменять сумму товара");
        adminChangeSubmenu.put(3, "Поменять производителя мыло");
        adminChangeSubmenu.put(4, "Поменять производителя зубной пасты");
        adminChangeSubmenu.put(5, "Вернуться в меню");
        return adminChangeSubmenu;
    }

    public Map<Integer, String> generateAdminDeleteSubmenu(){
        adminDeleteSubmenu.put(1, "Удалить порошок");
        adminDeleteSubmenu.put(2, "Удалить сумму");
        adminDeleteSubmenu.put(3, "Удалить производителя мыло");
        adminDeleteSubmenu.put(4, "Удалить производителя зубной пасты");
        adminDeleteSubmenu.put(5, "Вернуться в меню");
        return adminDeleteSubmenu;
    }

    public void showMenu (Map<Integer, String> menu){
        for (int i = 1; i < menu.size() + 1; i++){
            System.out.println(i + ". " + menu.get(i));
        }
    }

    public Map<Integer, String> generateAdminMenu(){
        adminMenu.put(1, "Добавить в базу данных");
        adminMenu.put(2, "Поменять в базе данные");
        adminMenu.put(3, "Удалить из базы");
        adminMenu.put(4, "Выйти из системы");
        adminMenu.put(5, "Закрыть программу");

        return adminMenu;
    }

    public Map<Integer, String > generateUserMenu(){
        userMenu.put(1, "Выберете категорию порошки");
        userMenu.put(2, "Выберете категорию сумма ");
        userMenu.put(3, "Выберете категорию мыло");
        userMenu.put(4, "Выйти из системы");
        userMenu.put(5, "Закрыть программу");

        return userMenu;
    }


    public int getMenuPointer() {
        System.out.println("\nEnter menu point");
        return new Scanner(System.in).nextInt();
    }



    }
