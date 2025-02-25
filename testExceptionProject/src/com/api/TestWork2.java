package com.api;

import java.util.StringTokenizer;

public class TestWork2 {

	public static void main(String[] a) {

		String string = "J a v a  P r o g r a m ";

		System.out.println("토큰 처리전 글자 : " + string + ", 글자 개수: " + string.length());

		StringTokenizer stringTokenizer = new StringTokenizer(string, " ");

		char[] cs = new char[stringTokenizer.countTokens()];

		System.out.println("토큰 처리 후 글자 개수 : " + stringTokenizer.countTokens());

		int i = 0;

		while (stringTokenizer.hasMoreTokens()) {
			cs[i] = stringTokenizer.nextToken().charAt(0);
			i++;
		}

		for (char ch : cs) {
			System.out.printf(ch + " ");
		}

		String afterStr = new String(cs);

		System.out.println(afterStr.toUpperCase());

	}

}
