package HW7;

import java.time.LocalDate;

public class Mainbook {
	public static void main(String[] args) {
		Book book1 = new Book("meomeo", "RS123", "linh");
		Book book2 = new Book("haha", "RS124", "peter");
		
		Stock stockBook1 = new Stock(1, 1, 5);
		Stock stockBook2 = new Stock(2, 2, 4);
		
		Book[] books = {book1, book2};
		Stock[] stocks = {stockBook1, stockBook2};
		
		BookHistory BookHistory1 = new BookHistory(book1.getISBN(),LocalDate.parse("2022-05-07"), LocalDate.parse("2021-05-15"),LocalDate.parse("2021-05-16"),1 );
		BookHistory BookHistory2 = new BookHistory(book2.getISBN(),LocalDate.parse("2022-10-20"), LocalDate.parse("2022-10-27"),LocalDate.parse("2022-05-21"),2 );
		BookHistory[] BookHistorys = {BookHistory1, BookHistory2};
		
		getBookStatus(BookHistorys);
	}
	public static void getBookStatus(BookHistory[] BookHistorys) {
		for (BookHistory BookHistory: BookHistorys) {
			if ((BookHistory.getReturnDate()).compareTo(BookHistory.getMustReturnDate()) <0) {
				System.out.println("ISBN: " + BookHistory.getISBN() + " Customer ID: " + BookHistory.getcustomerId() + " Status: Returned");
			}else if ((BookHistory.getReturnDate()).compareTo(BookHistory.getMustReturnDate()) >0){
				System.out.println("ISBN: " + BookHistory.getISBN() + " Customer ID: " + BookHistory.getcustomerId() + " Status: Returned Late");
			}else if (BookHistory.getReturnDate() == null && LocalDate.now().compareTo(BookHistory.getMustReturnDate()) >0) {
				System.out.println("ISBN: " + BookHistory.getISBN() + " Customer ID: " + BookHistory.getcustomerId() + " Status: Overdue");
			}else {
				System.out.println("ISBN: " + BookHistory.getISBN() + " Customer ID: " + BookHistory.getcustomerId() + " Status: Borrowed");
			}
		}
	}	
	}
		
	
	