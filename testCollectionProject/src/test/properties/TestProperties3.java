package test.properties;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import practice2.Book;

public class TestProperties3 {

	public static void main(String[] args) {
		// books.txt 파일의 내용을 읽어서, Book 객체에 옮겨 저장 처리
		/*
		 *  객체들을 ArrayList에 저장하고 출력 확인
		 *  읽은 문자열을 ','를 이용해서 값들을 분리한 다음
		 *  각 값들을 자료형에 맞춰 변환해서 객체에 저장 처리함
		 */

		Properties properties = new Properties();
		ArrayList<Book> bookList = new ArrayList<Book>(); // Book 객체만 저장할 수 있게 됨
		// 저장하는 객체의 타입에 제한을 설정함 : 제네릭스의 목적임 => 컬렉션의 한 종류의 객체만 저장하게 하는 것

		try {
			properties.load(new FileReader("books.txt"));
			properties.list(System.out); // 확인 출력

			// properties가 가진 문자열 값들을 이용해서 연속으로 Book 객체로 바꿔서 리스트에 저장 처리
			Iterator<String> keyIter = properties.stringPropertyNames().iterator();
			while (keyIter.hasNext()) {
				String[] values = properties.getProperty(keyIter.next()).split(",");
				bookList.add(new Book(values[0], Integer.parseInt(values[1]), values[2], values[3]));
			}

			// 확인 출력
			// 제네리스로 타입을 정한 컬렉션의 객체를 추출하면 Object가 아니고,
			// 지정한 클래스 타입의 객체로 추출됨 : 형 변환 필요없음
			for (Book book : bookList) {
				System.out.println(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
