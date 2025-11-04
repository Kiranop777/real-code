public class Builder {
    String name;
    String brand;
    int price;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Builder setPrice(int price) {
        this.price = price;
        return this;
    }

    // This builds the final Product object
    public Product build() {
        return new Product(this);
    }
}
