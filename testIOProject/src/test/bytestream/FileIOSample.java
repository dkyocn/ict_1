package test.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIOSample {

	private Scanner scanner = new Scanner(System.in);

	public void fileSave() {
		System.out.printf("저장할 파일명 (파일명.dat) : ");
		String fileName = scanner.next();

		FileOutputStream fileOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream(fileName);
			/*
			 *  대상 파일이 없으면 자동으로 파일을 만들어서 스트림을 연결함
			 *  대상 파일이 있으면 기존 내용을 지우면서 새로 쓰기 상태로 스트림을 연결
			 *  파일 자원과 바로 연결되는 스트림 클래스 : 기본 스트림 클래스라고 함
			 *  
			 *   키보드로 문자열 형태로 입력받아서 파일에 기록해 넣음 >> 반복 작동되게 함
			 *   종료는 "exit" 입력되면 반복이 끝나고 파일 저장을 완료 처리함
			 */

			System.out.println(fileName + "에 저장할 내용을 입력하세요.");
			String str = null;
			while (!(str = scanner.nextLine()).equals("exit")) {
				// 사용하는 스트림이 바이트 스트림이므로 
				fileOutputStream.write(str.getBytes());
			}

			System.out.println(fileName + " 저장 완료");

		} catch (FileNotFoundException e) {
			// 대상 파일이 없을 때 발생하는 예외 처리 용
			//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// write() 실행 중에 발생하는 예외 처리용
			//			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			// 사용이 끝난 스트림은 반드시 반납해야 함
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}

	public void fileRead() {
		System.out.printf("읽을 파일명 : ");
		String fileName = scanner.next();

		// 바이트 스트림 클래스 기록한 정보는 반드시 같은 바이트 스트림 클래스 메서드로 읽어야 함
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream(fileName);
			// 대상 파일이 없으면 에러 발생

			//			int data;
			//			while ((data = fileInputStream.read()) != -1) {
			//				System.out.printf(data + "");
			//			}
			//			System.out.println();

			// 입력받은 파일명으로 File 클래스 객체를 만듦
			File readFile = new File(fileName);
			System.out.println("파일 용량 : " + readFile.length() + " 바이트");

			// 파일의 데이터를 저장할 byte[] 만들기함 : 바이트 스트림이므로 읽는 데이터가 byte 여러 개임
			byte[] readDatas = new byte[(int)readFile.length()];
			// 파일의 데이터들을 읽어서 byte[]에 저장 처리함

			fileInputStream.read(readDatas);

			// String 클래스에 byte[] 를 String 으로 바꾸는 생성자 사용 => 출력 처리
			System.out.println(new String(readDatas));

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		} catch (IOException e) {
			// read() 작동 중에 발생하는 예외 처리 용
			System.out.println(e.getMessage());
			return;
		} finally {
			// 사용이 끝난 스트림은 반드시 반남해야 함
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}

}
