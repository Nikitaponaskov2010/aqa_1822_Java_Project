package controller;

public class AdminMenu extends Menu {

    private String[] adminMenu = {
            "1.Работа с грузчиками",
            "2.Работа с категориями товара",
            "3.Выбрать сумму",
            "4.Вернуться в меню",
            "5.Выйти из системы",
    };
   private String [] productsAdminMenu={
           "1. Добавить товар",
           "2. Изменить товар",
           "3. Удалить товар",
           "4. Вернуться в меню"

   };


    private String[] loaderAdminMenu = {
            "1.Посмотреть список категорий",
            "2.Выбрать категорию товара",
            "3.Выбрать сумму",
            "4.Вернуться в меню",
            "5.Выйти из системы",
    };


    private String[] userAdminMenu= {
            "1.Добавить товар",
            "2.Изменить товара",
            "3.Удалить товар",
            "4.Вернуться в меню",
            "5.Выйти из системы",
    };


    @Override
    public String[] getMenu() {
        return adminMenu;
    }

    public String[] getproductsAdminMenu() {
        return productsAdminMenu;
    }

    public String[] getLoaderAdminMenu() {
        return loaderAdminMenu;
    }

    public String[] getUserAdminMenu() {
        return userAdminMenu;
    }


}
