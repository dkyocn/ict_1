package test.jdk21.sequenced;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class TestSequencedSet {

	public static void main(String[] args) {
		// Set의 후손으로 추가된 SequencedSet 사용 테스트
		// HashSet은 저장 순서 유지 안됨, HashSet의 후손인 LinkedHashSet은 저장 순서가 유지됨 >> SequencedSet
		SequencedSet<String> set = new LinkedHashSet<String>();

		set.add("X");
		set.add("Y");
		set.add("Z");

		System.out.println("set : " + set); // XYZ
		System.out.println("first element : " + set.getFirst()); // X
		System.out.println("last element : " + set.getLast()); // Z

		set.removeFirst();
		System.out.println("set : " + set); // YZ
		set.removeLast();
		System.out.println("set : " + set); // Y

		set.clear();

		set.add("A");
		set.add("B");
		set.add("C");

		System.out.println("set : " + set); // ABC
		System.out.println("reversed set : " + set.reversed()); // CBA
	}

}
