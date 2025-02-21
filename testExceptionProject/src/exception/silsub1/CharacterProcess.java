package exception.silsub1;

public class CharacterProcess {

	public CharacterProcess() {
		super();
	}

	public int countAlpha(String s) throws CharCheckException {

		if (!s.contains(" ")) {
			int result = 0;
			for (int i = 0; i < s.length(); i++) {
				if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {

				}
			}
			return result;
		} else {
			throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
		}
	}

}
