package abstract_Factory_Design_Pattern;

public class Mango implements FruitClass {

	private double price;
	private String type;
	
	
	
	public Mango(double price, String type) {
		super();
		this.price = price;
		this.type = type;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
