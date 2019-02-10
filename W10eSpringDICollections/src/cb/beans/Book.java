package cb.beans;

public class Book {
	
	private String isbn;
	private String book_name;
	private int price;
	private String publication;
	

	public Book() {}


	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}


	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}


	@Override
	public String toString() {
		return "Book [isbn = " + isbn + ", book_name = " + book_name + ", price = " + price + ", publication = " + publication
				+ "]";
	}
	
}
