package ee.ivkhkdev.interfaces;

import ee.ivkhkdev.model.Customer;

public interface CustomerProvider {
    Customer create(Input input);
    String getList();
}
