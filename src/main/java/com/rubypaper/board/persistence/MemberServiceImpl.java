package com.rubypaper.board.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubypaper.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao dao;
	
	@Override
	public void insert(MemberVO vo) {
		dao.insert(vo);
	}

	@Override
	public List<MemberVO> getMemberList(MemberVO vo) {
		return dao.getMemberList(vo);
	}

}
