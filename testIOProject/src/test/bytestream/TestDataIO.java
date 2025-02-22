package test.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataIO {

	public static void main(String[] args) {
		// 자료형별로 입출력 처리하는 보조(추가 | 처리) 스트림 : DataInputStream, DataOutputStream
		TestDataIO dataIO = new TestDataIO();

		//		dataIO.fileSave();
		dataIO.fileRead();
	}

	/**
	 * 보조 스트림은 단독으로 객체 생성 못함 : 매개변수 없는 기본 생성자가 없음
	 * 생성자 확인 : DataOutputStream 을 생성하기 위해 다른 OutputStream이 필요함
	 * 
	 * 외부 자원(파일, 메모리, 등)과 직접 연결하는 스트림을 기본 스트림이라고 함
	 * 기본 스트림과 연결된느 스트림을 보조 스트림이라고 함
	 * 
	 * 외부자원 - 기본스트림 - 프로세서
	 * 외부자원 - 기본스트림 - 보조스트림 - 프로세서
	 * 외부자원 - 기본스트림 - 보조스트림1 - 보조스트림2 - 보조스트림3 
	 */
	public void fileSave() {

		//		FileOutputStream fileOutputStream = null;
		//		DataOutputStream dataOutputStream = null;

		// try with resource 문으로 변경한다면
		//		try (FileOutputStream fileOutputStream = new FileOutputStream("member.dat");
		//			DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);) {
		// 두 개의 선언을 한 줄로 줄인다면 
		try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("member.dat"))) {
			//			fileOutputStream = new FileOutputStream("member.dat");
			//			dataOutputStream = new DataOutputStream(fileOutputStream);

			String name = "홍길동";
			char gender = '남';
			int age = 28;
			double weight = 78.5;

			dataOutputStream.writeUTF(name);
			dataOutputStream.writeChar(gender);
			dataOutputStream.writeInt(age);
			dataOutputStream.writeDouble(weight);

			dataOutputStream.flush(); // 출력 스트림에 남은 데이터를 밀어내기함 (출력 스트림에서 내보냄)

		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//		} finally {
		//			// 나중에 생성된 것부터 먼저 닫아야 함
		//
		//			try {
		//				dataOutputStream.close();
		//				fileOutputStream.close();
		//			} catch (IOException e) {
		//				e.printStackTrace();
		//			}
		//
		//		}
	}

	public void fileRead() {

		/*
		 *  DataOutputStream으로 기록된 데이터는 DataInputStream으로 읽어야 함
		 *  값을 종류별로 기록하였으므로, 기록한 순서대로 종류별로 읽어야 함
		 */
		try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("member.dat"))) {

			// 입력스트림 (InputStream, Reader) 의 파일 입력 처리에서는 대상 파일이 없으면 에러

			// 주의 : 파일에 기록된 데이터 종류 순서대로 읽어야 함

			String name = dataInputStream.readUTF();
			char gender = dataInputStream.readChar();
			int age = dataInputStream.readInt();
			double weight = dataInputStream.readDouble();

			System.out.println(name + ", " + gender + ", " + age + ", " + weight);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
