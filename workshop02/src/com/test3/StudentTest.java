package com.test3;

public class StudentTest {

	public static void main(String[] args) {

		Student studentArry[] = new Student[3];
		
		studentArry[0] = new Student("홍길동", 15, 170, 80);
		studentArry[1] = new Student("한사람", 13, 180, 70);
		studentArry[2] = new Student("임걱정", 16, 175, 65);
		
		double ageSum = 0.0;
		double heightSum = 0.0;
		double weightSum = 0.0;
		
		System.out.println("이름\t나이\t신장\t몸무게");
		for(Student student : studentArry) {
			System.out.println(student.studentInfo());
			
			ageSum += student.getAge();
			heightSum += student.getHeight();
			weightSum += student.getWeight();
		}
		
		System.out.println();
		System.out.printf("나이 평균: %.3f",ageSum/3);
		System.out.printf("\n신장 평균: %.3f",heightSum/3);
		System.out.printf("\n몸무게 평균: %.3f",weightSum/3);

		Student student = studentArry[0];
		
		for(int i = 0; i<3; i++) {
			if(student.getAge() < studentArry[i].getAge()) {
				student = studentArry[i];
			}
		}
		
		System.out.println();
		System.out.println("\n나이가 가장 많은 학생: "+ student.getName());
		
		student = studentArry[0];
		for(int i = 0; i<3; i++) {
			if(student.getAge() > studentArry[i].getAge()) {
				student = studentArry[i];
			}
		}
		
		System.out.println("나이가 가장 적은 학생: "+ student.getName());
		
		student = studentArry[0];
		for(int i = 0; i<3; i++) {
			if(student.getHeight() < studentArry[i].getHeight()) {
				student = studentArry[i];
			}
		}
		
		System.out.println("신장이 가장 큰 학생: "+ student.getName());
		
		student = studentArry[0];
		for(int i = 0; i<3; i++) {
			if(student.getHeight() > studentArry[i].getHeight()) {
				student = studentArry[i];
			}
		}
		
		System.out.println("신장이 가장 작은 학생: "+ student.getName());
		
		student = studentArry[0];
		for(int i = 0; i<3; i++) {
			if(student.getWeight() < studentArry[i].getWeight()) {
				student = studentArry[i];
			}
		}
		
		System.out.println("몸무게가 가장 많이 나가는 학생: "+student.getName());
		
		student = studentArry[0];
		for(int i = 0; i<3; i++) {
			if(student.getWeight() > studentArry[i].getWeight()) {
				student = studentArry[i];
			}
		}
		
		System.out.println("몸무게가 가장 적게 나가는 학생: "+student.getName());
	}

}
