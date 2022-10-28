package com.rubypaper.board.persistence;

import java.util.List;

import com.rubypaper.domain.BoardVO;

public interface BoardService {
	void insert(BoardVO vo);
	void update(BoardVO vo);
	void delete(BoardVO vo);
	BoardVO getBoard(BoardVO vo);
	List<BoardVO> getBoardList(BoardVO vo);
}
