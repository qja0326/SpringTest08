package com.rubypaper.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubypaper.board.persistence.BoardServiceImpl;
import com.rubypaper.board.persistence.JoinServiceImpl;
import com.rubypaper.domain.BoardVO;
import com.rubypaper.domain.JoinVO;

@Controller
@RequestMapping("/board/")
public class BoardController {
	@Autowired
	private BoardServiceImpl boardService;
	
	@Autowired
	private JoinServiceImpl joinService;
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(Model model ) {
		model.addAttribute("li", joinService.join1());
		return "/board/getBoardList.html";
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(Model model,JoinVO vo ) {
		JoinVO m = joinService.join3(vo);
		model.addAttribute("m", joinService.join3(vo));
		return "board/getBoard.html";
	}
	
	@RequestMapping("insertBoard")
	public String insertBoard () {
		return "board/insertBoard.html";
	}
	
	@RequestMapping("/insertBoard.do")
	public String insert (Model model,BoardVO vo ) {
		boardService.insert(vo);
		return "/getBoardList.do";
	}
}
