package bootcamp.polimorphisim;

public class HotChocolate extends Chocolate {
	
	private static final int VOLUM = 200;
	private static final int TEMPERATURE = 80;
	private static final float PRICE = 15;
	private static final int SPOONSUGAR = 3;
	private static final String BASE = "milk";

	VendingMachine milkOrWater;

	public HotChocolate() {
		super(VOLUM, TEMPERATURE, PRICE, SPOONSUGAR);
	}

	public void produce() {
			
			if(milkOrWater.milkQtt <VOLUM)
				System.out.println("The drink can not be prepared Espresso because there is not enough milk");
			else{
				System.out.println("bbrrrrrr");
				System.out.println(this.toString()); 
				milkOrWater.milkQtt -= VOLUM;
				}
		}

	@Override
	public String toString() {
		return "The HotChocola drink contain the "+super.toString();
	}
}
