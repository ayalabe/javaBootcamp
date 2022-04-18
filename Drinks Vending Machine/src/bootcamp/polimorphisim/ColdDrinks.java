package bootcamp.polimorphisim;

enum MaineIngredient{
	ORANGE,
	COCAlEAVES,
	LIMONLIM,
	APPLE
}

public abstract class ColdDrinks extends Drink {
	
	private MaineIngredient maineIngredient;
	
	public ColdDrinks(int volume, int temperatture, float price, MaineIngredient maineIngredient) {
		super(volume, temperatture, price);
		this.maineIngredient = maineIngredient;
	}

	


	@Override
	public void setTemperatture(int temperatture) {
			if(temperatture >= 2 && temperatture <= 5)
				this.temperatture = temperatture;
	}
	
	@Override
	public String toString() {
		return super.toString()+" the maine ingredient is "+this.maineIngredient;
	}

	

}
