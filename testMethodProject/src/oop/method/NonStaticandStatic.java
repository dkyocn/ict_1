package oop.method;

public class NonStaticandStatic {

	public static void main(String[] s) {

		// test.method.NonStaticSample 메서드 테스트
		test.method.NonStaticSample sample = new test.method.NonStaticSample();

		// 1. 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
		sample.printLottoNumbers();

		// 2. 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
		sample.outputChar(9, 'r');

		// 3. 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		char ch = sample.alphabette();

		// 4. 3번 메서드 성공 여부 확인
		System.out.println("\n" + ch);

		// 5. 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을 추출하여 리턴하는 메서드
		String str = sample.mySubstring("asjdcnasndichiadh", 3, 8);

		// 6. 5번 메서드 성공 여부 확인
		System.out.println(str);

		// oop.method.NonStaticSample 메서드 테스트 
		NonStaticSample nonStaticSample = new NonStaticSample();

		// 1. int 한개의 전달값을 받아서, 배열의 주소를 리턴하는 메소드
		int nonResult = nonStaticSample.intArrayAllocation(10);

		// 2. 1번 메서드 성공 여부 확인
		System.out.println(nonResult);

		// 3. 기본 배열 초기값 설정
		int[] intArr = {3, 5, 1, 2, 6, 4};

		// 4. 배열 출력
		nonStaticSample.display(intArr);

		System.out.println();

		// 5. 전달받은 배열에서 전달 받은 두 정수위치의 값 교환
		nonStaticSample.swap(intArr, 2, 4);

		// 6. 5번 메서드 성공 여부 확인
		nonStaticSample.display(intArr);

		System.out.println();

		// 7. 배열 내림차순 정렬
		nonStaticSample.sortDescending(intArr);

		// 8. 7번 메서드 성공 여부 확인
		nonStaticSample.display(intArr);

		System.out.println();

		// 9. 배열 오름차순 정렬
		nonStaticSample.sortAscending(intArr);

		// 10. 9번 메서드 성공 여부 확인
		nonStaticSample.display(intArr);

		// 11. 문자열과 문자 하나를 전달받아, 문자열에 포함된 문자의 갯수를 리턴하는 메소드
		int nonResult1 = nonStaticSample.countChar("application", 'p');

		// 12. 11번 메서드 성공 여부 확인
		System.out.println("\n" + nonResult1);

		// 13. 정수 두 개를 전달받아, 두 수중 작은 값에서 큰 값사이의 정수들의 합계 구하는 메서드
		int sum = nonStaticSample.totalValue(5, 15);

		// 14. 13번 메서드 성공 여부 확인
		System.out.println(sum);

		// 15. 문자열과 인덱스를 전달받아, 그 위치의 문자를 리턴하는 메소드
		char nonResult2 = nonStaticSample.pCharAt("qweasndlsakdj", 5);

		// 16. 15번 메서드 성공 여부 확인
		System.out.println(nonResult2);

		// 17. 두 개의 문자열을 전달받아, 하나의 문자열로 합쳐서 리턴하는 메소드
		String nonResult3 = nonStaticSample.pConcat("hello", "world");

		// 18. 17번 메서드 성공 여부 확인
		System.out.println(nonResult3);

		/*
		 * static method
		 */

		//		// vaule 초기값 성정
		//		StaticMethod.setValue("asdqwerzxc");
		//
		//		// 1. 초기값 확인
		//		System.out.println(StaticMethod.getValue());
		//
		//		// 2. 전부 대문자로 바꾸는 메서드 실행
		//		StaticMethod.toUpper();
		//
		//		// 3. 2번 메서드 성공 여부 확인
		//		System.out.println(StaticMethod.getValue());
		//
		//		// 4. 특정 위치를 특정 문자로 변경 (ex. 3번 위치의 문자를 r로 변경)
		//		StaticMethod.setChar(3, 'r');
		//
		//		// 5. 4번 메서드 성공 여부 확인
		//		System.out.println(StaticMethod.getValue());
		//
		//		// 6. 현재 value의 길이 반환하는 메서드
		//		int result = StaticMethod.valueLength();
		//
		//		// 7. 6번 메서드 성공 여부 확인
		//		System.out.println(result);
		//
		//		// 8. 현재 value에 전달한 문자열을 합친 후 반환하는 메서드
		//		String result2 = StaticMethod.valueConcat("hello");
		//
		//		// 9. 8번 메서드 성공 여부 확인
		//		System.out.println(result2);
	}

}
