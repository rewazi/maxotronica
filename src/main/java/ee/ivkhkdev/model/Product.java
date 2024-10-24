package ee.ivkhkdev.model;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private String brand;
    private double price;

    public Product() {
        this.id = UUID.randomUUID();
    }

    public Product(String name, String brand, double price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
