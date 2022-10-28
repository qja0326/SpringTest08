package com.rubypaper.board.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rubypaper.domain.MemberVO;

@Mapper
public interface MemberDao {
	void insert(MemberVO vo);
	
	List<MemberVO> getMemberList(MemberVO vo);
	
}
