package ecom.products;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductsDBO {

	public List<products1> getAllProducts() throws ClassNotFoundException, SQLException{
		List<products1 >products1 = new ArrayList<products1>();
		Products products = new Products();
		Connection connection = products.getConnection();
		Statement statement = connection.createStatement();
		String query = "select * from products";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name =  resultSet.getString("name");
			int price = resultSet.getInt("price");
			String brand = resultSet.getString("brand");
			
			products1.add(new products1(id, name, price, brand));
		}
		
		return products1;
	}
	public void getProductById(int id) throws ClassNotFoundException, SQLException{
		List<products1> prd =  getAllProducts();
		for (products1 products1 : prd) {
			if (products1.getId()==id) {
				System.out.println(products1);
			}
		}
		
	}
}
