package oop.test;

import oop.encapsulation.Product;

public class TestProduct {

	public static void main(String[] args) {
		// product 생성자 및 this 레퍼런스 테스트

		//클래스자료형 레퍼런스 변수; 클래스는 참조 자료형, 레퍼런스 == 주소
		Product product;

		// 레퍼런스 변수 = new 클래스생성자();
		product = new Product(); // 해당 클래스가 제공하는 기본생성자를 사용해서 힙메모리에 객체공간을 할당하고 주소 저장 처리
		System.out.println("product가 가진 주소: " + product.hashCode());

		// 레퍼런스변수.메서드(); => 레퍼런스가 가진 주소를 실행하는 메서드 안의  this 에게 주소 전달하는 방법
		product.printlnformation();

		Product product2 = new Product("ssgu25", "갤럭시울트라25", "평택");
		System.out.println("product2가 가진 주소: " + product2.hashCode());
		product2.printlnformation();

		Product product3 = new Product("ssgu22", "갤럭시울트라22", "기흥", 1250000, 0.1);
		System.out.println("product3가 가진 주소: " + product3.hashCode());
		product3.printlnformation();
	}

}
