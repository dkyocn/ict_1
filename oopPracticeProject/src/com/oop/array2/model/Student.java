package com.oop.array2.model;

/**
 * 클래스(class) : 자료형이 다른 필드들의 묶음(배열처럼 연속 나열 할당됨) + 접근 제한 기능(데이터 보호가 목적임)
 * 캡슐화 (Encapsulation) : 필드는 반드시 private 이어야 함
 * 
 * 클래스는 용도에 따라
 * 	- 실행용 클래스 : main() 메서드 포함
 * 	- 기능 제공용 클래스 : 주로 메서드로만 구성됨, 자바가 제공하는 클래스 대부분
 * 	- 데이터 저장용 클래스 : vo(value object), do(domain object), dto(data transfer object) 로 표현함
 * 						캡슐화 적용함
 */
// 학생 정보 저장용 클래스 : vo (dto, do, entity, bean) 에 해당
public class Student {

	/*
	 *  field : 자료형 다른 변수들
	 *  접근제한자 [예약어] 자료형 변수명;
	 *  학번, 이름, 전공, 학점, 등급, 등수
	 */

	private int sno;
	private String sname;
	private String major;
	private double score;
	private String grade;
	private int rank;

	// 상수 필드 (static final field) : public 이 원칙, 대문자로 이름지음

	public static final int MAX = 5; // 생성할 수 있는 최대 객체 수

	/*
	 *  constructor (생성자) : 필드 초기화가 목적
	 *  new 할 때 힙메모리에 생성되는 객체 인스턴스 안에 할당되는 필드들 초기값 처리가 목적
	 *  접근제한자 클래스명() {} // 매개변수 없는 생성자 (기본 생성자라고 함)
	 */
	public Student() {

	}

	/*
	 *  접근제한자 클래스명(자료형 변수, 자료형 변수, ....){} // 매개변수 있는 생성자
	 *  클래스 안에 생성자 여러 개 작성할 수 있음 : 오버로딩(OverLoading, 중복 작성) 가능
	 *  오버로딩(중복 작성)의 조건 : 매개변수가 달라야 함(개수, 자료형 )
	 */
	public Student(int sno, String sname, double score) {
		// 전달 값은 필드 초기화에 사용됨
		// 필드 명 = 전달 값;
		this.sno = sno;
		this.sname = sname;
		this.score = score;

	}

	public Student(int sno, String sname, String major, double score, String grade, int rank) {
		this.sno = sno;
		this.sname = sname;
		this.major = major;
		this.score = score;
		this.grade = grade;
		this.rank = rank;

	}

	@Override
	public String toString() {
		return this.sno + ", " + this.sname + ", " + this.major + ", " + this.score + ", " + this.grade + ", "
			+ this.rank;
	}

	/*
	 * Setter : 필드 각각에 대해 값 변경을 목적으로 하는 메서드
	 * public void set 필드명( 필드의 자료형 매개변수명){this.필드 = 매개변수;}
	 */
	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	// Getter
	public int getSno() {
		return this.sno;
	}

	public String getSName() {
		return this.sname;
	}

	public String getMajor() {
		return this.major;
	}

	public double getScore() {
		return this.score;
	}

	public String getGrade() {
		return this.grade;
	}

	public int getRank() {
		return this.rank;
	}
}
