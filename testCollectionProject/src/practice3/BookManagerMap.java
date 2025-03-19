package practice3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import practice2.Book;

public class BookManagerMap {

	private HashMap<String, Book> booksMap = new HashMap<String, Book>();

	public BookManagerMap() {
		super();
	}

	public BookManagerMap(HashMap booksMap) {
		super();
		this.booksMap = booksMap;
	}

	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}

	public void removeBook(String key) {
		booksMap.remove(key);
	}

	public String searchBook(String bTitle) {
		Iterator iterator = booksMap.entrySet().iterator();
		String result = null;

		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry)iterator.next();

			Book book = (Book)entry.getValue();

			if (book.getTitle().equals(bTitle)) {
				result = book.getbNo();
				break;
			}
		}

		return result;
	}

	public void displayAll() {
		Iterator iterator = booksMap.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(booksMap.get(iterator.next()));
		}
	}

	public Book[] sortedBookMap() {
		// 해당 도서명순으로 오름차순정렬해서 객체배열 리턴함
		List booksList = new ArrayList(booksMap.values());
		booksList.sort(new AscBookTitle());

		Book[] bar = new Book[booksList.size()];
		booksList.toArray(bar);

		return bar;
	}

	public void printBookMap(Book[] br) {
		for (Book book : br) {
			System.out.println(book);
		}
	}

	public void printBook(String key) {
		System.out.println(booksMap.get(key));
	}

}
