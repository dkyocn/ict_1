package test.objectio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MemberManager {

	private Scanner scanner = new Scanner(System.in);

	private Member[] members;

	public MemberManager(Member[] array) {
		members = array;
	}

	public void fileSave() {
		System.out.printf("저장할 파일명 (파일명.dat): ");
		String fileName = scanner.next();

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {

			// 전달받은 객체 배열을 파일에 저장 처리
			for (Member member : members) {
				objectOutputStream.writeObject(member);
			}

			objectOutputStream.flush();
			System.out.println(fileName + "에 저장 완료!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileRead() {

		System.out.printf("읽을 파일 명 (파일명.dat): ");
		String fileName = scanner.next();

		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
			// 읽어들인 객체 정보 저장할 때 객체 배열을 따로 선언 할당함
			Member[] marray = new Member[members.length];

			for (int i = 0; i < marray.length; i++) {
				marray[i] = (Member)inputStream.readObject();
				System.out.println(marray[i]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
