package bootcamp.exerciseLibrary;

enum Genre {
	COOKING,
	NOVELS,
	DICTIONARIES;
}

public abstract class Book implements readable {

	private Genre genre;
	private String title;
	private int quantity;
	private Author author;
	
	public Book(Genre genre, String title, int quantity, Author author) {
		this.setGenre(genre);
		this.setTitle(title);
		this.setQuantity(quantity);
		this.setAuthor(author);
	}
	
	
	abstract void approach();


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity += quantity;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
