
class Product {
    private String productName;
    private double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    String getProductName() {
        return productName;
    }

    double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 55000);
        System.out.println(p.getProductName() + " " + p.getPrice());
    }
}