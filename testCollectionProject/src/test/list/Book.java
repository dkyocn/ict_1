package test.list;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 5442277699832135155L;

	private String title; // 도서 제목
	private int price; // 도서 가격

	public Book() {
		super();
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	@Override
	public Object clone() {
		// Shallow copy
		//		return this; // this가 받은 주소를 리턴

		// Deep copy : 새 객체를 new 하고, this가 참조하고 있는 객체의 필드값을 복사함
		return new Book(this.title, this.price);

	}
}
