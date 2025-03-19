package test.map;

public interface FMap {
	// 싱수 필드를 맴버로 가질 수 있음
	// public static final 자료형 필드명 = 초기값;

	// 추상메서드로만 맴버를 가질 수 있음
	// [public abstract] 반환 자료형 메서드명(자료형 매개변수,...);

	// 내부(Nested) 인터페이스를 가질 수도 있음 : 맴버로 봐야 함
	// 접근제한자 [static] interface 인터페이스명 {추상 메서드 선언}
	public static interface FEntry {
		// 상수 필드
		// 추상 메서드 선언
	}
}
