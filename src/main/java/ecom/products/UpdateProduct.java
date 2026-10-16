package ecom.products;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateProduct {

	Products Products = new Products();
	public void updateProducts() throws ClassNotFoundException, SQLException {
		Connection connection = Products.getConnection();
		Statement statement = connection.createStatement();
		int update = statement.executeUpdate("delete from products where id = 102");
		int update1 = statement.executeUpdate("insert into products (id,name,price,brand) values(102,'watch',1500,'rolex')");

//		int update = statement.executeUpdate("update products set brand = case "+
//		"when id = 106 then 'denim'"+"when id = 107 then 'skybags'"+
//		"when id = 108 then 'asus'"+"when id = 109 then 'samsung'"+"when id = 110 then 'lenscart'"
//		+"end "+"where id in (106,107,108,109,110)");
		System.out.println("total update : "+update);
		System.out.println(update1);
	
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