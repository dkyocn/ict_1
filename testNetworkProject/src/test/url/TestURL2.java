package test.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class TestURL2 {

	public static void main(String[] args) throws IOException {
		// 키보드로 URL을 입력받아, 프로토콜, 포트번호, 호스트명, 파일경로, 쿼리스트링 출력 처리
		/*
		 *  단, 입력된 URL은 한줄 씩 입력받고, 값 앞 뒤에 안보이는 공백은 제거함
		 *  URL의 호스트명으로 IP 주소 조회 출력, none 입력 시 반복 종료
		 *  키보드 입력은 BufferedReader 사용할 것
		 */
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("url 입력 (종료시 none 입력) : ");
			String url = br.readLine().trim(); // 입력받은 문자열 앞뒤 공백 제거함

			if (url.equals("none")) {
				break;
			}

			URL urlInfo = new URL(url);

			System.out.println("protocol : " + urlInfo.getProtocol());
			System.out.println("port : " + urlInfo.getPort());
			System.out.println("host : " + urlInfo.getHost());
			System.out.println("content : " + urlInfo.getHost());
			System.out.println("file path : " + urlInfo.getFile());
			System.out.println("url all : " + urlInfo.toExternalForm());
			System.out.println("query string : " + urlInfo.getQuery());

			InetAddress[] ipAddress = InetAddress.getAllByName(urlInfo.getHost());
			for (InetAddress ip : ipAddress) {
				System.out.println(ip.getHostAddress());
			}
		} while (true);
	}

}
