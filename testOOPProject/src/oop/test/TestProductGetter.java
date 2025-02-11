package oop.test;

import oop.encapsulation.Product;

public class TestProductGetter {

	public static void main(String[] args) {

		Product product = new Product("ame123", "아이폰 17", "미국", 16700000, 35);
		Product product1 = new Product("kor123", "갤럭시 25", "서울", 17900000, 12);
		Product product2 = new Product("chi123", "화훼이 7", "증극", 8900000, 24);

		product.printlnformation();
		product1.printlnformation();
		product2.printlnformation();

		// 레퍼런스가 참조하는 객체 인스턴스변수의 값을 조회해서 계산에 사용한다면, 각 필드에 대한 getter 메서드 사용함
		int realPrice = product.getPrice() + (int)(product.getPrice() * product.getTex());
		int realPrice1 = product1.getPrice() + (int)(product1.getPrice() * product1.getTex());
		int realPrice2 = product2.getPrice() + (int)(product2.getPrice() * product2.getTex());

		System.out.println("부가세 적용 실제 가격 확인");
		System.out.println(product.getProductName() + " : " + realPrice);
		System.out.println(product1.getProductName() + " : " + realPrice1);
		System.out.println(product2.getProductName() + " : " + realPrice2);
	}

}
