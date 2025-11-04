public class man {
    public static void main(String[] args) {
        // Step 1: Use Builder to set values
        Builder builder = new Builder();
        builder.setName("Laptop");
        builder.setBrand("Dell");
        builder.setPrice(45000);

        // Step 2: Build the Product
        Product product = builder.build();

        // Step 3: Use the Product
        System.out.println("Product created successfully!");
        System.out.println("Name: " + product.getName());
        System.out.println("Brand: " + product.getBrand());
        System.out.println("Price: " + product.getPrice());
    }
}
