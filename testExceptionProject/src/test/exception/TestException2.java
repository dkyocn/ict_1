package test.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {

	public static void main(String[] args) {
		// 예외 처리 구문 작동테스트
		new TestException2().fileRead();

	}

	public void fileRead() {
		FileReader fileReader = null;

		try {
			// 예외처리를 반드시 해야 되는  구문 : 생성자나 메서드 사용 구문들
			fileReader = new FileReader("sample.txt");
			/*
			 *  대상 파일과 실행하는 프로그램(프로세스) 사이에 데이터를 읽기 위한 스티림이 연결됨
			 *  스트림은 운영체제로부터 얻어오는 자원임
			 *  사용이 끝나면 반드시 반납해야 함
			 */

			int ch;
			while ((ch = fileReader.read()) != -1) {
				System.out.printf((char)ch + "");
			}
			System.out.println();
		} catch (FileNotFoundException e) { // 처리할 예외 클래스와 레퍼런스 변수 선언함
			// 처리할 예외 클래스와 레퍼런스 변수 선언
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// read() 메서드 사용에 대한 예외 처리
			e.printStackTrace(); // 에러 메세지와 에러 추적 정보가 출력
		} catch (Exception e) { // java.lang.Exception 이 예외클래스의 최상위 클래스임
			e.printStackTrace();
		} finally {
			// 예외 발생 여부와 관계 없이 반드시 작동해야하는 구문 작성

			// 읽기용 스트림은 반드시 반납해야 함
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
