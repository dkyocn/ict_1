package oop.test;

import java.util.Scanner;

import oop.encapsulation.Book;

public class TestBookSet {

	public static void main(String[] args) {
		// Book 클래스 setter 테스트
		// 키보드로 입력받은 값으로 객체 필드 값 변경하고 인스턴스 변수
		Scanner scanner = new Scanner(System.in);
		Book book = new Book();

		System.out.printf("책 제목: ");
		book.setTitle(scanner.nextLine());
		System.out.printf("책 저자: ");
		book.setAuthor(scanner.next());
		System.out.printf("책 출판사: ");
		book.setPublisher(scanner.next());
		System.out.printf("책 가격: ");
		book.setPrice(scanner.nextInt());
		System.out.printf("책 할인율: ");
		book.setDiscount(scanner.nextDouble());

		book.printBook();
	}

}
