package test.list;

import java.util.ArrayList;
import java.util.HashSet;

public class TestArrayList {

	public static void main(String[] args) {
		// List 계열 ArrayList 사용 테스트
		ArrayList list = new ArrayList();
		//		List list2 = new ArrayList();
		//		Collection list3 = new ArrayList();

		// 객체만 저장함, 저장 순서가 유지됨, 저장 시 순번(index)이 부여됨
		list.add(new String("java"));
		list.add("oracle");
		list.add(123); // auto boxing, int => Integer
		list.add(45.6); // auto boxing, double => Double

		System.out.println(list/*.toString()*/);

		// 저장 순번(index)가 있어서, 저장 객체 하나씩 취급할 수 있음 : get(index) : Object
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}

		// 저장 위치에 대한 순번(index)가 있으므로, 원하는 위치에 저장되게 할 수도 있음 : add(index, Element)
		list.add(2, "javascript"); // 기존의 객체들을 뒤로 하나씩 밀어내고 추가함
		System.out.println(list);

		// 원하는 위치에 저장된 객체정보를 변경할 수 있음 : set(index, Element)
		list.set(2, new HashSet());
		System.out.println(list);

		// 중복 저장됨
		list.add("java");
		System.out.println(list);

		// 저장된 객체 정보를 연속으로 처리하려면 
		// for 문, for-each 문, toArray(), iterator() 사용
		System.out.println("for each 사용 --------------------------------");
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
