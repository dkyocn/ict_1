package test.generics;

import java.util.ArrayList;
import java.util.List;

import practice2.Book;

public class TestGenerics3 {

	public static void main(String[] args) {
		// List 계열 제네릭스 사용 테스트
		//ArrayList에 practice2.Book 타입의 객체만 저장할 수 있도록 제한을 검
		ArrayList<Book> list = new ArrayList<Book>();
		//		ArrayList<Book> list = new ArrayList<>();
		//		List<Book> list = new ArrayList<Book>();

		// 리스트에 객체 저장 초기 설정하는 메서드 실행
		listInit(list);

		// 리스트 출력 메서드
		displayList(list);
	}

	private static void displayList(List<Book> list) {
		for (Book book : list) {
			System.out.println(book);
		}

	}

	private static void listInit(List<Book> list) {
		list.add(new Book("202503", 1, "날아라슈퍼보드", "박재상"));
		list.add(new Book("202505", 3, "도깨비", "영희"));
		list.add(new Book("202506", 2, "짱구", "철수"));
	}
}
