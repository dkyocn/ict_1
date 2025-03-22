package test.generics;

/**
 * 배열 처리용 클래스 : 타입이 정해지지 않은 배열 선언
 * @param <T>
 */
public class MyGenerics<T> {
	T[] array;
	int size;
	int count;

	/**
	 * 객체 생성 시 배열 크리 지정함
	 * @param size
	 */
	public MyGenerics(int size) {
		this.size = size;
		array = (T[])new Object[size];
	}

	public void add(T obj) throws SizeOverflowException {
		if (count < size) {
			array[count] = obj;
			count++;
		} else {
			throw new SizeOverflowException(size + "개만 저장할 수 있습니다.");
		}
	}

	public T get(int index) {
		if (index >= 0 && index < count) {
			return array[index];
		} else {
			return null;
		}
	}

	public int getCount() {
		return count;
	}
}
