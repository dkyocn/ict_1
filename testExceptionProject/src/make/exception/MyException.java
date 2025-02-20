package make.exception;

/**
 * 사용자 정의 예외클래스 만드는 방법:
 * 1. 반드시 java.lang.Exception을 상속
 * 2. 에외 발생 시 처리할 에러 메세지를 부모 생성자로 전달 처리
 * 3. 메서드는 상속받은 부모 클래스 것을 사용 (에러 추적 출력 기능)
 */
public class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}
}
