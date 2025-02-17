package oop.Inheritance.sample;

public class TestSample {

	public static void main(String[] args) {
		// 자동 Object 의 후손 클래스 확인 테스트
		// 상속이 되면 부모가 제공하는 멤버를 후손이 자신의 것처럼 사용할 수 있게 됨
		Sample sample = new Sample();

		System.out.println("sample 가 가진 위치 정보: " + sample.hashCode());
		System.out.println("sample 가 참조하는 객체 정보: " + sample.toString());

		Sample sample2 = sample; // 주소 복사

		System.out.println("sample2 가 가진 주소와 sample가 가진 주소가 같은가? " + (sample == sample2));
		System.out.println("sample2 가 가진 주소와 sample가 가진 주소가 같은가? " + (sample.equals(sample2)));
	}

}
