package servise.products;

public class ProdModel {
    private int id;
    private String productsName;
    private int costProducts;
    private String storekeeperName;

    public ProdModel(int id, String productsName, int costProducts, String storekeeperName) {
        this.id = id;
        this.productsName = productsName;
        this.costProducts = costProducts;
        this.storekeeperName = storekeeperName;
    }

    public int getId() {
        return id;
    }

    public String getProductsName() {
        return productsName;
    }

    public int getCostProducts() {
        return costProducts;
    }

    public String getStorekeeperName() {
        return storekeeperName;
    }
}
