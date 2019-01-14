package abstract_Factory_Design_Pattern;

public class Pineapple implements FruitClass {

	private double price;
	private String type;
	
	
	public Pineapple(double price, String type) {
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
