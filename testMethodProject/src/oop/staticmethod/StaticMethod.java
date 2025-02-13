package oop.staticmethod;

public class StaticMethod {

	private static String value;

	public StaticMethod(String value) {
		this.value = value;
	}

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticMethod.value = value;
	}

	// value 필드 값을 모두 대문자로 바꾸는 static 메소드
	public static void toUpper() {
		setValue(value.toUpperCase());
	}

	// value 필드에서 전달받은 인덱스 위치의 값을 전달받은 문자로 변경하는 static 메소드
	public static void setChar(int index, char ch) {

		StringBuilder builder = new StringBuilder(value);

		builder.setCharAt(index, ch);
		setValue(builder.toString());

	}

	// value 필드에 기록된 글자갯수 리턴 처리
	public static int valueLength() {
		return value.length();
	}

	// 문자열값을 전달받아, value 필드값과 하나로 합쳐서 리턴 처리
	public static String valueConcat(String str) {
		setValue(value.concat(str));
		return value;
	}
}
