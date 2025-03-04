package test.operator.sample;

/**
 * 비트 연산자: 메모리 변수공간에 기록된 비트값 (2진수: 2로 나눈 나머지로 표현되는 수, 0,1)을 다루는 연산자임
 * 단, 자바는 메모리를 직접 손 댈 수 없음 => 비트연산자 큰 의미 없음
 * 비트 연산자는 정수에만 사용할 수 있음
 * ~(틸드, tield) : 비트 반전 연산자, 단항연산자(2순위),  bit 1 => bit 0, bit 0 => bit 1 로 바꾸는 연산자
 * 			정수의 1의 보수를 구할 수 있음
 * <<,>>,>>>(자바에서만 제공): 쉬프트 연산자, 이항연산자(5순위)
 * 			정수 << 자리이동값, 정수 >> 자리이동값, 정수 >>> 자리이동값
 * 			기록된 정수의 비트값을 왼쪽 또는 오른쪽으로 자리 이동시킴
 * 			왼쪽으로 이동 시 오른쪽 빈칸은 양수/음수 상관없이 bit 0을 채움
 * 			오른쪽으로 이동 시 왼쪽 빈칸은 >> 는 부호비트를 채움(0:양수, 1:음수)
 * 			오른쪽으로 이동 시 왼쪽 빈칸은 >>> 는 무조건 0 채움
 * &(and, 8순위), ^(xor, 9순위), |(or, 10순위) : 비트 논리 연산자(이항연산자)
 * 정수 & 정수 : 두 정수의 각 자리의 비트값들이 연산됨, 둘 다 1이면 1, 나머지는 모두 0임
 * 정수 ^ 정수 : 두 비트가 같으면 0, 다르면 1임
 * 정수 | 정수 : 둘 중 하나만 1이면 1임, 둘 다 0이면 0임
 */
public class BitOperator {

	// public (공개) : 패키지 안/밖 다른 클래스에서 사용 가능
	public void testBit() {
		int a = 12;
		int b = 20;
		
		// 클래스 안의 멤버들까리는 그냥 이름으로 호출
		printBit(a); // 메서드 사용 시 괄호 안에 변수 사용은, 해당 메서드로 변수의 값을 전달한다는 의미
		printBit(~a); // 해당 정수의 1의 보수를 구함
		// 정수의 0의 보수를 구할 때는 
		printBit(~a+1);
		
		printBit(b);
		printBit(b >> 2); // 메모리에 기록된 비트 전체를 오른쪽으로 2칸 자리이동 (2의 자리이동제곱의 나누기 결과) 
		printBit(b << 3); // 메모리에 기록된 비트 전체를 왼쪽으로 3칸 자리이동( 2의 자리이동제곱의 곱하기 결과
		//자바는 쉬프트연산자를 산술연산으로 사용하고 있음
		
		// >>> : 자바에서 추가된 연산자임, 비트 오른쪽으로 자리이동은 동일
		// 		비어지는 왼쪽에 양수/ 음수 상관없이 무조건 0채움
		
		int c = -20;
		printBit(c);
		printBit(c >> 3); // 비어있는 왼쪽 부호비트 채움
		printBit(c >>> 3); // 비어있는 왼쪽 무조건 0 채움 (음수가 양수로 바뀜)
		
		printBit(a);
		printBit(b);
		System.out.println("----------------------------------------------");
		printBit(a & b); // 두 정수의 최대공약수 구함
		printBit(a ^ b); // 두 비트가 다르면 1, 같으면 0 
		printBit(a | b);
	}
	
	// 메모리의 비트 (0,1)을 정수 0 또는 1로 만들어서 출력
	// private (비공개) : 작성된 클래스 안에서 사용할 수 있음, 클래스 밖에서는 사용 불가능
	private void printBit(int num) {
		System.out.printf(num+" : ");
		
		for(int i=31; i>=0; i--) {
			System.out.print(num >> i & 1); // bit 1을 정수 1로 bit 0 을  정수 0으로 바꿈
		}
		System.out.println();
	}
	
	
}
