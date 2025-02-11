package oop.test;

import oop.encapsulation.Student;

public class TestStudentGetter {

	public static void main(String[] args) {

		Student student = new Student(12, "kiml", "korean", 98.9, "A", 1);
		Student student1 = new Student(44, "lewis", "english", 78.9, "B", 2);
		Student student2 = new Student(63, "russel", "german", 68.1, "C", 3);

		student.displayStudent();
		student1.displayStudent();
		student2.displayStudent();

		// 학생 3명의 점수 평균 계산해서 출력

		double avg = (student.getScore() + student1.getScore() + student2.getScore()) / 3;

		System.out.println(
			student.getSName() + ", " + student1.getSName() + ", " + student2.getSName() + " 세 명의 학생의 평균 점수: " + avg);
		System.out.printf("세 학생의 평균 점수 : %.2f", avg);

	}

}
