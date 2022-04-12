package bootcamp.exerciseLibrary;

public class ReadableBook extends Book {
	
	public ReadableBook(Genre genre, String title, int quantity, Author author) {
		super(genre, title, quantity, author);
	}

	@Override
	public void read() {
		if(this.getQuantity()>0) {
			this.setQuantity(-1);
			System.out.println("Iam read book in genre: "+this.getGenre()+" and title is: "+this.getTitle());
		}
	}
	
	@Override
	public void approach() {
		this.read();
	}

}
