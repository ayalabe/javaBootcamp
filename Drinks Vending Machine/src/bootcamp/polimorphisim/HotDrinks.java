package bootcamp.polimorphisim;

public abstract class HotDrinks extends Drink {
	
	private int spoonsSugar;

	public HotDrinks(int volume, int temperatture, float price, int spoonsSugar) {
		super(volume, temperatture, price);
		setSpoonsSugar(spoonsSugar);
	}

	public int getSpoonsSugar() {
		return spoonsSugar;
	}

	public void setSpoonsSugar(int spoonsSugar) {
		this.spoonsSugar = spoonsSugar;
	}
	
	@Override
	public String toString() {
		return super.toString()+" and spoons sugar is "+this.spoonsSugar;
	}

	@Override
	public void setTemperatture(int temperatture) {
			if(temperatture >= 60 && temperatture <= 90)
				this.temperatture = temperatture;
	}
	

}
