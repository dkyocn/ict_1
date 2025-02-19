package test.string;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestString {

	public static void main(String[] a) {
		// java.lang.String 클래스 사용 테스트

		// 생성자 사용 확인
		String string = new String();

		byte[] bar = new byte[] {10, 30, 50, 70, 90};
		//		String string2 = new String(bar);
		String string2 = new String(bar, StandardCharsets.UTF_8);

		char[] chAr = new char[] {'j', 'a', 'v', 'a'};
		String string3 = new String(chAr);

		String string4 = new String("apple");
		String string5 = "apple";

		StringBuilder builder = new StringBuilder("banana");
		String string6 = new String(builder);

		// 메서드 사용 확인
		// String의 hashCode()는 오버라이딩됨 : 기록된 문자열 값의 주소 리턴으로 변경됨
		System.out.println("string : " + string + ", " + string.hashCode());
		System.out.println("string 글자 개수 : " + string.length());
		System.out.println("apple".length()); // "문자열값".메서드명(....);
		// 문자열 저장소에 자동 "apple"이 기록되고 나서 발생한 주소를 가지고 length() 메서드가 실행됨

		System.out.println("string2 : " + string2);
		System.out.println("string3 : " + string3);
		System.out.println("string6 : " + string6);

		System.out.println(string6.charAt(3));
		System.out.println(string6.codePointAt(3)); // 3번 인덱스 유니코드
		System.out.println(string6.codePointBefore(3)); // 3번 인덱스 이전 유니코드
		System.out.println(string6.codePointCount(0, string6.length()));
		// beginIndex 포함 , endIndex 제외

		System.out.println(string6.compareTo("BANANA")); // 'b' - 'B' => 98 - 66 => 32 > 0 : 앞 문자열이 크다  
		System.out.println(string6.compareTo("banana")); // 'b' - 'b' => 98 - 98 => 마지막 글자까지 확인 == 0 : 두 문자열이 같
		System.out.println(string6.compareTo("grape")); // 'b' - 'g' => 98 -  103 => -5 < 0 : 뒤문자열이 크다
		System.out.println(string6.compareToIgnoreCase("BANANA"));

		System.out.println("yellow-".concat(string6));

		String personID = "951225-1234567";

		String syear = personID.substring(0, 2);
		String smonth = personID.substring(2, 4);
		String sday = personID.substring(4, 6);
		String sgender = personID.substring(7, 8);

		/*
		 *  String -> 기본 자료형으로 바꾸는 것 : 파싱(parsing)
		 *  String -> int : "123" => 123 : Integer
		 *  String -> double : "34.5" => 34.5 : Double
		 *  String -> boolean : "false" => false : Boolean
		 *  기본자료형에 대한 클래스 ㅣ 래퍼(Wrapper) 클래스라고 함 => 각 래퍼 클래스에 파싱메서드가 제공됨
		 */
		int year = Integer.parseInt(syear);
		int month = Integer.parseInt(smonth);
		int day = Integer.parseInt(sday);
		int gender = Integer.parseInt(sgender);

		System.out.println("생년월일 : " + (1900 + year) + "년 " + month + "월 " + day + "일");
		System.err.println("성별: " + (gender == 1 || gender == 3 ? "남자" : "여자"));

		// 나이 계산
		Date today = new Date();
		System.out.println(today);

		// 추출한 생년월일을 가지고 날짜 객체 만들기 함
		GregorianCalendar calendar = new GregorianCalendar(year, month, day);

		System.out.println("나이 : " + (today.getYear() - calendar.get(Calendar.YEAR)));

		Solution solution = new Solution();
		int[][] test = solution.solution(4);
		for (int[] arr : test) {
			for (int ar : arr) {
				System.out.println(ar);
			}
			System.out.println();
		}
	}
}

class Solution {
	public int[][] solution(int n) {
		int[][] answer = {};
		answer = new int[n][n];
		int i = 0;
		int j = 0;
		int loop = 1;
		int count = 0;
		do {
			i = count;
			j = count;

			for (j = count; j < (n - count); j++) {
				answer[i][j] = loop;
				loop++;
			}
			j--;

			for (i = count + 1; i < (n - count); i++) {
				answer[i][j] = loop;
				loop++;
			}
			i--;

			for (j = (n - count) - 2; j >= count; j--) {
				answer[i][j] = loop;
				loop++;
			}
			j++;

			for (i = (n - count) - 2; i >= count; i--) {
				if (answer[i][j] != 0) {
					break;
				}
				answer[i][j] = loop;
				loop++;
			}
			i++;

			count++;

			if (loop >= (n * n)) {
				answer[count][count] = loop;
				break;
			}
		} while (true);
		return answer;
	}
}
