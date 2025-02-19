package test.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
// import java.sql.Date; // 패키지명 다름, 클래스명 같음, 둘 다 import 못함

public class TestDate {

	public static void main(String[] args) {
		// 날짜, 시간, 처리용 클래스 사용 테스트 java.util 패키지 제공
		Date today = new Date();
		java.sql.Date date2 = new java.sql.Date(today.getTime());

		System.out.println(today); // java.lang.Object의 toString() 오버라이딩 함
		System.out.println(date2); // java,util.Date의 toString() 오버라이딩 함

		/*
		 * abstract 클래스는 객체 생성 못 함 : new 생성자(...) 사용 못 한다는 의미임
		 * 직접 new는 못하는 대신에, 객체를 생성해서 리턴해 주는 메서드가 일반적으로 제공이 됨
		 */
		Calendar today2 = Calendar.getInstance();
		System.out.println(today2);

		GregorianCalendar today3 = new GregorianCalendar();
		System.out.println(today3);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy'년' MM'월' dd'일' HH'시' mm'분' ss'초' E'요일'");
		String string = dateFormat.format(today);
		System.out.println(string);

		// Calendar 타입으로 format을 적용한다면
		System.out.println(dateFormat.format(today3.getTime()));
	}

}
