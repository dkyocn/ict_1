package com.oop.model.vo;

public class Employee {

	private int empNo; // 사번
	private String empName; // 이름
	private String dept; // 소속부서
	private String job; // 직급
	private int age; // 나이
	private char gender; // 성별
	private int aslary; // 급여
	private double bonusPoint; // 보너스 포인트
	private String phone; // 핸드폰
	private String address; // 주소

	public Employee() {

	}

	public Employee(int empNo, String name) {
		this.empNo = empNo;
		this.empName = name;
	}

	public Employee(int empNo, String name, String dept, String job, int aslary) {
		this.empNo = empNo;
		this.empName = name;
		this.dept = dept;
		this.job = job;
		this.aslary = aslary;
	}

	public Employee(int empNo, String name, int age, char gender, String phone, String address) {
		this.empNo = empNo;
		this.empName = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}

	public Employee(int empNo, String name, String dept, String job, int age, char gender, int aslary,
		double bonusPoint, String phone, String address) {
		this.empNo = empNo;
		this.empName = name;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.aslary = aslary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}

	// Getter
	public int getEmpNo() {
		return this.empNo;
	}

	public String getEmpName() {
		return this.empName;
	}

	public String getDept() {
		return this.dept;
	}

	public String getJob() {
		return this.job;
	}

	public int getAge() {
		return this.age;
	}

	public char getGender() {
		return this.gender;
	}

	public int getAslary() {
		return this.aslary;
	}

	public double getBonusPoint() {
		return this.bonusPoint;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getAddress() {
		return this.address;
	}

	// Setter
	public void setEmpNo(int empNo) {this.empNo = empNo;}

	public void setEmpName(String empName) {this.empName = empName;}

	public void setDept(String dept) {this.dept = dept;}

	public void setJob(String job) {this.job = job;}

	public void setAge(int age) {this.age = age;}

	public void setGender(char gender) {this.gender = gender;}

	public void setAslary(int aslary) {this.aslary = aslary;}

	public void setBonusPoint(double bonusPoint) {this.bonusPoint = bonusPoint;}

	public void setPhone(String phone) {this.phone = phone;}

	public void setAddress(String address) {this.address = address;}

}
