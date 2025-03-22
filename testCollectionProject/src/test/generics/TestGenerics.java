package test.generics;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import practice2.Book;

public class TestGenerics {

	public static void main(String[] args) {
		// 컬랙션 클래스들은 여러 종류의 객체들을 저장할 수 있다.
		List list = new ArrayList();

		list.add(new String("java"));
		list.add(new Book());
		list.add(new Date());

		System.out.println(list);

		// 저장 후 하나씩 꺼내서 사용하려고 할 때, 기본 Object 타입으로 추출됨
		for (Object object : list) {
			/*
			 * Object 클래스가 가진 메서드를 후손들이 오버라이딩한 경우라면
			 * toString(), equals(), clone() 메서드 사용일  경우에는
			 * 부모 타입의 레퍼런스로 메서드 실행하면, 오버라이딩한 후손의 메서드가 실행됨 (형변환 안해도 됨)
			 * 동적 바인딩 (late binding) 이라고 함
			 */
			System.out.println(object.toString());

			/*
			 * 만약, 각 후손클래스가 메서드를 실행시켜야 할 경우 (부모 것이 아닌 후손 것)
			 * 해당 후손 클래스 타입으로 형변환해야 함 : 다운 캐스팅
			 * 컬랙션에 저장된 여러 종류의 객체들에 적용한다면, 다운캐스팅시에 타입을 확인하고 형변환해야 함
			 * 래퍼런스 instanceof 클래스 타입 사용함
			 */
			if (object instanceof String) {
				System.out.println(((String)object).toUpperCase());
			}

			if (object instanceof Book) {
				System.out.println(((Book)object).getTitle());
			}

			if (object instanceof Date) {
				System.out.println(new SimpleDateFormat("yyyy'년' MM'월' dd'일' E").format((Date)object));
			}
		}

	}

}
