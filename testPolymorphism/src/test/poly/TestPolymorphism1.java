package test.poly;

import poly.model.dto.Customer;
import poly.model.dto.Person;
import poly.model.dto.Student;

public class TestPolymorphism1 {

	public static void main(String[] a) {
		/*
		 * 다형성 테스트
		 * 
		 * 다형성 : 상속을 통해 사용할 수 있는 기술임
		 * 상속 관계에 있는 부모클래스는 후손클래스 객체의 주소를 받을 수 있음 (부모 레퍼런스 = 후손객체의 주소;)
		 */

		Person p = null;
		// 부모의 레퍼런스에 후손 객체의 주소 대입 가능함

		p = new Customer("김철수", 27, '남', "kim@namer.com", "010-4915-7894", "서울시 서초구 신논현동", 35234.1);

		System.out.println(p); // p.toString() 과 같음

		Customer customer = new Customer("신짱구", 5, '여', "shin@daum.net", "010-4597-4987", "서울시 강남구", 34512.5);

		p = customer;

		System.out.println(customer); // p.toString() 과 같음

		p = new Student("정동주", 28, '남', "jundongju@test.org", "010-49871-9874", 2412012, "컴퓨터 공학과", 4.5);

		System.out.println(p); // p.toString() 과 같음

		Object object = customer;
		System.out.println(object);

		object = new String("다형성 확인");
		System.out.println(object);

		object = new java.util.GregorianCalendar();
		System.out.println(object);

		// 다형성은 부모가 여러 후손들을 다루는 기술
		// 상속 관계가 아닌 (부모 자식관계가 아닌) 클래스 간에는 사용할 수 없음
		//		Customer customer2 = new Student(); // 형제 지간 클래스끼리는 대입 불가능, error
	}

}
