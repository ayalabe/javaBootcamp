package bootcamp.polimorphisim;

public class Cola extends SodaDrink {
	
	private static final MaineIngredient MAININGREDIENT = MaineIngredient.COCAlEAVES;
	private static final int VOLUM = 200;
	private static final int TEMPERATURE = 3;
	private static final float PRICE = 9;
	private static final Purchased PURCHASED = Purchased.CAN;

	
	public Cola() {
		super(VOLUM, TEMPERATURE, PRICE, MAININGREDIENT, PURCHASED);
	}
	
	public void produce() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "The drink Cola is readi and contain "+super.toString();
	}

	
}
