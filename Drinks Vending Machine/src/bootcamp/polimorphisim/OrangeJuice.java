package bootcamp.polimorphisim;

public class OrangeJuice extends SoftDrink {

	private static final MaineIngredient MAINE = MaineIngredient.ORANGE;
	private static final int VOLUM = 200;
	private static final int TEMPERATURE = 5;
	private static final float PRICE = 9;
	private static final Purchased PURCHASED = Purchased.CAN;
	private static final Squeezed SQUEEZED = Squeezed.MACHINE;

	
	public OrangeJuice() {
		super(VOLUM, TEMPERATURE, PRICE, MAINE, PURCHASED,SQUEEZED);
	}
	
	public void produce() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "The drink Cola is readi and contain "+super.toString();
	}
}
