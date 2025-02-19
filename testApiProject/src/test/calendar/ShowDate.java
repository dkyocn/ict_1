package test.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ShowDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = new GregorianCalendar();
		DateCalculator totalDay = new DateCalculator();

		System.out.println("올해는 " + (totalDay.isLeapYear(today.get(Calendar.YEAR)) ? "윤년" : "평년"));

		long total = totalDay.getDays();
		System.out.println("총 날짜 수: " + total);
	}

}
