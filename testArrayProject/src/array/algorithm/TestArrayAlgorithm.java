package array.algorithm;

public class TestArrayAlgorithm {
	
	public void testSwap() {
		
		// 두 변수의  값을 교환하는 공식 : swap 공식이라고 함
		int a = 10, b =20;
		System.out.println("a : "+a+", b : "+b);
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a : "+a+", b : "+b);
	}

	public static void main(String[] args) {
		
		// 기본 자료형 배열 알고리즘 간단 테스트
		ArrayAlgorithm algorithm = new ArrayAlgorithm();
		
		int[] arr = new int[10];
//		System.out.println("arr 가 가진 배열 공간의 주소: " + arr.hashCode());

//		new TestArrayAlgorithm().testSwap();

		// 1 ~ 100 사이의 임의의 정수값을 배열 각 방에 기록해 넣음
		algorithm.inputData(arr);
		
		// 값 기록 출력 확인
		algorithm.printArray(arr);
		
		// 배열 공간의 값들을 섞기 함 : shuffle
		algorithm.shuffle(arr);
		// 값 기록 출력 확인
		algorithm.printArray(arr);
		
		// shuffle 확인용
		int[] br = {1,2,3,4,5,6,7,8,9,10};
		algorithm.shuffle(br);
		// 값 기록 출력 확인
		algorithm.printArray(br);
		
		// 정렬 확인
		System.out.println("정렬 전 ");
		algorithm.printArray(arr);
		System.out.println("정렬 후 ");
		algorithm.sortAscending(arr);
		algorithm.printArray(arr);
		
		System.out.println("정렬 전 ");
		algorithm.printArray(arr);
		System.out.println("정렬 후 ");
		algorithm.sortDescending(arr);
		algorithm.printArray(arr);
	}

}
