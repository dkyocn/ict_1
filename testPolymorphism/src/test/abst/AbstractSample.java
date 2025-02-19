package test.abst;

/**
 * abstract class (추상 클래스) : 미완성 클래스
 * 객체 생성 못함 (new 생상지([초기값,초기값,...]) 사용 못함)
 * 레퍼런스 변수 선언은 가능함 ( 추상 크래스명 레퍼런스변수;) => 후손 객체의 주소 저장용이 됨 ( 다형성 이용시)
 * 
 * 상속의 강제화가 목적임 (강제적으로 반드시 상속받아서 작업하게 할 목적)
 */
public abstract class AbstractSample {

	private int value;

	/*
	 *  추상 클래스는 생성자가 제공이 되어도, 객체 생성을 못함
	 *  후손 클래스의 생성자에서 super() 에 의해 실행되기 위해 준비하는 것임
	 *  즉, 후손 클래스의 생성자 안에서만 실행 호출이 되는 것이므로 protected 접근제한자 주로 지정
	 *  protected : 상속 안하면 default(package private 패키지 안)와 같음, 상속이 되면 패키지 안 + 후손 클래스 안
	 */
	protected AbstractSample() {
		super();
	}

	protected AbstractSample(int value) {
		super();
		this.value = value;
	}

	/*
	 * 추상 메서드 (abstract method)
	 * 메서드 선언(메서드 헤드, signature)만 하고, 메소드 구현부가 없는 메서드
	 * 
	 * 접근제한자 abstract 반환자료형 메서드명(자료형 매개변수, 자료형 매개변수, .....);
	 * 
	 * 클래스 안에 추상 메서드가 있으면, 반드시 class 앞에 abstract 표기해야 함
	 * 
	 * 추상메서드 사용 목적 :
	 * 메서드 사용 규칙의 강제화 (메서드 사용 표준화가 목적임)
	 */
	public abstract void abstMethod();

	// Getter & Setter

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "AbstractSample [value=" + value + "]";
	}

}
