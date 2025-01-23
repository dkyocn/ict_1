package second.run;

import second.menu.TestMenu; // 현재 패키지 안에 없는 클래스(다른 패키지에 속한 클래스)

// 실행용 클래스 : main() 이 있음
public class SecondMain {
//	public static final TestMenu menu = new TestMenu();

	public static void main(String[] args) {
		// 객체지향 프로그래밍 언어들에서의 클래스 사용법
		// 클래스명 레퍼런스 변수 = new 생성자 함수();
//		TestMenu menu = new TestMenu();
		/*
		 *  클래스가 가진 메서드를 실행시키려면
		 *  레퍼런스변수.메서드명();
		 */
//		menu.displayMenu();
		
		new TestMenu().displayMenu();
	}

}
