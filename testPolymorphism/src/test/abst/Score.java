package test.abst;

/**
 * 클래스가 인터페이스를 상속받을 때는 implements 사용함
 * 클래스 상속은 1개만 가능 (단일 상속만 허용)
 * 인터페이스 상속은 여러 개 가능 (다중 상속 허용)
 * 
 * 인터페이스를 상속받으면, 인터페이스가 가진 추상메서드를 상속받게 되므로 반드시 오버라이딩해야 함
 */
public class Score implements Calculator, Grade {

	@Override
	public char getGrade(int score) {
		char result;

		if (score >= 90)
			result = 'A';
		else if (score >= 80)
			result = 'B';
		else if (score >= 70)
			result = 'C';
		else if (score >= 60)
			result = 'D';
		else
			result = 'F';

		return result;
	}

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		int result = 0;

		if (a != 0 && b != 0) {
			result = a / b;
		}
		return result;
	}

	@Override
	public int mod(int a, int b) {
		int result = 0;

		if (a != 0 && b != 0) {
			result = a % b;
		}
		return result;
	}

}
