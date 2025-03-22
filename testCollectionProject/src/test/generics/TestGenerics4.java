package test.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import practice2.Book;

public class TestGenerics4 {

	public static void main(String[] args) {
		// Set 계열 제네릭스 사용 테스트
		Set<Book> bookks = new HashSet<Book>();
		//		Set<Book> bookks = new HashSet<>();

		setInit(bookks);
		displaySet(bookks);
	}

	private static void displaySet(Set<Book> set) { // 매개변수도 제네릭스 적용해야 함
		// Set은 연속 처리를 위해서 객체목록(Iterator)을 만들어서 하나씩 꺼내서 처리
		Iterator<Book> iterator = set.iterator();

		while (iterator.hasNext()) {
			Book book = iterator.next(); // 다운캐스팅이 필요없음
			System.out.println(book);
		}

	}

	private static void setInit(Set<Book> set) { // 매개변수도 제네릭스 적용해야 함
		set.add(new Book("202503", 1, "날아라슈퍼보드", "박재상"));
		set.add(new Book("202505", 3, "도깨비", "영희"));
		set.add(new Book("202506", 2, "짱구", "철수"));
	}

}
