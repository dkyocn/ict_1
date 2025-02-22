package io.silsub2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SungjukProcess {
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		SungjukProcess process = new SungjukProcess();

		//		process.sungjukSave();
		process.scoreRead();

	}

	public void sungjukSave() {

		try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("score.dat"))) {

			do {

				System.out.printf("국어 점수 : ");
				int korean = scanner.nextInt();
				dataOutputStream.writeInt(korean);

				System.out.printf("영어 점수 : ");
				int english = scanner.nextInt();
				dataOutputStream.writeInt(english);

				System.out.printf("수학 점수 : ");
				int math = scanner.nextInt();
				dataOutputStream.writeInt(math);

				int score = korean + english + math;
				dataOutputStream.writeInt(score);

				double avg = score / 3.0;
				dataOutputStream.writeDouble(avg);

				dataOutputStream.flush();

				System.out.printf("계속 저장하시겠습니까?(y/n) ");
				if (scanner.next().toLowerCase().charAt(0) == 'n') {

					System.out.println("score.dat 에 저장 완료.");
					return;
				}

			} while (true);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void scoreRead() {

		int total = 0;
		double totalAvg = 0.0;
		int count = 0;
		try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("score.dat"))) {

			do {

				int korean = dataInputStream.readInt();
				int english = dataInputStream.readInt();
				int math = dataInputStream.readInt();
				int score = dataInputStream.readInt();
				double avg = dataInputStream.readDouble();

				System.out.printf("국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %.2f\n", korean, english, math, score, avg);

				total += score;
				totalAvg += avg;

			} while (true);

		} catch (java.io.EOFException e) {
			System.out.printf("읽은 횟수: %d, 전체 총점: %d, 전체 평균: %.2f", count, total, totalAvg);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
