package test.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] a) {
		// LinkedHashSet : HashSet의 후손(sub) 클래스
		// 저장 순서가 유지됨 (기능 추가), 중복 검사 기능 있음
		LinkedHashSet linkSet = new LinkedHashSet();

		linkSet.add("apple");
		linkSet.add(123);
		linkSet.add(3.45);
		linkSet.add(123); // 중복된 객체로 저장 안됨
		linkSet.add(new User("user02", "pass02", "이영희"));

		linkSet.addFirst("banana"); // 맨 앞에 추가 저장
		linkSet.addLast("orange"); // 맨 뒤에 추가 저장

		System.out.println(linkSet);
		System.out.println("저장된 객체 수 : " + linkSet.size());

		// Set => Object[] toArray()
		System.out.println("toArray()--------------------");
		Object[] objs = linkSet.toArray();
		for (Object object : objs) {
			System.out.println(object);
		}

		System.out.println();

		// Set => Iterator iterator()
		System.out.println("iterator()--------------------");
		Iterator iterator = linkSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
