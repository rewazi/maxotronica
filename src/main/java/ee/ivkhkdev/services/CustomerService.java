package ee.ivkhkdev.services;

import ee.ivkhkdev.App;
import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.interfaces.CustomerProvider;
import ee.ivkhkdev.model.Customer;

public class CustomerService {
    private CustomerProvider customerProvider;

    public CustomerService(CustomerProvider customerProvider) {
        this.customerProvider = customerProvider;
    }

    public boolean add(Input input) {
        try {
            Customer customer = customerProvider.create(input);
            if (customer == null) return false;

            for (int i = 0; i < App.customers.length; i++) {
                if (App.customers[i] == null) {
                    App.customers[i] = customer;
                    return true;
                }
            }
            System.out.println("Список покупателей заполнен.");
            return false;
        } catch (Exception e) {
            System.err.println("Ошибка при добавлении покупателя: " + e.getMessage());
            return false;
        }
    }

    public String printListCustomers() {
        return customerProvider.getList();
    }
}
