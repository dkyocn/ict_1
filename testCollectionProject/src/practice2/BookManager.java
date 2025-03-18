package practice2;

import java.util.ArrayList;

public class BookManager {

	private ArrayList<Book> bookList;

	public BookManager() {
		super();
	}

	public BookManager(ArrayList<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	public void deleteBook(int index) {
		bookList.remove(index);
	}

	//	public int searchBook(String bTitle) {
	//		bookList.stream().forEach(b -> b.getTitle().equals(bTitle));
	//	}
}
