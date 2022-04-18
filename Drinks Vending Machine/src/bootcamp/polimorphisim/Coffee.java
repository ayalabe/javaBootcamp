package bootcamp.polimorphisim;

public abstract class Coffee extends HotDrinks{
	

	private int NumOfShot;
	
	public Coffee(int volume, int temperatture, float price, int spoonsSugar, int NumOfShot) {
		super(volume, temperatture, price, spoonsSugar);
		setNumOfShot(NumOfShot);
	}

	public int getNumOfShot() {
		return NumOfShot;
	}

	public void setNumOfShot(int numOfShot) {
		NumOfShot = numOfShot;
	}

	
	@Override
	public String toString() {
		return super.toString()+" num of shot is "+this.getNumOfShot();
	}

	

	


}
