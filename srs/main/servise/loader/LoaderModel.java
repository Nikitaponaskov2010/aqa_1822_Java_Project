package servise.loader;

public class LoaderModel {
    private int id;
    private String fio;
    private int age;
    private String adminName;


    public LoaderModel(int id, String fio, int age,  String adminName) {
        this.id = id;
        this.fio = fio;
        this.age = age;
        this.adminName = adminName;

    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public String getAdminName() {
        return adminName;
    }

}