package com.mvc.model;

public class PayTable extends Salary implements Calculate, Output {

	public PayTable() {
		super();
	}

	public PayTable(String name, long pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}

	@Override
	public void out() {
		System.out.println(getName() + " " + getPay() + " " + getFamily() + "     " + getFamilyP()
			+ "   " + getOvertime() + "        " + getOvertimeP() + "    " + getTax() + " " + getIncentive()
			+ "       " + getIncenP() + " " + getTotalPay());
	}

	@Override
	public void calc() {

		// 가족수당 : 가족이 3명 미만이면 가족수 *20000, 3명 이상이면 무조건 60000
		if (getFamily() >= 3) {
			setFamilyP(60000);
		} else {
			setFamilyP(getFamily() * 20000);
		}

		// 시간외수당 : 시간외근무 * 5000
		setOvertimeP(getOvertime() * 5000);

		// 세금 : 기본급의 10%
		setTax((long)(getPay() * 0.1));

		// 성과금 : 인센티브 * 기본급
		setIncenP((long)(getIncentive() * getPay()));

		// 실수령액 : 기본급 + 가족수당 + 성과금 + 시간외수당 - 세금
		setTotalPay(getPay() + getFamilyP() + getIncenP() + getOvertimeP() - getTax());
	}

}
