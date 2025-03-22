package test.uuid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class TestUUID {

	public static void main(String[] args) {
		// java.util.UUID 클래스 사용 테스트
		UUID uuid1 = UUID.randomUUID(); // 난수 기반으로 UUID 생성함, 16바이트임
		UUID uuid2 = UUID.fromString("550e8400-e289-41b4-a716-441239830265");
		/*
		 *  지정된 문자열로  UUID 문자열을 생성해서 리턴
		 *  지정 문자열 작성 형식 : 8글자-4글자-4글자-4글자-12글자 (총 36글자)로 작성해야 함
		 *  글자는 정수 숫자 16진수 형식으로 지정함
		 */

		System.out.println("랜덤 UUID : " + uuid1);
		System.out.println("지정 문자열에 대한 UUID : " + uuid2);

		// List에 적용
		List<UUID> idList = new ArrayList<UUID>();

		idList.add(UUID.randomUUID());
		idList.add(UUID.randomUUID());

		for (UUID id : idList) {
			System.out.println(id);
		}

		// Set에 적용
		Set<UUID> idSet = new HashSet<UUID>();

		// set에 적용
		idSet.add(UUID.randomUUID());
		idSet.add(UUID.randomUUID());
		idSet.add(UUID.randomUUID());

		/*
		 *  Set에 저장된 객체 연속 처리 방법 1: iterator() 사용해서 객체 목록 만들어서 연속 처리
		 *  Set도 for each 문 사용해서 객체 연속 처리 가능함
		 */
		System.out.println("Set에 저장된 UUID 확인");
		for (UUID id : idSet) {
			System.out.println(id);
		}

		System.out.println("\n중복 추가 전 크기 : " + idSet.size()); // 3

		UUID dupId = UUID.randomUUID();
		idSet.add(dupId); // 저장 ok
		idSet.add(dupId); // 중볻 저장 시도

		System.out.println("\n중복 추가 전 크기 : " + idSet.size()); // 4

	}

}
