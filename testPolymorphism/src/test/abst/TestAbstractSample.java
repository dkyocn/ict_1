package test.abst;

public class TestAbstractSample {

	public static void main(String[] a) {

		// abstract class test
		// 추상 클래스 레퍼런스변수는 만들 수 있음

		AbstractSample abstractSample;

		// 추상(미완성) 클래스는 객체 생성 못함
		//		abstractSample = new AbstractSample();

		java.util.Calendar today; // 후손 객체의 주소 저장용임 (다형성 이용함)
		//		today = new java.util.Calender();
		today = new java.util.GregorianCalendar();
		System.out.println(today); // today.toString() 과 같음, Calendar의 오버라이딩 된 toString() 실행됨

		abstractSample = new SubClass();

		abstractSample.abstMethod(); // 메서드 사용 규칙의 표준화

		abstractSample = new SubClass2();

		abstractSample.abstMethod(); // 메서드 사용 규칙의 표준화
	}
}
