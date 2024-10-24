package ee.ivkhkdev.interfaces.impl;

import ee.ivkhkdev.interfaces.CustomerProvider;
import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class AppHelperCustomers implements CustomerProvider {


    private final List<Customer> customers = new ArrayList<>();

    @Override
    public Customer create(Input input) {
        try {

            Customer customer = new Customer();
            System.out.print("Имя покупателя: ");
            customer.setFirstName(input.getString());
            System.out.print("Фамилия покупателя: ");
            customer.setLastName(input.getString());
            System.out.print("Номер телефона покупателя: ");
            customer.setPhone(input.getString());


            customers.add(customer);

            return customer;
        } catch (Exception e) {
            System.err.println("Ошибка при создании покупателя: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String getList() {
        if (customers.isEmpty()) {
            return "Список покупателей пуст.";
        }


        StringBuilder sbCustomers = new StringBuilder();
        for (Customer customer : customers) {
            sbCustomers.append(String.format("Покупатель: %s %s, Телефон: %s%n",
                    customer.getFirstName(), customer.getLastName(), customer.getPhone()));
        }
        return sbCustomers.toString();
    }
}
