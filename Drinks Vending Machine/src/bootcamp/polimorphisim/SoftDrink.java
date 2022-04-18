package bootcamp.polimorphisim;

enum Squeezed{
	MACHINE,
	PASTEURIZED
}


public abstract class SoftDrink extends ColdDrinks {
	
	private Squeezed squeezed;
	
	public SoftDrink(int volume, int temperatture, float price, MaineIngredient maineIngredient, Purchased purchased, Squeezed squeezed) {
		super(volume, temperatture, price, maineIngredient);
		this.squeezed = squeezed;
	}
	
	@Override
	public String toString() {
		return super.toString()+" the Squeezed is "+this.squeezed;
	}

}
