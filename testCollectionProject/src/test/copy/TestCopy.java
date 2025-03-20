package test.copy;

import test.list.Book;

public class TestCopy {

	public static void main(String[] args) {
		// Deep copy (깊은 복사) & Shallow copy (얕은 복사) 확인

		// Shallow copy : 주소만 복사함, 즉 객체(instance)는 1개, 래퍼런스변수 2개
		Book b1 = new Book("자바 완성", 350000);
		//		Book b2 = b1; // 얕은 복사(주소 복사)
		Book b2 = (Book)b1.clone();
		// 깊은 복사 : 객체 2개, 각각 레퍼런스 1개씩

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}

}
