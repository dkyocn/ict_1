package oop.array.run;

import java.util.Scanner;

import oop.array.model.vo.Person;

public class TestPersonArray3 {

	public static void main(String[] args) {
		// Person 객체 배열 키보드 입력 처리 테스트

		Person[] person = new Person[3];
		personInput(person); // static 메서드 내에서 그냥 이름으로 실행되는 메서드는 같은 static 이어야 가능
		personOutput(person); // 메서드 실행할 때 메서드 쪽으로 주소를 전달함 : Call by Reference(Call by Address) 방식 사용
	}

	private static void personOutput(Person[] person) {
		// person 이 전달받은 주소 위치의 각 인덱스를 사용해서 객체 정보 출력

		for (Person per : person) {
			System.out.println(per.hashCode());
			System.out.println(per); // per.toString()
		}

	}

	private static void personInput(Person[] person) {
		Scanner scanner = new Scanner(System.in);

		// 전달받은 주소 위치의 각 인덱스에 객체 생성하고 주소 저장 처리한 다음 키보드로 값 입력받아 저장
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person(); // 객체 생성하고 주소 기록

			System.out.printf("주민 번호: ");
			person[i].setPersonId(scanner.next());
			System.out.printf("이름: ");
			person[i].setName(scanner.next());
			System.out.printf("키: ");
			person[i].setHeight(scanner.nextDouble());
			System.out.printf("몸무게: ");
			person[i].SetWeight(scanner.nextDouble());
		}
	}

}
