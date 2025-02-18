package test.poly;

import poly.model.dto.Customer;
import poly.model.dto.Student;

public class TestPolymorphism2 {

	public static void main(String[] args) {
		// 다형성 테스트 2
		// 메서드의 매개변수, 메서드의 리턴 타입, 객체 배열에 다형성 주로 사용됨
		// 객체 배열에 다형성 적용

		//		Person[] persons = new Person[5]; // Person 클래스 타입의 레퍼런스 변수 5개를 배열로 할당
		Object[] persons = new Object[5];
		// 객체 배열을 객체들의 주소를 배열로 관리하는 것임

		persons[0] = new Customer("김철수", 27, '남', "kim@namer.com", "010-4915-7894", "서울시 서초구 신논현동", 35234.1);
		persons[1] = new Student("정동주", 28, '남', "jundongju@test.org", "010-49871-9874", 2412012, "컴퓨터 공학과", 4.5);
		persons[2] = new Customer("kimi", 27, '여', "kimi@namer.com", "010-4567-8735", "서울시 서초구 신논현동", 35234.1);
		persons[3] = new Student("hemilton", 28, '남', "hemilton@test.org", "010-7686-7864", 2428768, "기계공학과", 4.32);
		persons[4] = new Student("허영희", 28, '여', "yunghi@test.org", "010-7686-7864", 2415766, "기계공학과", 4.32);

		//		for (Person ref : persons) {
		for (Object ref : persons) {
			System.out.println(ref);
		}
	}

}
