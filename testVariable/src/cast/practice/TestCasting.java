package cast.practice;

public class TestCasting {

	public static void main(String[] args) {
		// [형변환 실습]
		CastingSample cast = new CastingSample();
		
//		// [실습 1]
//		System.out.println("[실습 1]");
//		cast.printUniCode();
//		// [실습 2]
//		System.out.println("\n\n[실습 2]");
//		cast.calculatorScore();
//		// [실습 3]
//		System.out.println("\n\n[실습 3]");
//		cast.printBitCount();
//		// [자동형변환]
//		System.out.println("\n\n[자동형변환]");
//		cast.autoCasting();
//		// [강제형변환]
//		System.out.println("\n\n[강제형변환]");
//		cast.testCasting();
		// [byte,short 연산]
		System.out.println("\n\n[byte,short 연산]");
		cast.testCasting2();
		// [int -> char 형변환]
		System.out.println("\n\n[int -> char 형변환]");
		cast.testUnicode();
	}

}
