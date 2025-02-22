package test.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

		System.out.printf("저장할 파일명 : ");
		String fileName = scanner.next();

		try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName));) {

			System.out.println(fileName + "에 저장할 내용을 입력하세요.(종료 : exit입력) : ");
			scanner.nextLine();

			String str = null;
			while (!(str = scanner.nextLine()).equals("exit")) {
				str = "\n";
				bufferedOutputStream.write(str.getBytes());
			}

			bufferedOutputStream.flush();

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

		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName));) {

			/*
			 *  read() : int => 값을 한 개 씩 읽으면, 1바이트씩 읽음 => 문자가 숫자로 출력됨
			 *  문자열로 처리하고 싶으면, byte[]로 읽어서 String으로  바꾸면 됨
			 *  만들 byte[]의 length는 java.io.File 클래스를 이용해서, File 객체를 만들어서 파일용량(length())을 이용함
			 */
			File readFile = new File(fileName);
			byte[] readDatas = new byte[(int)readFile.length()];

			bufferedInputStream.read(readDatas);
			String data = new String(readDatas);

			System.out.println(data);

			// 위 내용을 한줄로 처리한다면
			System.out.println(new String(readDatas));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
