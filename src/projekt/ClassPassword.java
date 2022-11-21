package projekt;


import java.util.Scanner;

public class ClassPassword {

    int passwordAdmin = 0000;
    int passwordUser = 1111;

    static int enteringDataAtlogin() {
        System.out.println("Введите пароль: ");
        return new Scanner(System.in).nextInt();
    }

    public void methodLoginInSystem() {
        if (passwordAdmin == enteringDataAtlogin()) {
            System.out.println("Добропожаловать Админ !");
        }
        if (passwordUser == enteringDataAtlogin()) {
            System.out.println("Добропожаловать Пользователь !");
        } else {
            System.out.println("Ошибка, неверный пароль!");
        }
    }
}
