package test.jdk21.sequenced;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class TestSequencedMap {

	public static void main(String[] args) {
		// Map의 후손으로 추가된 SequencedMap 사용 테스트
		/*
		 *  HashMap은 저장되는 key가 Set 방식임, 저장되는 객체의 순서가 유지 안됨
		 *  HashMap의 후손으로 LinkedHashMap은 카에 대한 저장순서가 유지됨 >> SequencedMap 사용됨
		 */

		SequencedMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(2, "Two");
		map.putFirst(1, "One");
		map.putLast(3, "Three");

		System.out.println("map : " + map); // {1=One, 2=Two, 3=Three}
		System.out.println("first entry : " + map.firstEntry()); // 1=One
		System.out.println("last entry : " + map.lastEntry()); // 3=Three

		map.pollFirstEntry();
		System.out.println("map : " + map); // {2=Two, 3=Three}
		map.pollLastEntry();
		System.out.println("map : " + map); // {2=Two}

		map.clear();

		map.put(2, "Two");
		map.putFirst(1, "One");
		map.putLast(3, "Three");

		System.out.println("map : " + map); // // {1=One, 2=Two, 3=Three}
		System.out.println("reversed map : " + map.reversed()); // {3=Three, 2=Two, 1=One}
	}

}
