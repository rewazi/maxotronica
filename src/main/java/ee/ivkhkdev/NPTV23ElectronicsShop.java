package ee.ivkhkdev;

import ee.ivkhkdev.interfaces.impl.AppHelperCustomers;
import ee.ivkhkdev.services.ProductService;
import ee.ivkhkdev.interfaces.ProductProvider;
import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.interfaces.impl.ConsoleInput;
import ee.ivkhkdev.interfaces.impl.AppHelperProducts;
import ee.ivkhkdev.services.CustomerService;

public class NPTV23ElectronicsShop {

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        ProductProvider productProvider = new AppHelperProducts();
        ProductService productService = new ProductService(productProvider);
        AppHelperCustomers customerProvider = new AppHelperCustomers();
        CustomerService customerService = new CustomerService(customerProvider);
        App app = new App(input, productService, customerService);
        app.run();
    }
}
