//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductProcess process = new ProductProcess();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Product List---");
        List<Product> products = process.getAllProducts();
        for (Product product : products) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("\nEnter the product ID to add to the cart (0 to exit): ");
            int productId = scanner.nextInt();
            if (productId == 0) {
                break;
            }
            System.out.print("How many would you like to add? ");
            int quantity = scanner.nextInt();


            for (Product product : products) {
                if (product.getProductID()== productId) {
                    cart.addProduct(product, quantity);
                }
            }
        }

        cart.displayCart();
        System.out.println("Total Price: " + cart.calculateTotalPrice() + " TL");



    }
}