package ee.ivkhkdev;

import ee.ivkhkdev.model.Customer;
import ee.ivkhkdev.services.ProductService;
import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.model.Product;
import ee.ivkhkdev.services.CustomerService;

public class App {

    public static Product[] products = new Product[100];
    public static Customer[] customers = new Customer[100];

    private final ProductService productService;
    private final CustomerService customerService;
    private final Input input;

    public App(Input input, ProductService productService, CustomerService customerService) {
        this.productService = productService;
        this.input = input;
        this.customerService = customerService;
    }

    public void run() {
        System.out.println("------ Магазин электроники ------");
        System.out.println("---------------------------------");
        boolean repeat = true;
        do {
            System.out.println("Список задач: ");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить товар");
            System.out.println("2. Список товаров");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список покупателей");
            System.out.print("Введите номер задачи: ");
            int task = Integer.parseInt(input.getString());
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("----- Добавление товара -----");
                    productService.add(input);
                    break;
                case 2:
                    System.out.println("----- Список товаров -----");
                    System.out.println(productService.printListProducts());
                    break;
                case 3:
                    System.out.println("----- Добавление покупателя -----");
                    if (customerService.add(input)) {
                        System.out.println("Покупатель добавлен");
                    } else {
                        System.out.println("Не удалось добавить покупателя");
                    }
                    break;
                case 4:
                    System.out.println("----- Список покупателей -----");
                    System.out.println(customerService.printListCustomers());
                    break;
                default:
                    System.out.println("Выберите задачу из списка!");
            }
            System.out.println("---------------------------------");
        } while (repeat);
        System.out.println("До свидания :)");
    }
}
