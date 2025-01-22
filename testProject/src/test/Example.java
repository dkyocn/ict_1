
// java file 첫 줄에는 반드시 소속 패키지를 선언해야 함
// 패키지 선언문: package 소속패키지명;
package test;

//  import 선언문 작성하는 부분 : import 소속패키지명.클래스명;
import java.util.Date;
import java.text.SimpleDateFormat;
/*
 * 자바 언어의 기본 패키지가 java.lang 패키지임
 * 자바 파일 안에서 java.lang 패키지에 소속된 클래스는 import 선언 생략하고 사용할 수 있음
 * 컴파일시에 자동으로 import java.lang.*; 추가됨
 */

// 클래스 작성부 : 클래스명이 바로 파일명임
public class Example {
	//클래스 시작
	
	// main() 메소드가 들어 있으면, 실해용 클래스임
	// main() 메소드가 없으면, 기능 제공용 클래스임(대부분임)
	public static void main(String[] a) { // main() 시작
		//소스 코드 구문 작성함
		
		String todayFormat = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		System.out.println(todayFormat);
	} //main() 종료
}
// 클래스 종료
