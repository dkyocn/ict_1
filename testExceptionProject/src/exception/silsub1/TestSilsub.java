package exception.silsub1;

import java.util.Scanner;

public class TestSilsub {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		TestSilsub silsub = new TestSilsub();

		silsub.silsub1();

		silsub.silsub2();

	}

	public void silsub1() {

		CharacterProcess characterProcess = new CharacterProcess();
		

		System.out.printf("문자열 입력:");
		try {
			
			String string = scanner.nextLine();
			
			System.out.println(string+"의 영문자 개수는 "+characterProcess.countAlpha(string)+"이다.");
		} catch (CharCheckException e) {
			e.printStackTrace();
		}

	}

	public void silsub2() {
		NumberProcess numberProcess = new NumberProcess();

		System.out.printf("첫번째 정수 입력: ");
		int num1 = scanner.nextInt();
		System.out.printf("두번째 정수 입력: ");
		int num2 = scanner.nextInt();

		try {
			if (numberProcess.checkDouble(num1, num2)) {
				System.out.println(num1 + "은 " + num2 + "의 배수이다.");
			} else {
				System.out.println(num1 + "은 " + num2 + "의 배수가 아니다.");
			}
		} catch (NumberRangeException e) {
			e.printStackTrace();
		}

	}

}
