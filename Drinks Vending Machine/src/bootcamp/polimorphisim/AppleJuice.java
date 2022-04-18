package bootcamp.polimorphisim;

public class AppleJuice extends SoftDrink {

	private static final MaineIngredient MAINE = MaineIngredient.APPLE;
	private static final int VOLUM = 200;
	private static final int TEMPERATURE = 5;
	private static final float PRICE = 9;
	private static final Purchased PURCHASED = Purchased.BOTTLE;
	private static final Squeezed SQUEEZED = Squeezed.PASTEURIZED;

	
	public AppleJuice() {
		super(VOLUM, TEMPERATURE, PRICE, MAINE, PURCHASED,SQUEEZED);
	}
	
	public void produce() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "The drink Apple Juice is readi and contain "+super.toString();
	}

}
