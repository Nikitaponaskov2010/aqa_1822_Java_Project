package projekt;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMenu extends ControllerCollection {
    private boolean end = true;

    ControllerCollection controllerCollection = new ControllerCollection();
    List<String> warehouse = controllerCollection.readFile();
    Map<Integer, String> ChooseOfNumber = new HashMap<>();


    private void UserCreatedMenu() {
        ChooseOfNumber.put(1, "Посмотреть список категорий");
        ChooseOfNumber.put(2, "Выбрать категорию товара");
        ChooseOfNumber.put(3, "Выбрать сумму");
        ChooseOfNumber.put(4, "Вернуться в меню");
        ChooseOfNumber.put(5, "Выйти из системы");

        System.out.println(ChooseOfNumber);








    }
