public class Product {
    private String name;
    private String brand;
    private int price;

    // Private constructor - can only be called by the Builder
    public Product(Builder builder) {
        this.name = builder.name;
        this.brand = builder.brand;
        this.price = builder.price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}
