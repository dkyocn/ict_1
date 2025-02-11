package oop.array.run;

import oop.array.model.vo.Person;

public class TestPersonArray2 {

	public static void main(String[] a) {
		// Person object array init (객체 배열 초기화) 테스트

		/*
		 * 클래스 타입[] 배열레퍼런스 = {new 생성자(초기값, ....), new 생성자(), ....};
		 * 객체 배열의 초기값은 할당된 객체들의 주소임 => new 클래스 생성자(초기값, ...) 사용함
		 */
		Person[] person = {
			new Person("250211-4012453", "홍길동", 185.5, 78.5),
			new Person("240210-4015453", "도라미", 204.5, 81.5),
			new Person("230209-1012453", "댐", 155.5, 65.5)
		};

		System.out.println("할당된 배열의 개수 : " + person.length);

		for (int i = 0; i < person.length; i++) {
			System.out.println(i + " : " + person[i].hashCode());
			System.out.println(person[i]);
		}

		System.out.println("for each -----------------");
		for (Person person2 : person) {
			System.out.println(person2.hashCode());
			System.out.println(person2);
		}
	}

}
