package test.abst;

public class TestScore {

	public static void main(String[] a) {
		Score score = new Score();
		testPolymorphism(score); // 전달인자(argument)는 Score 타입의 주소
		testPolymorphism(new String("클래스 형변환 테스트")); // argument가  String 객체의 주소

	}

	/**
	 * 매서드의 매개변수 (parameter) 타입은 Object 레퍼런스임
	 * 매서드 실행 시 Object object = Score 객체의 주소; 전달된 것임
	 * 
	 * 자동형변환 발생함 : 상속 관계에 있는 클래스끼리는 형변환 사용할 수 있음
	 * 후손이 부모타입으로 형변환 : upcasting 이라고 함 (자동 처리됨)
	 * => 부모 타입에서는 후손 맴버를 사용할 수 없음, 부모타입에서는 부모 맴버만 사용할 수 있음
	 * 원래 후손 맴버를 사용하려면, 후손 타입으로 형변환해야 함 : downCasting 이라고 함(직접 명시해야 함)
	 * => (바꿀후손클래스타입)래퍼런스
	 * => 다형성이 적용되어서 여러 후손 객체의 주소를 전달받는 메서드일 때는 무조건 하나의 클래스 타입으로 형변환하면 에러남
	 * 	  확인하고 형변환해야 함 : instanceof 연산자 사용함
	 * 	  if (레퍼런스변수 instanceof 확인할 클래스 타입){ true면 클래스형변환 처리함 }  
	 */
	public static void testPolymorphism(Object object) {

		// object는 Object 클래스의 메서드만 사용할 수 있음, 후손 매서드  사용 못함
		System.out.println(object.toString());
		//		System.out.println(object.sum(11, 22)); // error

		if (object instanceof Score) {
			Score score = (Score)object;

			System.out.println(score.sum(10, 20));
			System.out.println(score.sub(10, 20));
			System.out.println(score.mul(10, 20));
			System.out.println(score.div(10, 3));
			System.out.println(score.mod(10, 3));
			System.out.println(score.getGrade(85));
		}
	}

}
