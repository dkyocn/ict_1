package test.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics2 {

	public static void main(String[] args) {
		// Generics : 클래스 사용 시 제네릭스 기능을 사용할 수 있다는 표시임
		/*
		 * 클래스명<영문자> 또는 인터페이스명<영문자> : <영문자> 가 제네릭스임
		 * 컬랙션 사용 시 한가지 타입의 객체들만 취급한다고 지정하는 것임
		 * 저장된 객체를 하나씩 꺼낼 때, Object가 아니고 지정한 객체 타입으로 꺼내짐 : 클래스 형변환 필요없음
		 * 저장 용량에 제한이 없으므로, 한가지 객체를 많이 저장해서 사용할 때 제네릭스 지정하면 편리함
		 * 주의 : 한번 지정하면 리턴 시 반환자료형에, 매개변수 자료형에 모두 지정해 줘야 함
		 */

		List<String> list = listAllocation();
		listInit(list);
		print(list);

	}

	private static void listInit(List<String> list) {
		// String 만 저장하는 리스트로 선언되었음
		// 다른 타입의 객체 저장하면 에러남
		list.add("apple");
		list.add(new String("orange"));
		//		list.add(new Date()); // error
	}

	private static void print(List<String> list) {
		// 전달되는 컬랙션에 제네릭스가 지정되어 있으면, 받는 매개변수도 제네릭스 표시해야 함
		// 제네릭스가 적용된 컬랙션에서 객체를 하나씩 추출할 때
		// Object 타입이 아니고, 지정한 클래스 타입으로 바로 추출됨 : 형변환 필요없음
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static ArrayList<String> listAllocation() {
		/*
		 * 제네릭스 설정된 레퍼런스를 리턴할 경우
		 * 해당 메서드의 반환 자료형에도 같은 타입으로 제네릭스 지정해야 함
		 */
		return new ArrayList<String>();
	}

}
