package bootcamp.exerciseLibrary;

import java.util.Random;

public class BorrowByBook extends Borrow implements Purchasing {
	
	private int price;

	public BorrowByBook(Genre genre, String title, int quantity, Author author, int borrowingPeriod,int price) {
		super(genre, title, quantity, author, price);
		this.setPrice(price);
	}
	
	@Override
	void approach() {
		Random rand = new Random();
		int randInt = rand.nextInt(4);
		switch(randInt) {
			case 0:
				super.borrowing();
				break;
			case 1:
				super.returnedBook();
				break;
			case 2:
				super.read();
				break;
			case 3:
				this.purchasing();
				break;
			default:
				System.out.println("Err");
		}
	}

	@Override
	public void purchasing() {
		if(this.getQuantity()>0) {
			this.setQuantity(-1);
			System.out.println("The book purchased: "+this.getTitle()+" price is: "+this.price);
		}
		else
			System.out.println("The book cannot be purchased: "+this.getTitle());
		
	}

	private void setPrice(int price) {
		this.price = price;
	}

}
