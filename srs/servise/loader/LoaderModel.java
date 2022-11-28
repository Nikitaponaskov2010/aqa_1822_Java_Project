package servise.loader;

public class LoaderModel {
    private int id;
    private String fio;
    private int age;
    private String adminName;
    private String storekeeperName;

    public LoaderModel(int id, String fio, int age, String adminName, String storekeeperName) {
        this.id = id;
        this.fio = fio;
        this.age = age;
        this.adminName = adminName;
        this.storekeeperName = storekeeperName;
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

    public String getStorekeeperName() {
        return storekeeperName;
    }
}
