package com.oop.view;

import java.util.Scanner;

import com.oop.model.vo.Employee;

public class EmpMenu {

	private static Scanner scanner = new Scanner(System.in);

	public static void mainMenu() {
		Employee employee = new Employee();

		boolean loop = true;

		do {

			System.out.println("******* 사원 정보 관리 프로그램 ************\n"
				+ "\n"
				+ "1. 새 사원 정보 입력\n"
				+ "2. 사원 정보 수정\n"
				+ "3. 사원 정보 삭제\n"
				+ "4. 사원정보 출력\n"
				+ "9. 끝내기");

			System.out.printf("번호 입력: ");
			int num = scanner.nextInt();

			switch (num) {
				case 1:
					employee = empInput();
					break;
				case 2:
					modifyMenu(employee);
					break;
				case 3:
					employee = new Employee();
					break;
				case 4:
					empOutput(employee);
					break;
				case 9:
					System.out.printf("정말 끝내시겠습니까?(y/n)");
					if (scanner.next().toLowerCase().charAt(0) == 'y') {
						loop = false;
					} else if (scanner.next().toLowerCase().charAt(0) != 'n') {
						System.out.println("잘못 입력하셨습니다.");
					}
					break;
				default:
					System.out.println("잘못된 번호를 입력하였습니다. 다시 입력해 주세요.");
			}

		} while (loop);

	}

	// 새 사원 정보 입력
	public static Employee empInput() {

		int empNo; // 사번
		String empName; // 이름
		String dept; // 소속부서
		String job; // 직급
		int age; // 나이
		char gender; // 성별
		int aslary; // 급여
		double bonusPoint; // 보너스 포인트
		String phone; // 핸드폰
		String address; // 주소

		System.out.println("\n[새 사원 정보 입력]");
		System.out.printf("사번: ");
		empNo = scanner.nextInt();
		System.out.printf("이름: ");
		empName = scanner.next();
		System.out.printf("소속부서: ");
		scanner.nextLine();
		dept = scanner.nextLine();
		System.out.printf("직급: ");
		job = scanner.next();
		System.out.printf("나이: ");
		age = scanner.nextInt();
		System.out.printf("성별(M/F): ");
		gender = scanner.next().charAt(0);
		System.out.printf("급여: ");
		aslary = scanner.nextInt();
		System.out.printf("보너스 포인트: ");
		bonusPoint = scanner.nextDouble();
		System.out.printf("핸드폰: ");
		phone = scanner.next();
		System.out.printf("주소: ");
		scanner.nextLine();
		address = scanner.nextLine();

		return new Employee(empNo, empName, dept, job, age, gender, aslary, bonusPoint, phone, address);
	}

	// 사원 정보 수정
	public static void modifyMenu(Employee employee) {

		System.out.println("\n**** 사원 정보 수정 메뉴 *****\n"
			+ "1. 이름 변경\n"
			+ "2. 급여 변경\n"
			+ "3. 부서 변경\n"
			+ "4. 직급 변경\n"
			+ "5. 이전 메뉴로 이동");

		System.out.printf("번호 입력: ");
		int num = scanner.nextInt();

		switch (num) {
			case 1:
				System.out.printf("\n변경할 이름 입력: ");
				employee.setEmpName(scanner.next());
				break;
			case 2:
				System.out.printf("\n변경할 급여 입력: ");
				employee.setAslary(scanner.nextInt());
				break;
			case 3:
				System.out.printf("\n변경할 부서 입력: ");
				employee.setDept(scanner.next());
				break;
			case 4:
				System.out.printf("\n변경할 직급 입력: ");
				employee.setJob(scanner.next());
				break;
			case 5:
				return;
			default:
				System.out.println("\n없는 번호 입니다.");
		}

	}

	// 사원 정보 출력
	public static void empOutput(Employee employee) {

		System.out.printf("사번: %d\n이름: %s\n소속부서: %s\n직급: %s\n나이: %s\n성별: %s\n급여: %d\n보너스 포인트: %.2f\n핸드폰: %s\n주소: %s",
			employee.getEmpNo(), employee.getEmpName(), employee.getDept(), employee.getJob(), employee.getAge(),
			employee.getGender(), employee.getAslary(), employee.getBonusPoint(), employee.getPhone(),
			employee.getAddress());
	}
}
