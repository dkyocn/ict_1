package test.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestINetAddress {

	public static void main(String[] args) throws UnknownHostException {
		// java.net.InetAddress 클래스 사용 테스트 : ip address 관련 클래스임
		InetAddress localIP = InetAddress.getLocalHost(); // 현재 이 컴퓨터의 ip 주소 조회
		System.out.println("내 pc ip주소 : " + localIP); // 컴퓨터 이름 ip 주소
		System.out.println(localIP.getHostAddress());// ip주소
		System.out.println(localIP.getHostName()); // 컴퓨터 이름

		InetAddress naverIP = InetAddress.getByName("www.naver.com");
		System.out.println("naver server ip 주소 : " + naverIP.getHostAddress());

		InetAddress[] googleIP = InetAddress.getAllByName("www.google.com");
		System.out.println("google의 서버는 " + googleIP.length + "개 있습니다.");
		for (InetAddress ip : googleIP) {
			System.out.println(ip.getHostAddress());
		}

		InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
		System.out.println("navere의 서버는 " + naverIPs.length + "개 있습니다.");
		for (InetAddress ip : naverIPs) {
			System.out.println(ip.getHostAddress());
		}
	}

}
