package test.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestGenerics5 {

	public static void main(String[] args) {
		// Map 계열 Generics 사용 메서드
		// Map<K, V> : K (key의 객체 클래스 타입 지정), V (value의 객체 클래스 타입 지정)
		Map<Integer, String> map;

		map = mapAllocation();
		mapInit(map);
		displayMap(map);

	}

	private static void displayMap(Map<Integer, String> map) {
		Iterator<Integer> keyIter = map.keySet().iterator();
		while (keyIter.hasNext()) {
			Integer key = keyIter.next();
			System.out.println(key + " = " + map.get(key));
		}

		/*
		 *  key와  value를 쌍(entry)으로 목록 만들 경우
		 *  Entry는 Map에 속한 내부(Nested, inner) static 인터페이스이므로, Map.Entry로 사용함
		 */
		Set<Map.Entry<Integer, String>> entries = map.entrySet(); // 엔트리에도 제네릭스가 적용되어야 함
		Iterator<Map.Entry<Integer, String>> entryIter = entries.iterator(); // 목록에도 제네릭스 적용되어야 함
		while (entryIter.hasNext()) {
			Map.Entry<Integer, String> entry = entryIter.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " = " + value);
		}

	}

	private static void mapInit(Map<Integer, String> map) { // 받아주는 매개변수도 같은 제네릭스가 표시되어야 함
		map.put(new Integer(1), new String("java"));
		map.put(2, "oracle"); // auto boxing
		map.put(3, "spring");
		//		map.put(1.5, "mybatis"); // 정해진 타입이 아니면 에러 발생함
		//		map.put(4, new Date()); // 정해진 타입이 아니면 에러 발생함
	}

	private static Map<Integer, String> mapAllocation() { // 반환자료형에도 같은 제네릭스 표시해야 함
		return new HashMap<Integer, String>(); // 제네릭스가 적용된 객체 레퍼런스가 리턴되면
	}

}
