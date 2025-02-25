package com.api;

public class ExamString {

	public String preChar(String s) {
		StringBuilder builder = new StringBuilder();

		char ch = s.charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			ch -= 32;
		}

		builder.setCharAt(0, ch);
		return builder.toString();
	}

	public int charSu(String s, char ch) {

		StringBuffer buffer = new StringBuffer();

		return 13;
	}
}
