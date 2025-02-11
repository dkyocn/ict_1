package oop.array.run;

import oop.array.model.vo.Person;

public class TestPerson {

	public static void main(String[] args) {
		// Person test
		// 클래스 타입 레퍼런스 변수 = new 클래스생성자([매개변수,매개변수,...]);

		Person person = new Person("250211-4012453", "홍길동", 185.5, 78.5);
		Person person1 = new Person("240210-4015453", "도라미", 204.5, 81.5);
		Person person2 = new Person("230209-1012453", "댐", 155.5, 65.5);

		// 확인
		System.out.println(person.toString());
		System.out.println(person1.toString());
		System.out.println(person2.toString());

		System.out.println(person); // 자바에서는 출력 메서드 안에서 레퍼런스 변수만 사용하면 자동으로 toString() 이 작동됨
		System.out.println(person1); // 만약, 후손클래스가 오버라이딩한 경우에는, 후손의 toString()이 자동함
		System.out.println(person2);

		// 키 평균과 몸무게 평균을 구한다면
		double avgHeight = (person.getHeight() + person1.getHeight() + person2.getHeight()) / 3.0;
		double avgWeight = (person.getWeight() + person1.getWeight() + person2.getWeight()) / 3.0;

		System.out.println("키 평균 : " + avgHeight);
		System.out.println("몸무게 평균 : " + avgWeight);

		// 소수 첫재자리까지 출력
		System.out.printf("키 평균 : %.1f\n", avgHeight); // %f 사용 시 자동으로 반올림 처리됨
		System.out.println("몸무게 평균 : " + ((int)(avgWeight * 10) / 10.0));
	}

}
