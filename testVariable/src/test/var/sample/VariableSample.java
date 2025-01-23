package test.var.sample;

/**
 * 변수 연습을 위한 샘플 클래스
 * 변수 선언과 값 대입 및 변수 사용에 대한 예제를 제공
 * 변수 초기화와 기본(primitive) 자료형(type)에 대해 확인
 */
public class VariableSample {

	/**
	 * 기본 생성자
	 */
	public VariableSample() {};
	
	/**
	 * 변수 선언, 값 기록, 변수 사용에 대한 예제 메소드
	 */
	public void useVariable() {
		// 메소드 블럭 {} 안에서 만들어진 변수 : 지역변수(Local Variable)
		// 지역변수는 메모리(RAM)의 stack에 할당됨
		
		// 1. 변수 선언: 값 기록할 방 만들기
		// 자료형 변수명;
		int first;
		int second;
		
		// 2. 변수방에 값 기록하기 : 대입연산자(=) 사용
		// 변수명 = 기록할 값;
		first = 120;
		second = 230;
		
		//3. 변수 사용 : 변수 공간에 기록된 값의 사용을 의미
		System.out.println("첫번째 값: "+ first);
		System.out.println("두번째 값: "+ second);
		System.out.println("더하기 결과: "+ (first + second));
		
	}
	
	// 변수 초기화 테스트용 메소드
	public void initVariable() {
		// 변수 선언과 동시에 초기값 기록하는 것 : 변수 초기화
		// 초기값 : 변수방에 첫번째로 기록되는 값
		// 자료형 변수명 = 초기값;
		
		boolean yn = true;
		byte bnum = 100;
		short snum = 24;
		int age = 28;
		long pay = 3500000000L;
		float tax = .5f; // .5f == 0.5f
		double weight = 124.5; // 124.5 == 124.5d
		char level = 'A';
		
		System.out.println("yn : "+yn);
		System.out.println("bnum : "+bnum);
		System.out.println("snum : "+snum);
		System.out.println("age : "+age+" 세");
		System.out.println("급여 : "+pay+" 원");
		System.out.println("세율 : "+(tax*100)+"%");
		System.out.println("무게 : "+weight+ "kg");
		System.out.println("등급 : "+level);
		
	}
	
	// 기본 자료형 (primitive  Type)에 대한 클래스가 제공됨 : java.lang 패키지에 있음
	// 래퍼(Wrapper) 클래스라고 함
	// 기본 자료형의 메모리 할당크기(BYTES), 기록되는 비트갯수(SIZE), 최대값(MAX_VALUE), 최소값(MIN_VALUE) 등이 제공됨
	// 기본 자료형과 관련된 메서드들도 제공됨

	/*
	 * boolean => Boolean
	 * byte => Byte
	 * short => Short
	 * int => Integer
	 * long => Long
	 * float => Float
	 * double => Double
	 * char => Character
	 */
	
	public void testWrapper() {
		// 클래스에 소속된 맴버 사용 방법 1. 클래스명 레퍼런스변수 = new 생성자(); 레퍼런스.메서드(); 레퍼런스.필드명
		// 클래스에 소속된 맴버 사용 방법 2. 맴버 선언 구문에 public static이 표시되어 있으면 바로 클래스명.메서드();  클래스명.필드명
		System.out.println("int 메모리 할당 크기 : "+Integer.BYTES+ "바이트");
		System.out.println("int 기록 비트수 : "+Integer.SIZE+ "비트");
		System.out.println("int 최대값 : "+Integer.MAX_VALUE);
		System.out.println("int 최소값 : "+Integer.MIN_VALUE);
		
	}
}
