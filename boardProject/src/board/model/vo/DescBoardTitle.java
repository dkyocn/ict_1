package board.model.vo;

import java.util.Comparator;

public class DescBoardTitle implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {

		int result = 0;

		result = o2.getBoardTitle().compareTo(o1.getBoardTitle());

		return result;
	}

}
