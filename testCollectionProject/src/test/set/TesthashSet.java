package test.set;

import java.util.HashSet;
import java.util.Iterator;

public class TesthashSet {

	public static void main(String[] args) {
		// Set 계열 테스트
		HashSet hSet = new HashSet(); // 기본 저장 공간 : 16개, 확장비율: 0.75 => 저장용량에 제한이 없음
		// 다형성을 이용해서 부모타입으로 레퍼런스 선언해도 될 것임
		//		Set hset2 = new HashSet();
		//		Collection hset3 = new HashSet();

		// 저장 시 add(E e) 메서드 사용 : 객체만 저장함, 여러 종류의 객체를 저장할 수 있음
		hSet.add(new String("apple"));
		hSet.add(Integer.valueOf(120)); // int => Integer object로 바꿈 : 박싱(Boxing) 이라고 함
		hSet.add(Double.valueOf(32.5)); // double => Doulbe object로 바꿈 : boxing

		// 저장 순서가 유지 안됨
		System.out.println(hSet/*.toString()*/);
		System.out.println("저장된 객체 수 : " + hSet.size());

		// Set은 중복저장 허용 안함 (똑같은 객체 두 번 저장 안됨)
		// 중복 검사 기능(unique) 내장되어 있음
		hSet.add("apple");
		hSet.add(120); // auto boxing 됨 : data => object
		hSet.add(300); // auto boxing 됨

		System.out.println(hSet);

		// 저장된 객체 제거 : remove(E e) 사용
		hSet.remove("apple");
		System.out.println(hSet);
		System.out.println("객체 수 : " + hSet.size());

		hSet.add("banana");
		hSet.add("0.75");

		System.out.println(hSet);
		System.out.println("객체 수 : " + hSet.size());
		System.out.println("apple 문자열객체 저장 확인 : " + hSet.contains("apple"));
		System.out.println("banana 문자열객체 저장 확인 : " + hSet.contains("banana"));

		/*
		 * Set 계열에는 저장된 개체 하나씩 꺼내는 기능(메서드) 없음
		 * Set은 저장 순서도 없고, 저장 순번(index)도 사용 안함
		 * toArray()로 Object[]로 바꿔서 하나씩 다루거나,
		 * iterator()로 저장된 객체 목록을 만들어서, 목록으로 하나씩 꺼내도록 처리함
		 */
		System.out.println("\n toArray()로 연속 처리 ----------------");
		// toArray() : Object[]
		Object[] array = hSet.toArray();
		for (Object object : array) {
			System.out.println(object);
		}

		System.out.println("\n iterator() ----------------");
		Iterator iterator = hSet.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}

		// 저장 공간 비우기
		hSet.clear();
		System.out.println("저장 공간이 비워졌느냐? " + hSet.isEmpty());
		System.out.println("객체수: " + hSet.size());

	}

}
