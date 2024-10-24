package ee.ivkhkdev.interfaces.impl;

import ee.ivkhkdev.App;
import ee.ivkhkdev.interfaces.ProductProvider;
import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.model.Product;

public class AppHelperProducts implements ProductProvider {

    @Override
    public Product create(Input input) {
        Product product = new Product();
        System.out.print("Название товара: ");
        product.setName(input.getString());
        System.out.print("Бренд товара: ");
        product.setBrand(input.getString());
        System.out.print("Цена товара: ");
        product.setPrice(Double.parseDouble(input.getString()));
        return product;
    }

    @Override
    public String getList() {
        StringBuilder sbProducts = new StringBuilder();
        for (Product product : App.products) {
            if (product != null) {
                sbProducts.append(String.format("Товар: %s, Бренд: %s, Цена: %.2f%n", product.getName(), product.getBrand(), product.getPrice()));
            }
        }
        return sbProducts.toString();
    }
}
