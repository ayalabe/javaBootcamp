package bootcamp.polimorphisim;

/**
 * 
 * @author Student
 *
 */
public abstract class Drink implements Produceable {
	private int volume;
	public int temperatture;
	private float price;
	
	/**
	 * Contractor is get 3 parameters:
	 * @param volume The amount the glass contains
	 * @param temperatture of the milk and water
	 * @param price of the glass
	 */
	public Drink(int volume, int temperatture, float price) {
		this.volume = volume;
		this.temperatture = temperatture;
		setPrice(price);
	}
	
	public int getVolume() {
		return volume;
	}
	
	void setVolume(int volume) {
		if(volume >= 50 && volume <= 200)
			this.volume = volume;
		
	}
	
	public int getTemperatture() {
		return temperatture;
	}
	abstract void setTemperatture(int temperatture);
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "volume is "+this.getVolume()+" ,temperatture is "+this.getTemperatture()+" ,price is "+this.getPrice();
	}

	
}
