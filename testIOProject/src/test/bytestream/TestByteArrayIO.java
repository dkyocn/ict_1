package test.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class TestByteArrayIO {

	public static void main(String[] args) {
		// ByteArrayInputStream, ByteArrayOutputStream 사용 테스트
		testByteArray();

	}

	private static void testByteArray() {

		/*
		 * 연결 자원이 메모리에 있는 byte 배열임
		 * byte 배열까리 값 복사할 때 주로 사용함
		 */
		byte[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] copy = null;
		//		byte[] copy = new byte[source.length];

		ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(source);
		ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();

		// 한 개 씩 읽어 들일 떄
		int data;
		while ((data = arrayInputStream.read()) != -1) {
			arrayOutputStream.write(data);
		}

		copy = arrayOutputStream.toByteArray(); // 출력스트림에 저장된 데이터들을 byte[] 로 바꿈
		// 출력 확인
		for (int i = 0; i < copy.length; i++) {
			System.out.println(i + " : " + copy[i]);
		}

		// System.arrayCopy() 사용할 수도 있음
		byte[] acopy = new byte[source.length];
		System.arraycopy(source, 0, acopy, 0, source.length);

		for (int i = 0; i < acopy.length; i++) {
			System.out.println(i + " : " + acopy[i]);
		}
	}

}
