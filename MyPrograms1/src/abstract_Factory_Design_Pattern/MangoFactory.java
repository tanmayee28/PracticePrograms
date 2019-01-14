package abstract_Factory_Design_Pattern;

import java.io.File;

public class MangoFactory extends AbstractFruitFactory {

	double price;
	String type;
	
	
	public MangoFactory(double price, String type) {
		super();
		this.price = price;
		this.type = type;
	}

	@Override
	FruitClass createFruit() {
		// TODO Auto-generated method stub
		return new Mango(price, type);
	}
	

}
