import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception  {
        String url = "jdbc:mysql://localhost:3306/elearning";
        String username = "root";
        String password = "noekasep@ok!!";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            if (conn.isValid(5)) {
                readData(conn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readData(Connection conn) throws SQLException {
        String query = "SELECT * FROM products";
        try (Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("+------------------+------------+----------------+");
            System.out.println("| Name             | SKU        | Price  ");
            System.out.println("+------------------+------------+----------------+");
            
            while (rs.next()) {
                String name = rs.getString("name");
                String sku = rs.getString("sku");
                String price = rs.getString("price");
                
                System.out.printf("| %-16s | %-10s | %-6s \n", 
                    name, sku, price);
            }
            
            System.out.println("+------------------+------------+----------------+");
        }
    }
}
