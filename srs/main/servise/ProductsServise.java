package servise;

import dao.DaoFail;
import dao.ProductsFail;
import servise.products.ProdModel;

import java.util.ArrayList;

public class ProductsServise {
    private ArrayList<ProdModel> products;
    private DaoFail productsFail = new ProductsFail();

    public ProductsServise() {
        this.products = (ArrayList<ProdModel>) productsFail.readFile();
    }

    public boolean addNewProducts(ProdModel prodModel) {
        products.add(prodModel);
        ArrayList <String> convertedCollection = convertProductsToString();
        return productsFail.saveFile(convertedCollection, "products");
    }



    private ArrayList<String> convertProductsToString() {
        ArrayList<String> strings = new ArrayList<>();
        for (ProdModel model : products) {
            strings.add(model.getId() + "," + model.getProductsName() + "," + model.getCostProducts() + "," + model.getStorekeeperName());
        }
        return strings;
    }
}
