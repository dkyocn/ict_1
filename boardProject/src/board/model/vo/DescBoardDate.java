package board.model.vo;

import java.util.Comparator;

public class DescBoardDate implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {

		int result = 0;

		result = o2.getBoardDate().compareTo(o1.getBoardDate());

		return result;
	}

}
