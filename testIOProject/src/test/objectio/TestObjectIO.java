package test.objectio;

public class TestObjectIO {

	public static void main(String[] args) {
		// 객체 입출력을 위한 MemberManager 테스트용

		Member[] members = new Member[] {
			new Member("홍길동", 29, '남', 75.1, 180.5),
			new Member("심청이", 18, '여', 50.1, 161.5),
			new Member("이몽룡", 35, '남', 69.1, 172.4)
		};

		MemberManager manager = new MemberManager(members);

		manager.fileSave();
		manager.fileRead();
	}

}
