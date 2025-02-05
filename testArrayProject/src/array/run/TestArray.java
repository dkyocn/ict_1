package array.run;

import array.sample.ArraySample;

public class TestArray {

	public static void main(String[] args) {
		
		/*
		 *  ArraySample 실행 테스트 용
		 *  arraySample 는 ArraySample 클래스에 대한 객체의 주소만 저장할 수 있음
		 *  다른 클래스 객체의 주소는 저장할 수 없음
		 */
		ArraySample arraySample = new ArraySample();
		practice.array.ArraySample arraySample2 = new practice.array.ArraySample();
		
//		System.out.println("arraySample가 가진 ArraySample 클래스 객체의 주소 : "+arraySample.hashCode());
//		arraySample.testArray1();
//		arraySample.testArray2();
//		arraySample.testArray3();
//		arraySample.testArray4();
		
		
//		arraySample2.test1();
//		arraySample2.test2();
//		arraySample2.test3();
//		arraySample2.test4();
//		arraySample2.test5();
		arraySample2.test6();
	}

}
