package bootcamp.polimorphisim;

public class Espresso extends Coffee {
	
	private static final int VOLUM = 200;
	private static final int TEMPERATURE = 80;
	private static final float PRICE = 10;
	private static final int SPOONSUGAR = 2;
	private static final int NUMOFSHOT = 2;
	

	VendingMachine milkOrWater;
	
	public Espresso() {
		super(VOLUM, TEMPERATURE, PRICE, SPOONSUGAR,NUMOFSHOT);
		
	}

	public void produce() {
		
		if(milkOrWater.milkQtt <VOLUM - getNumOfShot()*50)
			System.out.println("The drink can not be prepared Espresso because there is not enough milk");
		else{
			System.out.println("bbrrrrrr");
			System.out.println(this.toString()); 
			milkOrWater.milkQtt -= VOLUM - getNumOfShot()*50;
			}
	}

	@Override
	public String toString() {
		return "The Espresso drink contain the "+super.toString();
	}

	
	
	
}
