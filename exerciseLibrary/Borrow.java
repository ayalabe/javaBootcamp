package bootcamp.exerciseLibrary;

import java.util.Random;

public class Borrow extends Book implements Borrowable{
	
	private int borrowingPeriod;

	public Borrow(Genre genre, String title, int quantity, Author author, int borrowingPeriod) {
		super(genre, title, quantity, author);
		this.borrowingPeriod = borrowingPeriod;
	}


	@Override
	void approach() {
		Random rand = new Random();
		int randInt = rand.nextInt(3);
		switch(randInt) {
			case 0:
				this.borrowing();
				break;
			case 1:
				this.returnedBook();
				break;
			case 2:
				this.read();
				break;
			default:
				System.out.println("Err");
		}
	}

	@Override
	public void borrowing() {
		if(this.getQuantity()>0) {
			this.setQuantity(-1);
			System.out.println("Im borrowing: "+this.getTitle()+" for: "+this.borrowingPeriod+" days");
		}
		else
			System.out.println("dont posibale to borrowing the: "+this.getTitle());
		
	}

	@Override
	public void returnedBook() {
		this.setQuantity(1);
		System.out.println("Return the book is: "+this.getTitle());
		
	}


	@Override
	public void read() {
		if(this.getQuantity()>0) {
			this.setQuantity(-1);
			System.out.println("Iam read book in genre: "+this.getGenre()+" and title is: "+this.getTitle());
		}
		
	}

}
