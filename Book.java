package HW7;

public class Book {
	private String Bookname;
	private String ISBN;
	private String author;
	
	
	public Book( String bookname, String iSBN, String author) {
		super();
		
		this.Bookname = bookname;
		this.ISBN = iSBN;
		this.author = author;
	}
	
		
	public String getBookname() {
		return Bookname;
	}
	
	public String getISBN() {
		return ISBN;
	}
		
	public String getauthor() {
		return author;
	}
		
	
}
