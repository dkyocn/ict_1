package test.url;

import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {

	public static void main(String[] args) throws MalformedURLException {
		// java.net.URL 클래스 사용 테스트 : URL 정보 취급하는 클래스
		URL url = new URL("http://news.naver.com/main/hom.nhn");

		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("포트번호 : " + url.getPort());
		System.out.println("호스트명 : " + url.getHost());
		System.out.println("파일경로 : " + url.getFile());
		System.out.println("전체경로 : " + url.toExternalForm());

	}

}
