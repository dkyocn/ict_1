package oop.method;

public class NonStaticSample {

	// 처리할 내용 : 전달받은 정수 갯수만큼의 배열공간을 할당하여, 
	//         임의의 1부터 100사이의 값으로 값 기록하고 주소 리턴함
	public int intArrayAllocation(int num) {

		int[] intArr = new int[num];

		for (int i = 0; i < num; i++) {
			intArr[i] = (int)(Math.random() * 100) + 1;
		}

		return intArr.hashCode();
	}

	// 처리할 내용 : 배열을 전달받아 화면에 출력함
	public void display(int[] intArr) {

		for (int i = 0; i < intArr.length; i++) {
			System.out.printf(intArr[i] + " ");
		}
	}

	// 처리할 내용 : 배열과, 두 정수의 인덱스를 전달받아
	//		두 인덱스의 값을 교환함
	public void swap(int[] intArr, int index1, int index2) {

		int num = 0;
		num = intArr[index1];
		intArr[index1] = intArr[index2];
		intArr[index2] = num;
	}

	// 처리할 내용 : 위에서 작성한 swap 메소드를 이용하여
	// 배열의 값 들을 내림차순 정렬 처리함
	public void sortDescending(int[] intArr) {
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr.length; j++) {
				if (intArr[i] > intArr[j]) {
					swap(intArr, j, i);
				}
			}
		}

	}

	// 처리할 내용 : swap 메소드를 이용하여 배열의 값들을 오름차순 정렬함
	public void sortAscending(int[] intArr) {
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr.length; j++) {
				if (intArr[i] < intArr[j]) {
					swap(intArr, j, i);
				}
			}
		}
	}

	// 문자열과 문자 하나를 전달받아, 문자열에 포함된 문자의 갯수를 리턴하는 메소드
	public int countChar(String str, char ch) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (pCharAt(str, i) == ch) {
				result++;
			}
		}

		return result;
	}

	// 정수 두 개를 전달받아, 두 수중 작은 값에서 큰 값사이의 정수들의 합계를 구해서 리턴하는 메서드
	public int totalValue(int num1, int num2) {
		int sum = 0;

		if (num1 < num2) {
			for (int i = num1; i < num2 + 1; i++) {
				sum += i;
			}
		} else if (num1 > num2) {
			for (int i = num2; i < num1 + 1; i++) {
				sum += i;
			}
		}

		return sum;
	}

	// 문자열과 인덱스를 전달받아, 그 위치의 문자를 리턴하는 메소드
	public char pCharAt(String str, int index) {

		return str.charAt(index);
	}

	// 두 개의 문자열을 전달받아, 하나의 문자열로 합쳐서 리턴하는 메소드
	public String pConcat(String str1, String str2) {
		return str1.concat(str2);
	}
}
