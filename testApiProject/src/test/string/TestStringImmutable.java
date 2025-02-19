package test.string;

import java.util.Scanner;

public class TestStringImmutable {

	public static void main(String[] args) {
		/*
		 *  String is immutable (불변, 변경불가능) 확인 테스트용
		 *  메모리에 기록된 문자열값은 수정할 수 없다 (immutable)
		 */
		//		test1();

		StringSample sample = new StringSample();

		//		sample.usedString();
		//		sample.checkLiteralPool();
		//		sample.immutableString();
		//		sample.usedStringBuilder();
		//		sample.usedSplit();
		sample.usedStringTokenizer();

	}

	public static void test1() {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.printf("이름: ");
			String name = scanner.next();

			/*
			 * name은 String 클래스로 만든 레퍼런스 변수임 <= 주소 저장 변수임
			 * name에 문자열 값이 기록되는 것이 아님 => 문자열 값이 메모리에 따로 기록이 되고, 그 주소가 name에 저장
			 */

			if (name.equals("quit"))
				break;

			System.out.println("name : " + name + ", 기록 위치 : " + name.hashCode());
		} while (true);
	}

}
