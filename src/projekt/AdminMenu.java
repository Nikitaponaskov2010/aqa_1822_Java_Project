package projekt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AdminMenu extends ControllerCollection {

    private boolean end = true;

    ControllerCollection controllerCollection = new ControllerCollection();
    List<String> warehouse = controllerCollection.readFile();
    Map<Integer, String> ChooseOfNumber = new HashMap<>();
    Map<Integer, String> ChooseOfNumberSubMenu = new HashMap<>();


    private void AdminCreatedMenu() {
        ChooseOfNumber.put(1, "Посмотреть список категорий");
        ChooseOfNumber.put(2, "Выбрать категорию товара");
        ChooseOfNumber.put(3, "Выбрать сумму");
        ChooseOfNumber.put(4, "Вернуться в меню");
        ChooseOfNumber.put(5, "Выйти из системы");

        System.out.println(ChooseOfNumber);

    }

    private void AdminCreatedSubMenu() {
        ChooseOfNumberSubMenu.put(1, "Добавить товар");
        ChooseOfNumberSubMenu.put(2, "Удалить товар");
        ChooseOfNumberSubMenu.put(3, "Добавить сумму");
        ChooseOfNumberSubMenu.put(4, "Удалить сумму");
        ChooseOfNumberSubMenu.put(5, "Поменять производителя товара");
        ChooseOfNumberSubMenu.put(6, "Вернуться в меню");
        ChooseOfNumberSubMenu.put(7, "Выйти из системы")




        System.out.println(ChooseOfNumberSubMenu);


    }


    public int getMenuPointer() {
        System.out.println("\nEnter menu point");
        return new Scanner(System.in).nextInt();
    }



    }
