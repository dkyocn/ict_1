package com.api;

import java.util.Calendar;

public class TestWork1 {

	public static void main(String[] a) {
		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int weekDay = calendar.get(Calendar.DAY_OF_WEEK);

		String week = new String();

		switch (weekDay) {
			case 1:
				week = "월";
				break;
			case 2:
				week = "화";
				break;
			case 3:
				week = "수";
				break;
			case 4:
				week = "목";
				break;
			case 5:
				week = "금";
				break;
			case 6:
				week = "토";
				break;
			case 7:
				week = "일";
				break;
		}

		System.out.println((1900 + year) + "년 " + month + "월 " + day + "일 " + week + "요일");
	}

}
