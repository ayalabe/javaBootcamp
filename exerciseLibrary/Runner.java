package bootcamp.exerciseLibrary;

public class Runner {

	public static void main(String[] args) {
		
		Genre genre = Genre.COOKING;
		
		Author author1 = new Author("Ayala", 'f');
		Author author2 = new Author("Eli", 'm');
		
		Book book1 = new ReadableBook(genre, "my cook", 5, author1);
		book1.approach();
		
		Book book2 = new Borrow(Genre.DICTIONARIES, "english", 3, author2, 15);
		book2.approach();
		
		Book book4 = new Borrow(Genre.DICTIONARIES, "spanyol", 3, author2, 15);
		book4.approach();
		
		Book book3 = new BorrowByBook(Genre.NOVELS, "novell", 2, author2, 15, 100);
		book3.approach();
		
		Book book5 = new BorrowByBook(Genre.NOVELS, "prass", 2, author2, 15, 100);
		book5.approach();
		
		Book book6 = new BorrowByBook(Genre.NOVELS, "expriec", 2, author2, 15, 100);
		book6.approach();
		
		Book[] bookis = {book1,book2,book3,book4,book5,book6};
		
		
		for (int i = 0; i < 10; i++) {
			for (Book book : bookis) {
				book.approach();
			}
		}

	}

}
