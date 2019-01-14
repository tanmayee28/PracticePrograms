package abstract_Factory_Design_Pattern;

public class FruitFactory {
	public static FruitClass getFruit(AbstractFruitFactory ab)
	{
		return ab.createFruit();
		
	}

}
