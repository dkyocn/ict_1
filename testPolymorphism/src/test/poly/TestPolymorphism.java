package test.poly;

import poly.model.dto.Customer;
import poly.model.dto.Student;

public class TestPolymorphism {

	public static void main(String[] args) {
		// 다형성 기술을 사용하는 목적 : 코드 간결, 메서드 오버로딩도 줄일 수 있음
		printObject(new String("다형성 적용 메서드 오버로딩 테스트"));
		printObject(new java.util.Date());
		printObject(new Customer());
		printObject(new Student());
	}

	public static void printObject(Object ref) {
		System.out.println(ref);
	}

	//	public static void printObject(String ref) {
	//		System.out.println(ref);
	//	}
	//
	//	public static void printObject(java.util.Date ref) {
	//		System.out.println(ref);
	//	}
	//
	//	public static void printObject(Customer ref) {
	//		System.out.println(ref);
	//	}
	//
	//	public static void printObject(Student ref) {
	//		System.out.println(ref);
	//	}

}
