package oop.array.run;

import oop.array.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		// Person object array test

		/*
		 *  객체 배열은 주소 배열이다.
		 *  1. 배열 레퍼런스 선언 : 클래스 타입[] 레퍼런스 변수; 클래스 타입 []레퍼런스 변수; 클래스 타입 레퍼런스 변수[]
		 */

		Person[] persons;
		//		persons = new Person(); // persons는 Person[] 배열 공간의 주소 저장용으로 선언하였으므로, 객체 하나의 주소 저장 못함

		/*
		 *  2. 객체 배열 공간 할당하고, 발생한 배열공간의 주소를 배열 레퍼런스에 기록 저장함
		 *  배열 레퍼런스 = new 클래스 타입[개수]; => 객체 할당이 아님, 객체의 주소저장용 레퍼런스변수방 배열로 만들기한 것임
		 */
		persons = new Person[3]; // Person 객체 주소 저장할 레퍼런스 변수 3개를 배열로 만들고, 배열 공간의 시작주소를 persons 에 기록함

		// 확인
		for (int i = 0; i < persons.length; i++) {
			System.out.println(i + " : " + persons[i]); // null : 주소 없다
		}

		// 3. 생성자를 사용해서 Person 객체 인스턴스 생성하고, 발생한 주소를 배열 인덱스 순서대로 기록 저장함
		// 배열 레퍼런스[순번] = new 생성자(초기값,....);
		persons[0] = new Person("250211-4012453", "홍길동", 185.5, 78.5);
		persons[1] = new Person("240210-4015453", "도라미", 204.5, 81.5);
		persons[2] = new Person("230209-1012453", "daam", 155.5, 65.5);

		// 기로기된 객체들의 주소 확인
		for (int i = 0; i < persons.length; i++) {
			System.out.println(i + " : " + persons[i].hashCode()); // 주소가 기록된 레퍼런스 출력 : person[i] = person[i].toString()
		}

		// 저장도니 객체들의 키와 몸무게의 평균 계산 처리
		double sumHeight = 0;
		double sumWeight = 0;

		for (int i = 0; i < persons.length; i++) {
			sumHeight += persons[i].getHeight();
			sumWeight += persons[i].getWeight();
		}

		System.out.println("키 평균 : " + (sumHeight / persons.length));
		System.out.println("몸무게 평균 : " + (sumWeight / persons.length));

		sumHeight = 0;
		sumWeight = 0;

		System.out.println("for each 사용 ----------------");

		/*
		 *  객체 배열은 for each 문을 사용해도 됨
		 *  for(클래스 타입 레퍼런스 변수: 배열명) {레퍼런스 변수 사용} => 0번 인덱스부터 순서대로 자동 증가 처리됨
		 */
		for (Person person : persons) {
			System.out.println(person.hashCode());
			System.out.println(person);
			sumHeight += person.getHeight();
			sumWeight += person.getWeight();
		}

		System.out.printf("키 평균 : %.2f \n", (sumHeight / persons.length));
		System.out.printf("몸무게 평균 : %.2f \n", (sumWeight / persons.length));
	}

}
