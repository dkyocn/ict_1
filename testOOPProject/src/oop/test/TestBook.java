package oop.test;

import oop.encapsulation.Book;

public class TestBook {

	public static void main(String[] args) {

		Book book = new Book();
		Book book2 = new Book("호두까기 인형", "차이코프스키");
		Book book3 = new Book("아기돼지삼형제", "미상", "이솝우화", 120000, 0.5);

		book.printBook();
		book2.printBook();
		book3.printBook();
	}

}
