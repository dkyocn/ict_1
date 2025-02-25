package old.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OldKeyboardInput {

	public static void main(String[] a) {
		/*
		 * 자바에서 1.5버전 이후부터는 키보드를 이용한 자료형 종류별로 입력 시에 java.util.Scanner 제공하고 있음
		 * 1.5버전 이전에는 java.io 패키지의 클래스를 이용해서 키보드 입력 처리하였음
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("문자 하나 입력: ");
			int value = br.read();
			System.out.println((char)value + " is unicode " + value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
