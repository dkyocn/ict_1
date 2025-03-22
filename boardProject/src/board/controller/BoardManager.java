package board.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import board.model.vo.Board;

public class BoardManager {

	ArrayList<Board> list = new ArrayList<Board>();
	Scanner sc = new Scanner(System.in);

	public BoardManager() {
		super();

	}

	public void writeBoard() {
		System.out.println("새 게시글 쓰기 입니다.");

		System.out.printf("글 제목 : ");
		String title = sc.nextLine();

		System.out.printf("작성자 : ");
		String name = sc.next();

		System.out.printf("글 내용 : ");
		sc.nextLine();
		String contents = new String();
		String string = sc.nextLine();
		while (string != "exit") {
			sc.nextLine();
			string = sc.nextLine();
			contents += string;
		}

		list.add(new Board(list.size() + 1, title, name, new Date(), contents, 0));

	}

	public void displayAllList() {
		for (Board board : list) {
			System.out.println(board);
		}
	}

	public void displayBoard() {
		System.out.printf("조회할 글번호 : ");
		int no = sc.nextInt();
		System.out.println(list.get(no));

		list.get(no).setReadCount(list.get(no).getReadCount() + 1);

	}

	public void modifyTitle() {
		System.out.printf("수정할 글번호 : ");
		int no = sc.nextInt();
		System.out.println(list.get(no));

		System.out.printf("변경할 제목 : ");
		String title = sc.next();
		list.get(no).setBoardTitle(title);
	}

	public void modifyContent() {
		System.out.printf("수정할 글번호 : ");
		int no = sc.nextInt();
		System.out.println(list.get(no));

		System.out.printf("변경할 내용 : ");
		sc.nextLine();
		String contents = new String();
		String string = sc.nextLine();
		while (string != "exit") {
			sc.nextLine();
			string = sc.nextLine();
			contents += string;
		}

		list.get(no).setBoardContent(contents);
	}

	public void deleteBoard() {
		System.out.printf("삭제할 글번호 : ");
		int no = sc.nextInt();
		System.out.println(list.get(no));

		System.out.printf("정말로 삭제하시겠습니까? (y/n) : ");
		if (sc.next().toUpperCase().charAt(0) == 'Y') {
			list.remove(no);

			System.out.printf(no + "번 글이 삭제되었습니다.");
		}

	}

	public void searchBoard() {
		System.out.printf("검색할 제목 : ");
		String title = sc.next();

		list.stream().forEach();
	}

	public void saveListFile() {

	}

	public void sortList(int item, boolean isDesc) {

	}

}
