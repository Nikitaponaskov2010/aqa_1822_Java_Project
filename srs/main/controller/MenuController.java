package controller;

import servise.LoaderServise;
import servise.ProductsServise;
import servise.UserServise;
import servise.loader.LoaderModel;
import servise.products.ProdModel;
import servise.user.TypeOfUser;
import servise.user.UserModel;

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
            workWithuserAdminMenu();
        }
    }


    private void workWithAdminMenu() {
        showMenu(menu);
        switch (sc.nextInt()) {
            case 1: {
                workWithproductsAdminMenu();
                break;
            }
            case 2: {
                workWithloaderAdminMenu();
                break;
            }
            case 3: {
                workWithuserAdminMenu();
                break;
            }
            case 4: {
                loginController.login();
            }
            case 5: {
                return;
            }
            default: {
                showErrorMenuMessage();
                workWithAdminMenu();
            }
        }
    }

    private void showErrorMenuMessage() {
        System.out.println("Wrong menu point");
    }


    private ProductsServise productsServise = new ProductsServise();

    private void workWithproductsAdminMenu() {
        showSubMenu(((AdminMenu) menu).getproductsAdminMenu());
        switch (sc.nextInt()) {
            case 1: {
                ProdModel prodModel = createNewProducts();
                productsServise.addNewProducts(prodModel);
                workWithproductsAdminMenu();
                break;
            }
            case 2: {

            }

            case 3: {
                workWithAdminMenu();
            }
            case 4: {

            }
            default: {
                showErrorMenuMessage();
                workWithAdminMenu();
            }

        }
    }

    private ProdModel createNewProducts() {
        int id;
        String productsName;
        int costProducts;
        String storekeeperName;

        System.out.print("Введите айди товара: ");
        id = sc.nextInt();
        System.out.print("Введите товар: ");
        productsName = sc.next();
        System.out.print("Введите стоимость товара: ");
        costProducts = sc.nextInt();
        System.out.print("Введите имя кладовщика: ");
        storekeeperName = sc.next();
        return new ProdModel(id, productsName, costProducts, storekeeperName);
    }

    private LoaderServise loaderServise = new LoaderServise();

    private void workWithloaderAdminMenu() {
        showSubMenu(((AdminMenu) menu).getLoaderAdminMenu());
        switch (sc.nextInt()) {
            case 1: {

            }
            case 2: {
                LoaderModel loaderModel = createNewLoader();
                loaderServise.addNewLoader(loaderModel);
                workWithloaderAdminMenu();
            }

            case 3: {

                workWithAdminMenu();

            }
            case 4: {

            }
            default: {
                showErrorMenuMessage();
                workWithAdminMenu();
            }

        }
    }


    private LoaderModel createNewLoader() {

        int id;
        String fio;
        int age;
        String adminName;


        System.out.print("Введите айди грузчика: ");
        id = sc.nextInt();
        System.out.print("Введите фамилию имя отчество: ");
        fio = sc.next();
        System.out.print("Введите возраст грузчика: ");
        age = sc.nextInt();
        System.out.print("Введите имя администратора: ");
        adminName = sc.next();

        return new LoaderModel(id, fio, age, adminName);
    }

    private UserServise userServise = new UserServise();

    private void workWithuserAdminMenu() {
        showSubMenu((menu).getMenu());
        switch (sc.nextInt()) {
            case 1: {

            }
            case 2: {

            }

            case 3: {
                UserModel userModel = createNewUser();
                userServise.addNewUser(userModel);
                workWithuserAdminMenu();

            }
            case 4: {

            }
            default: {
                showErrorMenuMessage();
                workWithAdminMenu();
            }

        }
    }

    private UserModel createNewUser() {
        int id;
        String login;
        String password;
        TypeOfUser typeOfUser;


        System.out.print("Введите айди пользователя: ");
        id = sc.nextInt();
        System.out.print("Введите логин: ");
        login = sc.next();
        System.out.print("Введите пароль: ");
        password = sc.next();
        System.out.print("Введите тип пользователя : ");
        String userType = sc.next();
        typeOfUser =
                userType.contains("admin") ? TypeOfUser.ADMINISTRATOR :
                        userType.contains("store") ? TypeOfUser.STOREKEEPER :
                                TypeOfUser.USER;

        return new UserModel(id, login, password, typeOfUser);

    }


}



    
