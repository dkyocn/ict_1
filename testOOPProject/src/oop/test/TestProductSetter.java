package oop.test;

import java.util.Scanner;

import oop.encapsulation.Product;

public class TestProductSetter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Product product = new Product();

		System.out.printf("상품 아이디: ");
		product.setProductId(scanner.next());
		System.out.printf("상품 이름: ");
		scanner.nextLine();
		product.setProductName(scanner.nextLine());
		System.out.printf("상품 생산지: ");
		product.setProductArea(scanner.next());
		System.out.printf("상품 가격: ");
		product.setPrice(scanner.nextInt());
		System.out.printf("상품 부과세: ");
		product.setTex(scanner.nextDouble());

		//		int realPrice = product.price * (product.tex*0.01);

		product.printlnformation();
	}

}
