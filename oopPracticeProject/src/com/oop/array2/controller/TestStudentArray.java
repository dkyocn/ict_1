package com.oop.array2.controller;

import java.util.Scanner;

import com.oop.array2.model.Student;

public class TestStudentArray {

	public static void main(String[] a) {
		// 객체 배열 실습 : 문제 2 실행 테스트

		silsub2();
	}

	private static void silsub2() {

		Scanner scanner = new Scanner(System.in);

		//		1. 최대 10명의 학생 정보를 기록할 수 있게 배열 할당함
		//		2. 학생 정보가 한명씩 추가될 때 마다 카운트함
		//			=> while() 문 사용함
		//			   계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면
		//			   계속 객체 추가하고 키보드로 값 입력받아 기록함.
		//		3. 키보드로 3명의 학생 정보를 입력받아, 각 객체에 저장함
		//		4. 현재 입력된 학생들의 점수의 평균을 구하여 출력함
		//		5. 현재 기록된 학생들의 정보를 모두 출력함
		// 학번, 이름, 점수

		Student[] student = new Student[10];

		char loop = 'y';
		int count = 0;
		double sum = 0;

		while (loop == 'y' && count < 10) {

			System.out.printf("학번 입력: ");
			int num = scanner.nextInt();
			System.out.printf("이름 입력: ");
			String name = scanner.next();
			System.out.printf("점수 입력: ");
			double score = scanner.nextDouble();

			student[count] = new Student(num, name, score);

			System.out.printf("추가를 계속 진행하시겠습니까?(y/n) ");
			loop = scanner.next().toLowerCase().charAt(0);
			if (loop == 'y') {
				count++;
			}
		}

		for (Student student2 : student) {

			if (student2 == null) {
				break;
			}
			sum += student2.getScore();
		}

		System.out.printf("%d의 학생 점수 평균: %.2f\n", count + 1, (sum / (count + 1)));

		//		for (Student student2 : student) {
		//
		//			if (student2 == null) {
		//				break;
		//			}
		//			System.out.println(student2);
		//		}

		// 등록된 학생 점수를 가지고 등수 처리
		for (int i = 0; i < count + 1; i++) {
			int rank = 1;
			for (int j = 1; j < count + 2; j++) {
				if (student[j] != null && student[i].getScore() < student[j].getScore()) {
					rank++;
				}
			}
			student[i].setRank(rank);
		}

		for (Student student2 : student) {

			if (student2 == null) {
				break;
			}
			System.out.println(student2);
		}
	}
}
