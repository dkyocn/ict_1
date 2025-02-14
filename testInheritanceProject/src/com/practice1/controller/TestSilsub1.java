package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {

		Book book = new Book("아기돼지 삼형제", "이솝우화", 15000);
		Book book1 = new Book("토이스토리", "디즈니", 23000);

		System.out.println(book.toString());
		System.out.println(book1.toString());

		System.out.println(book.equals(book1));

		Book book2 = (Book)book.clone();

		System.out.println(book == book2);
		System.out.println(book.equals(book2));
	}

}
