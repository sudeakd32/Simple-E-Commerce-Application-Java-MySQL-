public class Product {
    private int productID;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productStockQuantity;

    public Product(int productID, String productName, String productDescription, double productPrice, int productStockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productStockQuantity = productStockQuantity;
    }

    public int getProductID() {
        return productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductStockQuantity() {
        return productStockQuantity;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return  "productID = " + productID + "\n" +
                ", productName = " + productName + "\n" +
                ", productDescription = " + productDescription + "\n" +
                ", productPrice = " + productPrice + "\n" +
                ", productStockQuantity = " + productStockQuantity;
    }


}
