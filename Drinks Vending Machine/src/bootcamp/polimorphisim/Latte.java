package bootcamp.polimorphisim;

public class Latte extends Coffee {
	
	private static final int VOLUM = 200;
	private static final int TEMPERATURE = 80;
	private static final float PRICE = 12;
	private static final int SPOONSUGAR = 2;
	private static final int NUMOFSHOT = 1;
	

	VendingMachine milkOrWater;
	
	public Latte() {
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
		return "The Latte drink contain the "+super.toString();
	}


}
