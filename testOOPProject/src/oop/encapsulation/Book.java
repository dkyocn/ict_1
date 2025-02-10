package oop.encapsulation;

// 도서 정보 저장용 클래스 : vo, do, entity, dto, bean
public class Book {

	// Field
	// 힙(heap)에 할당되는 객체(instance) 안에 만들어질 변수들 : 인스턴스 변수
	private String title; // 제목
	private String author; // 저자명
	private String publisher; // 출판사
	private int price; // 가격
	private double discount; // 할인율

	// static field : static 메모리에 따로 할당시키는 변수
	private static int bookCount; // 도서 개수 카운트 용
	
	//
	public Book() {
		
	}
	public Book(String title, String author, String publisher, int price, double discount) {
		
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.discount = discount;
	}
	
}
