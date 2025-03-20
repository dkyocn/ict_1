package test.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class TestHashaMap2 {

	public static void main(String[] args) {
		// Map에 저장된 객체들을 연속으로 처리하는 방법들 테스트

		HashMap hmap = new HashMap();

		// 5개의 객체를 샘플로 앱에 저장 처리
		// 키는 1 ~ 100사이의 임의의 정수 객체
		// 값은 랜덤 값으로 실수 객체
		Random random = new Random();
		while (true) {
			Integer key = random.nextInt(100) + 1; // auto boxing
			Double value = Math.random(); // auto boxing
			hmap.put(key, value);
			if (hmap.size() == 5) {
				break;
			}
		}

		System.out.println(hmap);

		// 1. keySet() : 키를 Set으로 바꿈 => iterator() : 키 목록 => 연속 처리

		Iterator keyIter = hmap.keySet().iterator();
		while (keyIter.hasNext()) {
			System.out.println(keyIter.next());
		}

		// 2. entrySet() : 엔트리들을 Set으로 바꿈 => 엔트리 목록만들어서 연속 처리
		Iterator iterator = hmap.entrySet().iterator();

		while (iterator.hasNext()) {
			Object object = iterator.next();
			Map.Entry entries = (Map.Entry)object;

			System.out.println(entries.getKey() + " = " + entries.getValue());
		}

		// 3. 값 객체들을 Collection으로 바꿈 : values() => for each로 연속 처리
		Collection value = hmap.values();

		for (Object object : value) {
			System.out.println(object);
		}

		// 4. 값 객체들을 Collection 으로 바꿈 : values() => toArray() : Object[] 로 바꿈 => 연속처리
		Collection collection = hmap.values();
		Object[] objects = collection.toArray();

		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]);
		}

		// TreeMap : 키에 대한 오름차순정렬 기능을 내장한 Map 클래스임
		// 주의 사항 : key가 한가지 타입으로 저장되어 있어야 함
		TreeMap tmap = new TreeMap(hmap);
		System.out.println(tmap);

		// 키에 대한 내림차순정렬이 필요하면
		Map descMap = tmap.descendingMap();
		System.out.println(descMap);
	}

}
