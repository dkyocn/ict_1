package test.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {

	public long getDays() {

		long sumDays = 0L;
		Calendar today = new GregorianCalendar();

		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DAY_OF_MONTH);

		for (int i = 1; i <= year; i++) {
			if (isLeapYear(year)) {
				sumDays += 366;
				sumDays += sumDay(i, year, month);
			} else {
				sumDays += 365;
				sumDays += sumDay(i, year, month);
			}

		}

		return sumDays + day;
	}

	public boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 && year % 400 == 0 ? true : false;
	}

	public long sumDay(int i, int year, int month) {
		long result = 0L;

		if (i == year) {
			for (int j = 1; j < month; j++) {
				switch (j) {
					case 2:
						result += isLeapYear(year) ? 29 : 28;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						result += 30;
						break;
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						result += 31;
						break;
				}
			}

		}

		return result;
	}

}
