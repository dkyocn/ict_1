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

	/**
	 * 리스트에 객체 추가
	 * @param book 추가하려는 객체
	 */
	public void addBook(Book book) {
		bookList.add(book);
	}

	/**
	 * 리스트에 객체 제거
	 * @param index 제거하는 객체 index
	 */
	public void deleteBook(int index) {
		bookList.remove(index);
	}

	/**
	 * 도서명으로 객체 찾기
	 * @param bTitle 찾을 도서명
	 * @return 객체 index
	 */
	public int searchBook(String bTitle) {

		int result = 0;

		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(bTitle)) {
				result = i;
				break;
			}
		}

		return result;
	}

	/**
	 * index 위치의 객체 정보 출력
	 * @param index
	 */
	public void printBook(int index) {
		System.out.println(bookList.get(index));

	}

	/**
	 * 목록 정보 출력
	 */
	public void displayAll() {
		for (Book book : this.bookList) {
			System.out.println(book);
		}
	}

	/**
	 * 
	 */
	public Book[] sortedBookList() {
		bookList.sort(new AscCategory());
		return (Book[])bookList.toArray();
	}

	/**
	 * 
	 * @param br
	 */
	public void printBookList(Book[] br) {
		for (Book book : br) {
			System.out.println(br.toString());
		}
	}
}
