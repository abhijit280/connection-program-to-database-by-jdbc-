package ecom.products;

public class products1 {

	private int id;
	private String name;
	private int price;
	private String brand;
	public products1(int id, String name, int price, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	@Override
	public String toString() {
		return "products1 [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
	
}
