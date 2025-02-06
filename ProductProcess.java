import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductProcess {
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        Connection conn = null;
        DBConnection helper = new DBConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            conn = helper.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM products");
            while(resultSet.next()){
                products.add(new Product(
                        resultSet.getInt("productID"),
                        resultSet.getString("productName"),
                        resultSet.getString("productDescription"),
                        resultSet.getDouble("productPrice"),
                        resultSet.getInt("productStockQuantity")));
            }
            System.out.println("Connected to database");
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return products;
    }

}
