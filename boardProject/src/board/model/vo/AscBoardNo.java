package board.model.vo;

import java.util.Comparator;

public class AscBoardNo implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {

		int result = 0;

		result = Integer.compare(o1.getBoardNo(), o2.getBoardNo());

		return result;
	}

}
