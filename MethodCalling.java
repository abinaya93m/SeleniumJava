package week1day3;

public class MethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //MethodCalling methodCalling = new MethodCalling();
        //String bookTitle = methodCalling.addBook("Harry Potter");
        //System.out.println(bookTitle);
        //methodCalling.issueBook();
		
		BookClass bookClass = new BookClass();
		
		String bookTitle = bookClass.addBook("Harry Potter");
		System.out.println(bookTitle);
		
		bookClass.issueBook();
	}
	
	private String addBook(String bookTitle) {
		System.out.println("Book Added Successfully");
		return bookTitle;
	}
	
	private void issueBook() {
		System.out.println("Book Issued Successfully");
	}
}
