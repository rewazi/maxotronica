package ee.ivkhkdev.services;

import ee.ivkhkdev.App;
import ee.ivkhkdev.interfaces.ProductProvider;
import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.model.Product;

public class ProductService {

    public final ProductProvider productProvider;

    public ProductService(ProductProvider productProvider) {
        this.productProvider = productProvider;
    }

    public boolean add(Input input) {
        Product product = productProvider.create(input);
        for (int i = 0; i < App.products.length; i++) {
            if (App.products[i] == null) {
                App.products[i] = product;
                System.out.println("Товар добавлен");
                return true;
            }
        }
        return false;
    }

    public String printListProducts() {
        return productProvider.getList();
    }
}
