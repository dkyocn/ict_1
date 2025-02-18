package test.abst;

public class SubClass extends AbstractSample {

	@Override
	public void abstMethod() { // 메서드 사용의 강제적 통일화 (메서드 사용 규칙 강제 표준화가 목적)
		// 추상 메서드를 가진 추상 클래슬르 상속받은 후손 클래스는 반드시 상속받은 추상 메서드를 완성시켜야 함
		// 부모 추상 메서드 오버라이딩해서 소스 코드를 완성 시킴 (implemented : 재구현)
		System.out.println("abstMethod() implemented...");
	}

}
