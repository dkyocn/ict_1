package test.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// HashMap 사용 테스트
		// Map hmap = new HashMap();

		HashMap hMap = new HashMap();

		// 저장 시 key 객체와 value 객체 두 개를 한 쌍으로 저장함
		hMap.put(new String("one"), new Integer(1230));

		/*
		 * key : Set 방식, value : List 방식으로 저장됨
		 * key 중복 저장 안됨, value 중복 저장됨
		 * key 저장 순서 유지 안됨
		 */
		hMap.put(2, "java"); // auto boxing => 객체로 자동 변환됨
		hMap.put("three", 36.9); // auto boxing  => data > object 자동 변환됨
		hMap.put(5, "jdbc");

		System.out.println(hMap);

		hMap.put(2, "oracle"); // key : Set 임, 중복 저장 안함 => 같은 키로 저장 시, 값 객체 변경이 됨
		System.out.println(hMap);

		hMap.put("two", 1230); // value : List 임, 중복 저장됨
		System.out.println(hMap);

		// 저장된 객체를 조회하고자 한다면 : get(key) : value 반환됨
		System.out.println(hMap.get(2));
		System.out.println("저장된 객체 수 : " + hMap.size());

		// 객체 제거 : remove(key)
		hMap.remove("one");
		System.out.println("저장된 객체 수 : " + hMap.size());
		System.out.println(hMap);

		// 맴에 저장된 객체들을 연속으로 하나씩 처리해야 한다면
		// 1.저장된 key 들을 Set으로 바꿈 : keySet()사용 => iterator()로 key 목록을 만듦
		// 	key 목록에서 key 하나씩 꺼내서, 맴의 get(꺼낸 key) 사용 => value 객체 추출
		System.out.println("keySet() => iterator()로 키 목록 만들어 연속 처리 --------------------");
		Set keys = hMap.keySet();
		Iterator keyIter = keys.iterator();
		while (keyIter.hasNext()) {
			Object key = keyIter.next();
			Object value = hMap.get(key);
			System.out.println(key + "=" + value);
		}

		// 2. 저장된 객체들을 Collection으로 바꿈 : values() 사용 => for each 문 사용
		System.out.println("values() => Collection 으로 값객체들만 저장 => for each로 연속 처리----------");
		Collection values = hMap.values();
		for (Object object : values) {
			System.out.println(object);
		}

		// 3. 키와 값 한쌍(entry, 엔트리)을 Set으로 바꿈 => 엔트리에 대한 목록 만들기함 => 연속 처리함
		System.out.println("entrySet() => 엔트리들을 Set 으로 변경 : Map.Entry 사용-----------------");
		Set entries = hMap.entrySet();
		Iterator entryIter = entries.iterator();
		while (entryIter.hasNext()) {
			Object object = entryIter.next(); // 다형성 적용 : 부모 타입은 부모 것 밖에 사용 못함
			Map.Entry entry = (Map.Entry)object; // 후손 것 사용하려면, 후손 타입으로 형변환 해야 함 : down casting
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
