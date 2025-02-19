package test.abst;

/**
 * interface : 
 * 추상메서드만 맴버로 가지는 추상클래스의 변형
 * 메서드의 사용 표준을 제시하기 위한 목적의 클래스임
 * => 강제 오버라이딩으로 메서드 사용에 대한 규칙을 강제화하는 것이 목적
 */
public interface Grade {

	/*
	 *  public abstract 반환자료형 메서드명([자료형 매개변수, 자료형 매개변수,....]);
	 *  인터페이스 안에서 선언되는 메서드는 모두 public abstract 이므로 public abstract 를 생략할 수 있음
	 *  후손클래스에서 강제 오버라이딩 시 반드시 public 표기해야 함 ( 생략하면 default 임 => 접근제한자 범위가 좁게 변경됨)
	 */
	/*public abstract*/ char getGrade(int score);
}
