package test.bytestream;

public class TestFileIO {

	public static void main(String[] args) {
		// 바이트 스티림 파일 입출력 테스트
		FileIOSample fileIOSample = new FileIOSample();
		FileIOSample2 fileIOSample2 = new FileIOSample2();

		//		fileIOSample.fileSave();
		//		fileIOSample.fileRead();

		//		fileIOSample2.fileSave();
		//		fileIOSample2.fileRead();

		fileIOSample2.fileAppendSave();
		fileIOSample2.fileRead();

		System.out.println("main 종료");

	}

}
