package ecom.products;

import java.sql.SQLException;

public class Driver1 {

	public static void main(String[] args) {
		ProductsDBO dbo = new ProductsDBO();
		try {
			dbo.getProductById(105);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
