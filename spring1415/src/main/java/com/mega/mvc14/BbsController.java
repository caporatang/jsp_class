package com.mega.mvc14;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	
	@Autowired
	ReplyDAO dao2;
	
	
	
	@RequestMapping("one2") //게시판 상세페이지 + 댓글 리스트
 	public void one2(BbsDTO bbsDTO, Model model) {
		BbsDTO dto = dao.one(bbsDTO);
		ReplyDTO dto2 = new ReplyDTO();
		dto2.setBbsid(Integer.parseInt(bbsDTO.getId()));
		List<ReplyDTO> list2 =dao2.all(dto2);
		model.addAttribute("dto", dto); // 게시판 상세페이지
		model.addAttribute("list2", list2); //댓글 리스트
	}

	
	@RequestMapping("bbs.mega")
	public void insert(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
		dao.create(bbsDTO);
	}
	
	@RequestMapping("bbs_list")
	public void list(Model model) {
		List<BbsDTO> list = dao.all();
		System.out.println(list.size() + "================");
		model.addAttribute("list", list);
	}



}
