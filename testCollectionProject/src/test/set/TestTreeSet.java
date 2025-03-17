package test.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TreeSet : 자동 오름차순정렬 기능이 내장된 Set 후손 클래스임
		// 주의 사항 : 같은 종류의 클래스 객체들만 저장해야 함
		TreeSet test = new TreeSet();

		test.add("grape");
		test.add("banana");
		test.add("apple");
		test.add("melon");
		test.add("orange");
		//		test.add(new Double(32.5)); // 종류가 다른 객체는 저장하면 에러가 발생함

		System.out.println(test);

		// toArray()
		System.out.println("toArray() --------------------------");
		Object[] array = test.toArray();
		for (Object object : array) {
			System.out.println(object);
		}

		System.out.println();

		// iterator()
		System.out.println("iterator()--------------------------");
		Iterator iterator = test.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println();

		// descendingIterator() : Iterator => 내림차순정렬된 객체 목록을 리턴하는 메서드
		System.out.println("descendingIterator()-----------------");
		Iterator iterator2 = test.descendingIterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
