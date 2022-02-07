import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static Connection con=null;
	public static Connection getMyConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_details","root","shay/12Sqlrgk");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}


