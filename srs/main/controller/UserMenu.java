package controller;


public class UserMenu extends Menu {



    private String[] userMenu = {
         "1.Посмотреть список грузчиков",
         "2.Посмотреть наименование товара",
            "3.Вернуться в меню",
         "4.Выйти из системы",
    };

    @Override
      public String[] getMenu() {
            return userMenu;
        }

    @Override
    public String[] getproductsAdminMenu() {
        return userMenu;
    }
}
