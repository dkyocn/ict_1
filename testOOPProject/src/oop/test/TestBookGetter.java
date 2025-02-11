package oop.test;

import oop.encapsulation.Book;

public class TestBookGetter {

	public static void main(String[] args) {

		Book book = new Book("아기돼지삼형제", "미상", "이솝우화", 120000, 0.5);
		Book book1 = new Book("개미", "베르나르베르베르", "미상", 80000, 0.14);
		Book book2 = new Book("삼국지", "미상", "삼국지컴퍼니", 240000, 0.35);

		book.printBook();
		book1.printBook();
		book2.printBook();

		// 각 도서의 가격에 대해 할인률 이 적용된 구매가격 출력
		int bookPrice = book.getPrice() - (int)(book.getDiscount() * book.getPrice());
		int bookPrice1 = book1.getPrice() - (int)(book1.getDiscount() * book1.getPrice());
		int bookPrice2 = book2.getPrice() - (int)(book2.getDiscount() * book2.getPrice());

		System.out.println(book.getTitle() + "의 가격: " + bookPrice);
		System.out.println(book1.getTitle() + "의 가격: " + bookPrice1);
		System.out.println(book2.getTitle() + "의 가격: " + bookPrice2);

		// 총 구매가격 합산 출력
		System.out.println("책 세권의 총 가격: " + (bookPrice + bookPrice1 + bookPrice2));
	}

}
