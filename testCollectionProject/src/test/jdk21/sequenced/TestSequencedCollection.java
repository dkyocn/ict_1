package test.jdk21.sequenced;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class TestSequencedCollection {

	public static void main(String[] args) {
		// Collection의 후손으로 SequencedCollection 추가 확인 테스트

		SequencedCollection<String> list = new ArrayList<String>();

		list.add("B");
		list.addFirst("A");
		list.addLast("C");
		list.addLast("D");
		list.addLast("E");

		System.out.println("list : " + list); // ABCDE
		System.out.println("first element : " + list.getFirst()); // A
		System.out.println("last element : " + list.getLast()); // E

		list.removeFirst(); // A 삭제
		System.out.println("list : " + list); // BCDE

		list.removeLast(); // E 삭제
		System.out.println("list : " + list); // BCD

		System.out.println("reversed list : " + list.reversed()); // DCB
	}

}
