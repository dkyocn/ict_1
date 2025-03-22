package test.properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties1 {

	public static void main(String[] args) {
		// java.utill.properties 클래스 테스트
		/*
		 * Properties 클래스 : HashTable의 후손 클래스, Map 인터페이스의 후손 클래스
		 * 제네릭스(Generics) 기능이 없는 컬렉션임 : 클래스명<영문자>
		 * 이유 : 키(key)와 값(value) 객체의 자료형이 이미 정해진 클래스임 - 둘 다 String 임
		 */

		Properties properties = new Properties();
		// 사용목적 : 프로그램 구동에 필요한 설정 값들을 저장하는 용도로 많이 사용함

		properties.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		properties.setProperty("url", "jdbc.oracle.thin:@1270.0.1:1521:xe");
		properties.setProperty("user", "c##student");
		properties.setProperty("password", "student");

		System.out.println(properties);

		System.out.println(properties.get("driver"));
		String url = properties.getProperty("url");
		System.out.println(url);

		// 파일로 저장
		try {
			properties.store(new FileOutputStream("jdbc.properties"), "jdbc.connection settings");
			properties.store(new FileWriter("jdbc.txt"), "jdbc connection settings");
			properties.storeToXML(new FileOutputStream("jdbc.xml"), "jdbc connection settings");

			properties.list(System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
