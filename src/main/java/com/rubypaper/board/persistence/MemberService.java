package com.rubypaper.board.persistence;

import java.util.List;

import com.rubypaper.domain.MemberVO;

public interface MemberService {
	
	void insert(MemberVO vo);
	
	List<MemberVO> getMemberList(MemberVO vo);
}
