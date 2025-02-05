package com.loop;

import java.util.Scanner;

public class LogicSample {

	private Scanner scanner = new Scanner(System.in);

	/**
	 * if 문
	 * 
	 * 나이(int) 입력 받아 20이상이면 이름(String), 성별(char), 전화번호(String) 입력받아 출력 미만이면 실행 종료
	 * 성별은 남자는 'M', 여자는 'F'로 입력받아, 삼항연산자로 처리
	 */
	public void inputProfile() {

		int age = 0;
		String name = "";
		char gender;
		String phone = "";

		System.out.printf("나이 입력: ");
		age = scanner.nextInt();

		if (age >= 20) {
			System.out.printf("이름 입력: ");
			name = scanner.next();
			System.out.printf("성별 입력(M/F): ");
			gender = scanner.next().toUpperCase().charAt(0);
			System.out.printf("전화번호 입력: ");
			phone = scanner.next();
			System.out.println(name + ", " + age + "세, " + (gender == 'M' ? "남자" : "여자") + ", " + phone);
		}
	}

	/**
	 * if - else 문
	 * 
	 * 3개의 과목의 점수(double)를 입력받아 총점,평균 출력
	 * 단, 점수는 전부 양수이여야 하며 음수 입력 시 "점수는 모두 양수로만 입력하여야 합니다." 출력
	 */
	public void inputScore() {

		double math = 0.0;
		double english = 0.0;
		double korean = 0.0;
		double total = 0.0;

		System.out.printf("수학 점수: ");
		math = scanner.nextDouble();
		System.out.printf("영어 점수: ");
		english = scanner.nextDouble();
		System.out.printf("국어 점수: ");
		korean = scanner.nextDouble();

		total = math + english + korean;

		if (math > 0 && english > 0 && korean > 0) {
			System.out.printf("총점: %.1f, 평균: %.1f", total, (total / 3.0));

		} else {
			System.out.println("점수는 모두 양수로만 입력하여야 합니다.");
		}
	}

	/**
	 * 다중 if 문
	 * 
	 * 점수(double)를 입력받아 학점(char) 출력
	 * 90점 이상 시 'A', 80점 이상 90점 미만 시 'A', 70점 이상 80점 미만 시 'A', 60점 이상 70점 미만 시 'A',60점 미만 시 'F'
	 */
	public void calcGrade() {

		double score = 0.0;
		char grade;

		System.out.printf("점수 입력: ");
		score = scanner.nextDouble();

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("점수: " + score + ", 학점: " + grade);
	}

	/**
	 * 제어문안의 제어문
	 * 
	 * 나이 입력받아 20세 이상이면 이름, 전화번호, 이메일, 성별 입력받고
	 * 성별이 남이면 군필여부 'Y/N' 입력받음
	 * Y 이면 군필 N 이면 미필 출력
	 * 20세 미만이면 "미성년자는 가입할 수 없습니다." 출력
	 */
	public void multiLogic() {

		int age = 0;
		String name = "";
		char gender;
		String phone = "";
		String email = "";
		char army;

		System.out.printf("나이 입력: ");
		age = scanner.nextInt();

		if (age >= 20) {

			System.out.printf("이름 입력: ");
			name = scanner.next();
			System.out.printf("전화번호 입력: ");
			phone = scanner.next();
			System.out.printf("이메일 입력: ");
			email = scanner.next();
			System.out.printf("성별 입력(남/여): ");
			gender = scanner.next().charAt(0);

			if (gender == '남') {
				System.out.printf("군필여부(Y/N): ");
				army = scanner.next().toUpperCase().charAt(0);
				
				if(army == 'Y') {
					System.out.println(name + ", " + age + "세, " + gender + ", " + "군필" + ", "
							+ phone + ", " + email);					
				} else if (army == 'N') {
					System.out.println(name + ", " + age + "세, " + gender + ", " + "미필" + ", "
							+ phone + ", " + email);
				}

			} else if(gender == '여') {
				System.out.println(name + ", " + age + "세, " + gender + ", " + phone + ", " + email);
			}

		} else {
			System.out.println("미성년자는 가입할 수 없습니다.");
		}
	}

	/**
	 * for 문
	 * 
	 * 1 ~ 10 사이의 임의의 정수 생성한 후 (Math.random() 사용)
	 * 1 ~ 100 사이의 해당 정수의 배수의 합 출력
	 */
	public void sumNumbers() {

		int random = (int) (Math.random() * 10) + 1;
		String result = "";
		int total = 0;

		for (int i = 1; i <= 100; i++) {

			if (i == 1) {
				result += random * i;
				total += random * i;
			} else if (i > 1 && random * i <= 100) {
				result += "+" + random * i;
				total += random * i;
			}
		}
		System.out.println(result + " = " + total);
	}

	/**
	 * while 문
	 * 
	 * 문자열과 문자 하나씩 입력받아 문자열 내 입력받은 문자 개수 출력 (while문 만 사용)
	 */
	public void countChar() {

		String temp = "";
		char ch;
		int loop = 0;
		int check = 0;
		int num = 0;

		System.out.printf("문자열 입력: ");
		temp = scanner.next();
		System.out.printf("문자 입력: ");
		ch = scanner.next().charAt(0);

		loop = temp.length();

		while (loop > 0) {

			if (temp.charAt(num) == ch) {
				check++;
			}

			num++;
			loop--;
		}

		System.out.println(temp + "안에 " + ch + " 문자의 개수는 " + check);
	}

	/**
	 * do-while 문
	 * 
	 * 문자열과 기호((@,#,$,-,*,&)) 하나씩 입력받아
	 * 문자열 사이에 입력받은 기호 끼워넣어 출력
	 */
	public void inChar() {

		String temp = "";
		char ch;
		int loop = 0;
		String result = "";
		int num = 0;

		System.out.printf("문자열 입력: ");
		temp = scanner.next();
		System.out.printf("기호문자 입력(@,#,$,-,*,&): ");
		ch = scanner.next().charAt(0);

		loop = temp.length();

		do {

			if (num != temp.length()-1) {
				result += temp.charAt(num) + "" + ch;
			} else {
				result += temp.charAt(num) + "";
			}
			
			num++;
			loop--;
			
		} while (loop > 0);
		
		System.out.println(result);
	}
}
