package test.list;

import java.util.ArrayList;

public class TestBookList {

	public static void main(String[] args) {
		// Book 객체들을 리스트에 저장처리 테스트
		// 객체 배열이라면,
		//		Book[] books = new Book[저장개수지정];

		ArrayList bookList = new ArrayList();

		bookList.add(new Book("해리포터", 35000));
		bookList.add(new Book("자바의 정석", 45000));
		bookList.add(new Book("sql 완성", 30000));
		bookList.add(new Book("오라클 설계", 55000));
		bookList.add(new Book("프로젝트 방법론", 38000));

		System.out.println(bookList);

		// for문
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(i + " : " + bookList.get(i));
		}

		// for each문
		for (Object object : bookList) {
			System.out.println(object);
		}

		/*
		 * sort()로 정렬 처리 : 저장된 객체의 필드 값 중에서 정렬 기준으로 사용할 필드 지정이 필요함
		 * sort(Comparator 래퍼런스) : 정렬 기준이 지정된 Comparator 후손 클래스 먼저 작성함
		 * compare() 매서드를 오버라이딩함 => 구현 코드에 정렬기준 필드를 사용함
		 */

		System.out.println("\n도서 제목 기준 오름차순 정렬--------------------------");
		bookList.sort(new BookTitleAscending());
		System.out.println(bookList);

		// for each문
		for (Object object : bookList) {
			System.out.println(object);
		}

		System.out.println("\n도서 가격 기준 내림차순 정렬--------------------------");
		bookList.sort(new BookPriceDescending());
		System.out.println(bookList);

		// for each문
		for (Object object : bookList) {
			System.out.println(object);
		}

	}

}
