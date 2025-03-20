package test.properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties2 {

	public static void main(String[] args) {
		// 파일로부터 데이터 읽어오기

		Properties properties1 = new Properties();
		Properties properties2 = new Properties();
		Properties properties3 = new Properties();

		try {
			properties1.load(new FileInputStream("jdbc.properties"));
			properties2.load(new FileReader("jdbc.txt"));
			properties3.loadFromXML(new FileInputStream("jdbc.xml"));

			properties1.list(System.out);
			properties2.list(System.out);
			properties3.list(System.out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
