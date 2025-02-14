package com.practice1.model.vo;

public class Book {

	private String title;
	private String author;
	private int price;

	public Book() {
		super();
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "title: " + title + ", author: " + author + ", price: " + price;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		Book book = (Book)obj;

		if (this.title.equals(book.title) && price == book.price && this.author.equals(book.author)) {
			result = true;
		}

		return result;
	}

	@Override
	public Object clone() {
		return new Book(this.title, this.author, this.price);
	}

}
