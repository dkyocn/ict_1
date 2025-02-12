package test.method;

import java.util.Random;

public class NonStaticSample {

	//1. 반환값 없고 매개변수 없는 메소드
	//실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	public void printLottoNumbers() {

		String result = "";

		for (int i = 0; i < 6; i++) {
			result += ((int)(Math.random() * 45) + 1) + " ";
		}

		System.out.println(result);

	}

	//2. 반환값 없고 매개변수 있는 메소드
	//실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	public void outputChar(int num, char ch) {

		for (int i = 0; i < num; i++) {
			System.out.printf(ch + "");
		}
	}

	//3. 반환값 있고 매개변수 없는 메소드
	//실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	public char alphabette() {

		Random random = new Random();

		return (char)(random.nextInt(26) + 65);

	}

	//4. 반환값 있고 매개변수 있는 메소드
	//실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
	//추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
	public String mySubstring(String str, int start, int end) {

		String result = "";

		try {
			result = str.substring(start, end);
		} catch (ArrayIndexOutOfBoundsException e) {
			result = null;
		}

		return result;
	}
}
