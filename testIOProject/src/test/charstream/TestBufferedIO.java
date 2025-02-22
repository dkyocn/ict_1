package test.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestBufferedIO {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 *  버퍼를 이용하는 보조 스트림 사용 테스트
		 *  BufferedInputStream, BufferedOutputStream, BufferedReader, BufferedWriter
		 */

		TestBufferedIO bufferedIO = new TestBufferedIO();

		bufferedIO.fileSave();
		bufferedIO.fileRead();

	}

	public void fileSave() {

		System.out.printf("저장할 파일명 (파일명.txt): ");
		String fileName = scanner.next();

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));) {

			System.out.println(fileName + "에 저장할 내용을 입력하세요.(종료 : exit입력) : ");
			scanner.nextLine();

			String str = null;
			while (!(str = scanner.nextLine()).equals("exit")) {
				str = "\n";
				bufferedWriter.write(str);
			}

			System.out.println("\n" + fileName + " 에 저장이 완료되었습니다.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileRead() {

		System.out.printf("읽을 파일명 (파일명.txt) : ");
		String fileName = scanner.next();

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));) {

			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
