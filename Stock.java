package HW7;

public class Stock {
	private String ISBN;
	private int locationId;
	private int quantity;
	
	public Stock(int bookId, int locationId, int quantity) {
		super();
		this.ISBN = ISBN;
		this.locationId = locationId;
		this.quantity = quantity;
	}
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
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
