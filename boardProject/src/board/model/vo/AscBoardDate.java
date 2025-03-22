package board.model.vo;

import java.util.Comparator;

public class AscBoardDate implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {

		int result = 0;

		result = o1.getBoardDate().compareTo(o2.getBoardDate());

		return result;
	}

}
