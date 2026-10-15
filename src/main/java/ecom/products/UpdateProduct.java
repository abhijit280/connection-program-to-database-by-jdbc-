package ecom.products;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateProduct {

	Products Products = new Products();
	public void updateProducts() throws ClassNotFoundException, SQLException {
		Connection connection = Products.getConnection();
		Statement statement = connection.createStatement();
		int update = statement.executeUpdate("update products set brand = case "+
		"when id = 106 then 'denim'"+"when id = 107 then 'skybags'"+
		"when id = 108 then 'asus'"+"when id = 109 then 'samsung'"+"when id = 110 then 'lenscart'"
		+"end "+"where id in (106,107,108,109,110)");
		System.out.println("total update : "+update);
	}
}
