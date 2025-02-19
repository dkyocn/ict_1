package test.object;

import java.util.Objects;

public class TestObject {

	public static void main(String[] args) {
		// Object 메서드 오버라이딩 테스트
		Book book = new Book("자바 정복");
		Book book2 = book; // 주소 복사

		boolean result = book2.equals(book);
		System.out.println(result);

		result = book.equals(null);
		System.out.println(result);

		Book book3 = (Book)book.clone(); // 리턴타입이 Object 임 >> Book에 대입하려면 형 변환해야 함
		System.out.println("book3 : " + book3 + ", " + book3.hashCode());
		System.out.println("book : " + book + ", " + book.hashCode());
	}

}

/**
 * 자바 언어로 만들어지는 모든 클래스는 자동 java.lang.Object 클래스의 후손이다.
 * 모든 클래스들은 Object가 제공하는 메서드를 자동 상속받았으므로, 자신의 메서드처럼 사용할 수 있다.
 * 필요 시 Object 클래스의 메서드를 오버라이딩해서 사용할 수 있다.
 * toString(), equals(), hashCode(), clone() 주로 오버라이딩 됨
 * notify(), wait() 멀티 스래드 프로그래밍에서 이용하는 메서드이다.(일반 자바 프로그램은 싱글 스레드임, 사용 필요없음)
 */
class Book {

	private String title;

	public Book() {
		super();
	}

	public Book(String title) {
		super();
		this.title = title;
	}

	// Setter & Getter
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	// Object 의 toString() 오버라이딩 : this가 참조하는 객체 인스턴스 안의 필드 값들을 하나의 문자열로 합치기해서 리턴 처리
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	//	@Override
	//	public int hashCode() {
	//		// 원래 기능 : return this.hash
	//		return Objects.hash(title); 
	//	}

	@Override
	public boolean equals(Object obj) {
		// 원래 기능 : return this == obj
		// 두 객체 안의 필드 값들이 일치하는지 확인하는 코드로 내용 수정함
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		/*
		 *  obj에 대해 null을 검사하는 코드가 없다면 obj.getClass() 에러가 발생할 수 있다.(NPE)
		 *  메서드 실행 시 null.메서드()로 실행되면 NPE 발생
		 *  null.getClass() 실행이 되므로, 에러 발생
		 */
		if (this.getClass() != obj.getClass())
			return false;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book)obj;
		return Objects.equals(this.title, other.title);
	}

	@Override
	public Object clone() {
		// 새 객체를 만들면서, this가 참조하는 인스턴스 변수 값을 복사해서 내용이 똑같은 복제품 만들기
		return new Book(this.title);
	}

}
