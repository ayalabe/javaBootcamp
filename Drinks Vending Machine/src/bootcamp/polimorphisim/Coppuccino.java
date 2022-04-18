package bootcamp.polimorphisim;

public class Coppuccino extends Coffee {
	private static final int VOLUM = 200;
	private static final int TEMPERATURE = 80;
	private static final float PRICE = 15;
	private static final int SPOONSUGAR = 3;
	private static final int NUMOFSHOT = 2;
	
	VendingMachine milkOrWater;

	public Coppuccino() {
		super(VOLUM, TEMPERATURE, PRICE, SPOONSUGAR, NUMOFSHOT);
		// TODO Auto-generated constructor stub
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
		return "The Coppuccino drink contain the "+super.toString();
	}
}
