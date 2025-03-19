package practice2;

import java.util.Scanner;

public class TestBookManager {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

	public static void menu() {

		BookManager bookManager = new BookManager();

		do {
			System.out.println("*** 도서 관리 프로그램 ***\n"
				+ "\n"
				+ "1. 새 도서 추가\n"
				+ "2. 도서정보 정렬후 출력\n"
				+ "3. 도서 삭제\n"
				+ "4. 도서 검색출력\n"
				+ "5. 전체 출력\n"
				+ "6. 끝내기");

			int select = scanner.nextInt();

			switch (select) {
				case 1:
					inputBook();
					break;
				case 2:
					bookManager.printBookList(bookManager.sortedBookList());
					break;
				case 3:
					String bookTitle = inputBookTitle();
					bookManager.deleteBook(bookManager.searchBook(bookTitle));
				case 4:
					String title = inputBookTitle();

				case 5:
				case 6:
			}

		} while (true);

	}

	public static Book inputBook() {

		System.out.printf("도서 번호 입력: ");
		String bNo = scanner.next();
		System.out.printf("도서 분류 코드 입력: ");
		int category = scanner.nextInt();
		System.out.printf("도서 제목 입력: ");
		scanner.nextLine();
		String title = scanner.nextLine();
		System.out.printf("도서 저자 입력: ");
		scanner.nextLine();
		String author = scanner.nextLine();

		return new Book(bNo, category, title, author);
	}

	public static String inputBookTitle() {
		System.out.printf("도서 제목 입력: ");
		return scanner.nextLine();

	}

}
