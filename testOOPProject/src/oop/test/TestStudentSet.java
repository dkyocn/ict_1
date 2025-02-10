package oop.test;

import java.util.Scanner;

import oop.encapsulation.Student;

public class TestStudentSet {

	public static void main(String[] args) throws Exception {
		// Student 의 setter 메서드 테스트
		Student student = new Student();

		Scanner scanner = new Scanner(System.in);
		//		student.displayStudent();
		//
		//		student.setSno(7);
		//		student.setSname("홀란드");
		//		student.setMajor("체육학과");
		//		student.setScore(99.99);
		//		student.setGrade("A");
		//		student.setRank(1);
		//
		//		student.displayStudent();

		// Student 의 setter 메서드 테스트2 : 초기값을 키보드로 입력받아서 사용하는 경우

		// 1. 키보드로 입력받은 값들은 생성자 초기값으로 전달하여 초기화하느느 방법
		//		System.out.printf("학생 번호: ");
		//		int no = scanner.nextInt();
		//		System.out.printf("학생 이름: ");
		//		String name = scanner.next();
		//		System.out.printf("전공학과: ");
		//		String major = scanner.next();
		//		System.out.printf("점수: ");
		//		double score = scanner.nextDouble();
		//		System.out.printf("등급: ");
		//		String grade = scanner.next();
		//		System.out.printf("등수: ");
		//		int rank = scanner.nextInt();
		//
		//		Student student2 = new Student(no, name, major, score, grade, rank);
		//		student2.displayStudent();

		// 2. 기본 생성한 다음, 키보드로 입력받은 값을 setter 사용해서 변경하는 방법
		Student student2 = new Student();

		System.out.printf("학생 번호: ");
		student2.setSno(scanner.nextInt());
		System.out.printf("학생 이름: ");
		student2.setSname(scanner.next());
		System.out.printf("전공학과: ");
		student2.setMajor(scanner.next());
		System.out.printf("점수: ");
		student2.setScore(scanner.nextDouble());
		System.out.printf("등급: ");
		student2.setGrade(scanner.next());
		System.out.printf("등수: ");
		student2.setRank(scanner.nextInt());

		student2.displayStudent();
	}

}
