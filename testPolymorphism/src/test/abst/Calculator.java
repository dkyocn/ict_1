package test.abst;

/**
 * 인터페이스끼리 상속 시에도 extends 사용함
 * 인터페이스는 다중 상속을 허용함
 */
public interface Calculator extends java.io.Serializable, Cloneable {

	//  추상 메서드만 맴버로 가진 추상클래스 변형체임
	/*public abstract*/ int sum(int a, int b); // public abstract 표기 생략

	int sub(int a, int b); // public abstract 표기 생략

	int mul(int a, int b); // public abstract 표기 생략

	int div(int a, int b); // public abstract 표기 생략

	int mod(int a, int b); // public abstract 표기 생략 => 오버라이딩 시에 반드시 public 표기해야 함

}
