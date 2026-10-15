package ecom.products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Products {
	public Connection getConnection() throws ClassNotFoundException, SQLException {

	    // Register JDBC driver
	    Class.forName("com.mysql.cj.jdbc.Driver");

	    // Create and return connection
	    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/ecomerce", "root",
				"Abhijit@7992");

	    return connection;
	}

	public void getProducts() throws ClassNotFoundException, SQLException {
//	//	register first
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		//create connection
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/ecomerce", "root",
//				"Abhijit@7992");
	// set statement
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		// write query
		ResultSet rs =  statement.executeQuery("select  * from products");
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int price = rs.getInt(3);
			String brand = rs.getString(4);
			
			System.out.println("----------------------");
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);
			System.out.println("Price: " + price);
			System.out.println("Brand: " + brand);
			System.out.println("----------------------");
					
		}
	}
}
