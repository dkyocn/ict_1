package test.uuid;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class TestUUIDMap {

	public static void main(String[] args) {
		// UUID를 키로 사용하는 HashMap 사용 테스트
		Map<UUID, String> users = new HashMap<UUID, String>();

		UUID id = UUID.randomUUID();

		users.put(id, "Alice");
		users.put(UUID.randomUUID(), "Tom");
		users.put(UUID.randomUUID(), "Jason");

		System.out.println("전체 사용자 목록");
		// 연속 처리 방법 1 : keySet(), entrySet() => Set => iterator()
		// 연속 처리 방법 2 : keySet(), entrySet() => Set => for each 문
		for (Map.Entry<UUID, String> entry : users.entrySet()) {
			System.out.println("UUID : " + entry.getKey() + " , 이름 : " + entry.getValue());
		}

		// 특정 UUID로 검색
		System.out.println("\n사용자 검색 : " + users.get(id));

		// UUID를 오름차순정렬 한다면, TreeMap 사용
		TreeMap<UUID, String> ascUUID = new TreeMap<>(users); // 키로 지정된 UUID 오름차순 정렬됨

		for (Map.Entry<UUID, String> entry : ascUUID.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
