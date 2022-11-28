package servise.products;

public class ProdModel {
    private int id;
    private String productsName;
    private int countOfLoader;
    private String storekeeperName;

    public ProdModel(int id, String productsName, int countOfLoader, String storekeeperName) {
        this.id = id;
        this.productsName = productsName;
        this.countOfLoader = countOfLoader;
        this.storekeeperName = storekeeperName;
    }

    public int getId() {
        return id;
    }

    public String getProductsName() {
        return productsName;
    }

    public int getCountOfLoader() {
        return countOfLoader;
    }

    public String getStorekeeperName() {
        return storekeeperName;
    }
}
