package com.rubypaper;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.board.persistence.BoardServiceImpl;
import com.rubypaper.board.persistence.MemberServiceImpl;
import com.rubypaper.domain.BoardVO;
import com.rubypaper.domain.MemberVO;
import com.rubypaper.domain.Role;



@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberTest {
	
	@Autowired
	private MemberServiceImpl service;
	
	
	@Before
	public  void  insert() {
		MemberVO	vo = new MemberVO();
		vo.setId("member");
		vo.setName("둘리");
		vo.setPassword("member123");
		vo.setRole(Role.ROLE_MEMBER);
		vo.setEnabled("TRUE");
		service.insert(vo);
	}
		
	@Test
	public  void  select() {
		
		List<MemberVO> li=service.getMemberList(null);
		
		for(MemberVO m :li) {
		  System.out.println("==>" + m.toString());
		}
	}
	
	
}
