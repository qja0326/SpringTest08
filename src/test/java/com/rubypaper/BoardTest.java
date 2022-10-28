package com.rubypaper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.board.persistence.BoardServiceImpl;
import com.rubypaper.domain.BoardVO;



@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTest {
	
	@Autowired
	BoardServiceImpl service;
	
	

	public void insert() {
		
		for(int i=1; i<=5; i++) {
			BoardVO vo = new BoardVO();
			vo.setTitle("도우너 등록 "+i+" 입니다.");
			vo.setWriter("admin");
			vo.setContent("도우너 등록 내용 "+i+" 입니다.");
			vo.setCreateDate(new Date());
			vo.setCnt(1);
			service.insert(vo);
		}
	}
	

	public void delete() {
		for(int i=1; i<=5; i++) {
			BoardVO vo = new BoardVO();
			vo.setSeq(1027+i);
			service.delete(vo);
		}
	}
	
	@Test
	public void select() {
		List<BoardVO> li = service.getBoardList(null);
		
		for(BoardVO m : li ) {
			System.out.println(m.toString());
		}
		
	}
}
