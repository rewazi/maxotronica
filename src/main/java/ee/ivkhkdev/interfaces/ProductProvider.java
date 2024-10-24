package ee.ivkhkdev.interfaces;

import ee.ivkhkdev.model.Product;

public interface ProductProvider {
    Product create(Input input);
    String getList();
}
