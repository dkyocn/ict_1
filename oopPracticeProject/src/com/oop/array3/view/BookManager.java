package com.oop.array3.view;

import java.util.Scanner;

import com.oop.array3.model.Book;

public class BookManager {

	private Book[] bar;

	Scanner sc;

	private static int count;

	// 생성자 생성보다 먼저 실행됨
	// 초기화 블럭 작성
	{
		bar = new Book[10];
		new Scanner(System.in);
	}

	// static 필드 초기화 블럭
	static {
		count = 0;
	}

	public void menu() {

		boolean loop = true;

		do {
			System.out.println("***** 도서 관리 메뉴 *****\n"
				+ "\n"
				+ "1. 도서 정보 추가\n"
				+ "2. 모두 출력\n"
				+ "7. 끝내기");
			System.out.printf("번호 입력: ");
			int num = sc.nextInt();

			switch (num) {
				case 1:
					bookInput();
					break;
				case 2:
					bookAllOutput();
					break;
				case 7:
					System.out.printf("정말 끝내시겠습니까(Y/N)? ");
					if (sc.next().toUpperCase().charAt(0) == 'Y') {
						loop = false;
					}
					break;
				default:
					System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			}

		} while (loop && count < 9);
	}

	private void bookInput() {

		sc.nextLine();
		System.out.printf("도서명: ");
		String title = sc.nextLine();
		System.out.printf("저자명: ");
		String author = sc.next();
		System.out.printf("출판사명: ");
		sc.nextLine();
		String publisher = sc.nextLine();
		System.out.printf("책 가격: ");
		int price = sc.nextInt();
		System.out.printf("할인율: ");
		double discount = sc.nextDouble();

		bar[count] = new Book(title, author, publisher, price, discount);
		count++;

	}

	private void bookAllOutput() {

		for (Book book : bar) {
			if (book == null) {
				break;
			}
			System.out.println(book);
		}
	}

}
