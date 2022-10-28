package com.rubypaper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.board.persistence.JoinServiceImpl;
import com.rubypaper.domain.JoinVO;



@RunWith(SpringRunner.class)
@SpringBootTest
public class JoinTest3 {
	
	@Autowired
	JoinServiceImpl service;
	

	public void select() {
		List<JoinVO> li = service.join1();
		
		for(JoinVO m : li ) {
			System.out.println(m.toString());
		}
		
	}
	
	@Test
	public void select2() {
		JoinVO vo = new JoinVO();
		vo.setId("member");
		List<JoinVO> li = service.join2(vo);
		
		for(JoinVO m : li ) {
			System.out.println(m.toString());
		}
		
	}
}
