package practice.oop.array.run;

import java.util.Scanner;

import practice.oop.array.model.dto.Employee;

public class EmpArrayTest {

	public static void main(String[] args) {
		// 객체 배열 실습 문제 : Employee  object array test

		Scanner scanner = new Scanner(System.in);

		// 크기가 3인 배열 객체 생성
		Employee[] employees = {
			new Employee(),
			new Employee(20250211, "kimi", 18, 'M', "010-1234-5678", "서울시 강남구"),
			new Employee(20240315, "lewis", "F1", "Driver", 38, 'F', 1000000000, 0.14, "010-1235-4678",
				"서울시 분당구")
		};

		// 3개 객체 정보 출력
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		System.out.println("==========================================================");

		// 3개의 객체 중 값잉 없는 필드에 각각 값을 입력해 넣음
		employees[0].setEmpNo(201305);
		employees[0].setEmpName("이영희");
		employees[0].setDept("총무부");
		employees[0].setJob("대리");
		employees[0].setAge(28);
		employees[0].setGender('F');
		employees[0].setAslary(3750000);
		employees[0].setBonusPoint(0.1);
		employees[0].setPhone("010-9512-7534");
		employees[0].setAddress("경기도 동두천");

		employees[1].setDept("기획부");
		employees[1].setJob("사원");
		employees[1].setAslary(2900000);
		employees[1].setBonusPoint(0.05);

		System.out.println("==========================================================");

		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		int[] aslary = new int[3];
		for (int i = 0; i < aslary.length; i++) {
			aslary[i] = employees[i].getAslary() + (int)(employees[i].getAslary() * employees[i].getBonusPoint()) * 12;
			System.out.println(employees[i].getEmpName() + "의 급여: " + aslary[i]);
		}

		// 3직원의 1년 연봉의 평균을 구하여 출력
		int sum = 0;
		for (int i = 0; i < aslary.length; i++) {
			sum += aslary[i];
		}

		System.out.println("직원들의 연봉의 평균: " + sum / 3.0);
	}

}
