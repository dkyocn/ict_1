package oop.test;

import oop.encapsulation.Student;

public class TestStudent {

	public static void main(String[] args) throws Exception {

		/*
		 *  클래스 안의 static 필드들은 프로그램이 실행되면, 정적 메모리에 자동 할당되고 초기화 됨
		 *  static 맴버들은 사용 시 소속클래스명.맴버명으로 표기함
		 */

		System.out.println("처리할 최대 학생 수 : " + Student.MAX);

		Student student = new Student();
		Student student2 = new Student(20250122, "홍길동");
		Student student3 = new Student(20250210, "도레미", "소프트웨어학과", 4.5, "A", 1);

		student.displayStudent();
		student2.displayStudent();
		student3.displayStudent();

		Student student4 = new Student();
		Student student5 = new Student();
		//		Student student6 = new Student(); // 에러 발생 확인

		//		student.sno = 8; // private 필드는 클래스 안에서만 접근 가능하여 패키지 밖 클래스가 사용하므로 에러
	}

}
