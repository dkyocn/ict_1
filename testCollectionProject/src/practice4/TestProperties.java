package practice4;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class TestProperties {

	public static void main(String[] args) {
		TestProperties properties = new TestProperties();
		Student[] sr = properties.readFile();
		properties.printConsole(sr);
		properties.saveXMLFile(sr);

	}

	public Student[] readFile() {

		Properties properties = new Properties();
		ArrayList<Student> students = new ArrayList<Student>();

		try {
			properties.load(new FileReader("score.txt"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		Set<String> keys = properties.stringPropertyNames();
		Student[] students2 = new Student[keys.size()];
		Iterator<String> keyIter = keys.iterator();

		while (keyIter.hasNext()) {
			String[] values = properties.getProperty(keyIter.next()).split(",");
			int total = Integer.parseInt(values[2]) + Integer.parseInt(values[3]) + Integer.parseInt(values[4]);
			int avg = total / 3;
			students.add(new Student(Integer.parseInt(values[0]), values[1], Integer.parseInt(values[2]),
				Integer.parseInt(values[3]), Integer.parseInt(values[4]),
				total, avg));

			for (int i = 0; i < students.size(); i++) {
				students2[i] = students.get(i);
			}

		}

		return students2;

	}

	public void printConsole(Student[] sr) {

		int totalKor = 0;
		int totalEng = 0;
		int totalMat = 0;

		for (Student student : sr) {
			System.out.println(student);
			totalKor += student.getKor();
			totalEng += student.getEng();
			totalMat += student.getMat();
		}

		System.out.println("전체 국어 평균 : " + totalKor / sr.length);
		System.out.println("전체 영어 평균 : " + totalEng / sr.length);
		System.out.println("전체 수학 평균 : " + totalMat / sr.length);

	}

	public void saveXMLFile(Student[] sr) {

		Properties properties = new Properties();

		for (Student student : sr) {
			properties.setProperty(String.valueOf(student.getSno()), student.toString());
		}
		try {
			properties.storeToXML(new FileOutputStream("student.xml"), "file save", "UTF-8");

			properties.list(System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
