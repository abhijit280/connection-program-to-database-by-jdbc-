package ecom.products;

import java.sql.SQLException;

public class driver {

	public static void main(String[] args) {
		Products products = new Products();
		UpdateProduct updateProduct =  new UpdateProduct();
		try {
			// products.getProducts();
			updateProduct.updateProducts();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
