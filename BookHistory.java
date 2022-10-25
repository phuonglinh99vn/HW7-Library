package HW7;

import java.time.LocalDate;

public class BookHistory {
	private String ISBN;
	private LocalDate BorrowDate;
	private LocalDate MustReturnDate;
	private LocalDate ReturnDate;
	private int customerId;
	
	
	public BookHistory(String iSBN, LocalDate borrowDate, LocalDate mustReturnDate, LocalDate returnDate,
			int customerId) {
		super();
		this.ISBN = iSBN;
		this.BorrowDate = borrowDate;
		this.MustReturnDate = mustReturnDate;
		this.ReturnDate = returnDate;
		this.customerId = customerId;
	}

	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String getISBN) {
		this.ISBN = ISBN;
	}

	public LocalDate getBorrowDate() {
		return BorrowDate;
	}

	public void setBorrowDate(LocalDate BorrowDate) {
		this.BorrowDate = BorrowDate;
	}
	
	public LocalDate getMustReturnDate() {
		return MustReturnDate;
	}

	public void setMustReturnDate(LocalDate MustReturnDate) {
		this.MustReturnDate = MustReturnDate;
	}
	
	public LocalDate getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(LocalDate ReturnDate) {
		this.ReturnDate = ReturnDate;
	}
	
	public int getcustomerId() {
		return customerId;
	}

	public void setcustomerId(int customerId) {
		this.customerId = customerId;	
	}
}
