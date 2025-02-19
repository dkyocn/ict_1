package test.string;

import java.util.StringTokenizer;

public class StringSample {

	/**
	 * 자바에서는 문자열 값을 취급하도록 java.lang.String 클래스가 제공됨
	 * String 클래스만 예외적으로 기본 자료형 변수처럼 사용할 수 있도록 제공
	 * 자료형 변수명 = 값;
	 * 
	 * 클래스 사용법 : 클래스타입 레퍼런스 변수 = new 클래스 생성자();
	 * 클래스가 제공하는 메서드 사용법 : [자료형 변수 = ] 레퍼런스.메서드(전달값, ...);
	 * 
	 * String 레퍼런스 변수 = new String("초기값");
	 * String 레퍼런스 변수 = "문자나열 값";
	 */
	public void usedString() {
		String string = new String("test string"); // 클래스 사용법
		System.out.println("string : " + string + ", 문자열이 기록된 위치 : " + string.hashCode());

		String str = "test String"; // 기본 자료형 변수 처럼  사용할 수 있음 (String 만 가능함)
	}

	/**
	 * 자바에서 다루는 문자열은 jvm에 의해서 동적메모리 heap에 문자열 저장소가 따로 관리되고 있음
	 * 문자열 저장소는 같은 문자열 두 번 기록하지 않음 => 같은 문자열 값이 기록이 들어오면 기존 문자열의 위치를 리턴
	 * 문자열 저장소에 한번 기록된 문자열 값은 변경 불가능(수정 불가능 : Immutable)
	 */
	public void checkLiteralPool() {
		String str = "test literal pool";
		System.out.println(str + ", " + str.hashCode());

		String ttr = "test literal pool";
		System.out.println(ttr + ", " + ttr.hashCode());

		System.out.println("주소가 같은가? " + (str == ttr));
		System.out.println("문자열이 같은가? " + str.equals(ttr));
	}

	/**
	 * String은 immutable
	 * 문자열 저장소에 기록된 문자열값은 변경할 수 없다.
	 */
	public void immutableString() {
		String string = "test java String"; // 문자열 값은 문자열 저장소에 기록되고, string0에는 주소가 저장됨
		System.out.println("str: " + string + ", 위치 : " + string.hashCode());

		String result = string.toUpperCase(); // string이 참조하는 문자열 값을 대문자로 변환함
		/*
		 *  string이 참조하는 위치에 가서 cpu가 문자열 값을 읽어가서 cpu 연산장치 안에서 대문자 변환처리 함
		 *  대문자로 바꾼 문자열을 cpu가 문자열 저장소에 기록하고 발생한 주소를 리턴
		 *  String에 문자열 조작을 하면, 변경된 문자열값을 메모리에 새로 기록저장함(새로운 할당이 발생함)
		 *  메모리 사용량이 늘어나게 됨 => 문자열 조작 작업에는 String 이 적합하지 않음 
		 *  문자열 조작 시 에는 java.lang.StringBuffer, StringBuilder 클래스가 제공됨
		 *  	=> 별도의 문자열 기록 장소(버퍼)
		 *  를 만들어서 기록하고, 문자열을 직접 조작함 (새로운 할당이 없음, 기존 문자열을 변경함)
		 */

		System.out.println("result : " + result + ", 기록위치 : " + result.hashCode());
		System.out.println("str: " + string + ", 위치 : " + string.hashCode());
	}

	/**
	 * java.lang.StringBuilder 클래스 :
	 * 문자열 값의 조작(추가, 삭제, 변경) 작업이 필요하면, String을 StringBuffer | StringBuilder로 바꿈
	 * 문자열 저장소를 사용하지 않고 별도의 메모리 공간을 만들어서 문자열을 기록함
	 * 기록ㄷ된 문자열 자체를 조작함
	 */
	public void usedStringBuilder() {
		String s = "java string";
		StringBuilder sb = new StringBuilder(s); // == new StringBuilder("java string"); 
		// String => StringBuilder로 바꿈

		System.out.println("s : " + s.toString() + ", " + s.hashCode());
		System.out.println("sb : " + sb.toString() + ", " + sb.hashCode());

		System.out.println("sb capacity : " + sb.capacity()); // 기본 16글자 저장 + 추가된 글자수

		StringBuilder result = sb.delete(6, 8);
		System.out.println("sb : " + sb.toString() + ", " + sb.hashCode());
		System.out.println("result : " + result.toString() + ", " + result.hashCode());

		// StringBuilder 에 기록된 문자열을 char[] 에 복사해 넣을 경우
		char[] chAr = new char[10];
		sb.getChars(0, 3, chAr, 0);

		for (int i = 0; i < chAr.length; i++) {
			System.out.println(i + " : " + chAr[i]);
		}

		System.out.println("sb가 참조하는 문자열 안에 s문자의 기록 순번: " + sb.indexOf("s"));
		System.out.println("sb가 참조하는 문자열 안에 ing문자의 기록 순번: " + sb.indexOf("ing"));

		result = sb.insert(0, "mutable!");
		System.out.println("sb : " + sb.toString() + ", " + sb.hashCode());
		System.out.println("result : " + result.toString() + ", " + result.hashCode());

		result = sb.replace(6, sb.length(), "String");
		System.out.println("sb : " + sb.toString() + ", " + sb.hashCode());
		System.out.println("result : " + result.toString() + ", " + result.hashCode());

		result = sb.reverse();
		System.out.println("sb : " + sb.toString() + ", " + sb.hashCode());
		System.out.println("result : " + result.toString() + ", " + result.hashCode());

		sb.setCharAt(6, 's');
		System.out.println("sb : " + sb.toString() + ", " + sb.hashCode());
		System.out.println("result : " + result.toString() + ", " + result.hashCode());

		// StringBuilder => String
		String str = sb.toString();
		System.out.println(str);
	}

	public void usedSplit() {
		//		String s = "java linux oracle html css javascript jquery jsp servlet spring mybatis";
		//		String[] strings = s.split(" ");

		String s = "java,linux,oracle,html,css,javascript,jquery,jsp,servlet,spring,mybatis";
		String[] strings = s.split(",");

		System.out.println("분리된 문자열 개수 : " + strings.length);

		for (String a : strings) {
			System.out.println(a);
		}
	}

	public void usedStringTokenizer() {
		//		StringTokenizer stringTokenizer = new StringTokenizer(
		//			"java linux oracle html css javascript jquery jsp servlet spring mybatis");

		StringTokenizer stringTokenizer = new StringTokenizer(
			"java,linux,oracle,html,css,javascript,jquery,jsp,servlet,spring,mybatis", ",");

		System.out.println("분리된  문자열(토큰) 개수 : " + stringTokenizer.countTokens());

		while (stringTokenizer.hasMoreTokens()) {
			String string = stringTokenizer.nextToken();
			System.out.println(string);
		}
	}

}
