import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartItems = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        if (product.getProductStockQuantity() >= quantity) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
        } else {
            System.out.println("There are not enough stock to add " + product.getProductName() + " to the cart");
        }
    }

    public void displayCart() {
        System.out.println("Products: :");
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey().getProductName() + " - Amount: " + entry.getValue());
        }
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            total += entry.getKey().getProductPrice() * entry.getValue();
        }
        return total;
    }
}

