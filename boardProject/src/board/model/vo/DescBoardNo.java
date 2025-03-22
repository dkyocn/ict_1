package board.model.vo;

import java.util.Comparator;

public class DescBoardNo implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {

		int result = 0;

		result = Integer.compare(o2.getBoardNo(), o1.getBoardNo());

		return result;
	}

}
