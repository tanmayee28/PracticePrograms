package abstract_Factory_Design_Pattern;

public class PineappleFactory extends AbstractFruitFactory{

	double price;
	String type;
	
	public PineappleFactory(double price, String type) {
		super();
		this.price = price;
		this.type = type;
	}

	@Override
	FruitClass createFruit() {
		// TODO Auto-generated method stub
		return new Pineapple(price,type);
	}

}
