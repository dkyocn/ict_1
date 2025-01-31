package test.operator.sample;

/**
 *  대입 연산자(assignment operator) 테스트용 클래스
 *  우선 순위는 14순위
 *  [자료형] 변수명 = 계산식; <= 모든 계산이 끝난 다음에 변수에 대입 처리가 됨
 *  또는 변수명 = 반환값이 있는 메서드(); <= 메서드가 기능 처리 후에 반환한 값을 변수에 대입
 *  
 *  순수 대입연산자 : =
 *  복합 대입 연산자(Compound Assignment Operator) : 산술대입연산자, 쉬프트대입연산자, 비트대입연산자
 *  연산자 = : +=, -=, *=, /=, %=, <<=, >>=, >>>=, &=, ^=, |=
 */
public class AssignmentOperator {
	
	/**
	 * 순수 대입연산자 테스트용 메서드
	 * 변수 = 값; 변수 = 계산식; 변수 = 레퍼런스 메서드();
	 * 오른쪽의 결과를 왼쪽 변수에 기록 저장 처리함
	 */
	public void testAssignment() {
		int x = 12;
		int y,z;
		z = y = x;
		
		int sum = x + y + z;
		System.out.println("x: "+x+", y: "+y+", z: "+z);
		System.out.println("sum: "+sum);
	}
	
	/**
	 * 산술 대입 연산자
	 * 산술연산자= 결합
	 * +=, -=, /=, %=, *=
	 */
	public void testArithmeticAssign() {
		
		int num = 10;
		System.out.println("num: "+num); // 10
		
		// 1증가: ++, 메모리 변수에 직접 연산함(연산 처리 속도가 빠름)
		++num; // num = num + 1; 결과는 같음, cpu가 변수공간의 값을 연산장치로 읽어가서 계산하고 다시 변수에 기록 처리함
		System.out.println("num: "+num); // 11
		
		// 3증가 : +=3, 메모리 변수에 직접 연산함 (연산 처리속도가 빠름)
		num += 3; // num = num + 3;
		System.out.println("num: "+num); // 14
		
		// 2감소: -=2
		num -=2;
		System.out.println("num: "+num); // 12
		
		// 4배 증가: *=4
		num *=4;
		System.out.println("num: "+num); // 48
		
		// 4배 감소: /=4
		num /=4;
		System.out.println("num: "+num); // 12
	}
}
