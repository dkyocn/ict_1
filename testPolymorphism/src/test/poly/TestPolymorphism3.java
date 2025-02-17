package test.poly;

import poly.model.dto.Customer;
import poly.model.dto.Person;
import poly.model.dto.Student;

public class TestPolymorphism3 {

	public static Object[] initArray(int su) {

		Object[] objects = new Object[su];

		// 다형성 적용 : 부모레퍼런스 = 후손객체주소;
		objects[0] = new Customer("김철수", 27, '남', "kim@namer.com", "010-4915-7894", "서울시 서초구 신논현동", 35234.1);
		objects[1] = new Student("정동주", 28, '남', "jundongju@test.org", "010-49871-9874", 2412012, "컴퓨터 공학과", 4.5);
		objects[2] = new Customer("kimi", 27, '여', "kimi@namer.com", "010-4567-8735", "서울시 서초구 신논현동", 35234.1);
		objects[3] = new Student("hemilton", 28, '남', "hemilton@test.org", "010-7686-7864", 2428768, "기계공학과", 4.32);
		objects[4] = new Person("허영희", 28, '여', "yunghi@test.org", "010-7686-7864");

		return objects;
	}

	public static void print(Object[] array) {
		for (Object object : array) {
			System.out.println(object); // object.toString
		}
	}

	public static void main(String[] args) {
		/*
		 *  다형성 테스트 3
		 *  메소드의 매개변수에 다형성 적용 : 메서드 오버로딩(중복 작성) 개수 줄일 수 있음
		 *  매서드 리턴타입에도 다형성 적용
		 */

		Object[] objects = initArray(5);
		print(objects);

	}

}
