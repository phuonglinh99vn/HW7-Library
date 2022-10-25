package HW7;

public class Stock {
	private int bookId;
	private int locationId;
	private int quantity;
	
	public Stock(int bookId, int locationId, int quantity) {
		super();
		this.bookId = bookId;
		this.locationId = locationId;
		this.quantity = quantity;
	}
	
	public int getbookId() {
		return bookId;
	}

	public void setbookId(int bookId) {
		this.bookId = bookId;
	}

	public int getlocationId() {
		return locationId;
	}

	public void setlocationId(int locationId) {
		this.locationId = locationId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
