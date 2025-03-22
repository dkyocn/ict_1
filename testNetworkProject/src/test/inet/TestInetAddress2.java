package test.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestInetAddress2 {

	public static void main(String[] args) throws UnknownHostException {
		/*
		 * 키보드로 호스팅명(컴퓨터에 부여한 이름 또는 인터넷에서 서버에 등록된 도메인명)을 입력받아,
		 * 해당 호스트가 가진 ip 주소 모두를 출력 처리
		 */
		do {
			System.out.println("호스트명 (종료 : none) :");
			String hostname = new Scanner(System.in).next();

			if (hostname.equals("none")) {
				break;
			}

			InetAddress[] ipArray = InetAddress.getAllByName(hostname);
			System.out.println(hostname + "가 가진 ip는 " + ipArray.length + " 개");
			for (InetAddress ip : ipArray) {
				System.out.println(ip.getHostAddress());
			}
		} while (true);

	}

}
