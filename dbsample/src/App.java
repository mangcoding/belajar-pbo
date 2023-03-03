import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    //Inisialisasi konstanta yang diperlukan untuk mengelola database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/java_db"; 
    static final String USER = "root";
    static final String PASS = "noekasep@ok!!";
    
    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        /* Connect to mysql databases */
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            // Menampilkan data dari tabel products
            rs = stmt.executeQuery("SELECT * FROM products");
            while (rs.next()) {
                System.out.println(
                    rs.getString("id")+" | "+
                    rs.getString("product_code")+" | "+
                    rs.getString("product_name") + " | " + 
                    rs.getString("product_price")
                );
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
