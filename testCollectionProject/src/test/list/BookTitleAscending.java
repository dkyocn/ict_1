package test.list;

import java.util.Comparator;

// 도서제목을 기준으로 오름차순정렬에 대한 기준 지정 클래스
// java.util.Comparator 인터페이스 반드시 상속받을 것
public class BookTitleAscending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;

		if (o1 instanceof Book && o2 instanceof Book) {
			Book book1 = (Book)o1;
			Book book2 = (Book)o2;

			result = book1.getTitle().compareTo(book2.getTitle());
		}

		return result;
	}

}
