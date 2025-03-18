package paractice1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {

		lottoDisplay();
	}

	public static void lottoDisplay() {

		Random random = new Random();

		HashSet hashSet = new HashSet();

		while (hashSet.size() < 6) {
			hashSet.add(random.nextInt(45) + 1);
		}

		Set ascNumber = new TreeSet(hashSet); // TreeSet : 오름차순 정렬

		int[] is = new int[ascNumber.size()];

		Object[] objects = ascNumber.toArray();

		//		for (Object object : objects) {
		//
		//			System.out.printf(object + " ");
		//		}

		for (int i = 0; i < is.length; i++) {
			is[i] = (Integer)objects[i];
			System.out.printf(is[i] + " ");
		}
	}

}
