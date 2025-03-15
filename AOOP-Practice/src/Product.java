abstract class Product {
    public String productName;
    public double price;
    public String productId;

    public Product(String productName, double price, String productId) {
        this.productName = productName;
        this.price = price;
        this.productId = productId;
    }

    public double applyDiscount(double discount) {
        return price - ((price * discount)/100);
    }
    abstract void displayProductDetails();
}

class Electronics extends Product {
    public int warrantyPeriod;

    public Electronics(String productName, double price, String productId, int warrantyPeriod) {
        super(productName, price, productId);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Warranty Period: " + warrantyPeriod);
    }

}

class Clothing extends Product {
    public String size;


    public Clothing(String productName, double price, String productId, String size) {
        super(productName, price, productId);
        this.size = size;

    }

    @Override
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);

    }
}
class ShoppingCart {
    void checkout(Product product, double discountPercentage) {
        double finalPrice = product.applyDiscount(discountPercentage); // Store the discounted price
        System.out.println("Product Name: " + product.productName);
        System.out.println("Product ID: " + product.productId);
        System.out.println("Final Price after " + discountPercentage + "% discount: " + finalPrice);
    }
}


class Test1{
    public static void main(String[] args) {
        Electronics electronics = new Electronics("Laptop", 50000, "E101", 2);
        Clothing clothing = new Clothing("Shirt", 1000, "C101", "M");
        ShoppingCart shoppingCardt = new ShoppingCart();
        shoppingCardt.checkout(electronics, 10);
        shoppingCardt.checkout(clothing, 20);
    }
}