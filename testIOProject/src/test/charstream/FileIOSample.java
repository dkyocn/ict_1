package test.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOSample {
	private Scanner scanner = new Scanner(System.in);

	public void fileSave() {

		System.out.printf("저장할 파일명 (파일명.txt): ");
		String fileName = scanner.next();

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(fileName);
			/*
			 * 대상 파일이 없으면 자동으로 파일을 새로 만들어서 스트림을 연결함
			 * 대상 파일이 있으면 파일 안의 내용을 모두 지우고 새로쓰기 상태로 해서 스트림을 연결함
			 */

			System.out.println(fileName + "에 저장할 내용을 입력하세요.: ");

			String data;
			while (!(data = scanner.nextLine()).equals("exit")) {
				fileWriter.write(data);
			}

			System.out.println(fileName + " 저장 완료!");

		} catch (IOException e) {
			System.out.println(e.getMessage());
			return;
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					//					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
		}
	}

	public void fileRead() {

		System.out.printf("읽을 파일명 : ");
		String fileName = scanner.next();

		FileReader fileReader = null;

		try {
			fileReader = new FileReader(fileName);
			// 대상 파일이 없으면 에러!!

			int data;
			while ((data = fileReader.read()) != -1) {
				System.out.print((char)data);
			}

			System.out.println(fileName + " 읽기 완료!");

		} catch (Exception e) {
			// 여러 종류의 후손 Exception 클래스의 정보를 부모 클래스인 Exception이 모두 받아서 처리하게 됨

			if (e instanceof FileNotFoundException) {
				System.out.println(fileName + " 파일이 존재하지 않습니다.");
			} else if (e instanceof IOException) {
				System.out.println(fileName + " 읽어들이는 중 에러가 발생하였습니다.");
			} else {
				System.out.println(e.getMessage());
			}

			return;
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					//					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
