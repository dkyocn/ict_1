package make.exception;

public class TestMyException {

	public static void main(String[] args) {
		// 사용자 정의 예외 클래스 사용 테스트
		testMakeException();
	}

	private static void testMakeException() {
		Calculator calculator = new Calculator();

		try {
			int result = calculator.sum(23, 55);
			System.out.println(result);

			//			System.out.println("sum: " + calculator.sum(23, 0));
			System.out.println("divide: " + calculator.divide(23, -5));
			System.out.println("divide: " + calculator.divide(32, 0));
		} catch (MyException e) {
			System.out.println(e.getMessage()); // 에러 메세지만 꺼내서 출력하는 메서드
			e.printStackTrace(); // 매서드 호출순서에 따라 에러를 추적해서 출력하는 메서드
		} catch (NotDivideZeroException e) {
			e.printStackTrace();
		}
	}

}

class Calculator {
	public Calculator() {

	}

	/**
	 * 정수 두 개를 전달받아 더하기한 결과를 리턴하는 메서드
	 * 단, 두 정수 모두 1 ~ 100 사이의 값이어야 함
	 * 해당 범위의 값이 아니면 MyException 예외 발생시킴
	 * @throws MyException 
	 */

	public int sum(int a, int b) throws MyException {

		int result = 0;

		if (a >= 1 && a <= 100 && b >= 1 && b <= 100) {
			result = a + b;
		} else {

			// 예외 발생시킴 : throw new 발생시킬 에외 클래스 생성자 ("에러메세지");
			throw new MyException("1 ~ 100 사이의 범위 숫자가 아닙니다.");
			// 예외 발생시킨 경우에는 throws 처리함
		}

		return result;
	}

	/**
	 * 두 개의 정수를 전달받아서, 첫번째 수 / 두번째 수 계산 결과를 리턴하는 메서드
	 * 나눌 수(두번째 정수)가 0이면 예외 발생
	 * @throws NotDivideZeroException 
	 */

	public int divide(int a, int b) throws NotDivideZeroException {
		int result = 0;

		if (b != 0) {
			result = a / b;
		} else {
			throw new NotDivideZeroException("ERROR : 0이 아닌 숫자 입력");
		}

		return result;
	}
}
