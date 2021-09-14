package com.mega.mvc14;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

//dao는 무조건 싱글톤으로 만들어주어야 한다.
//@Repository << dao를 싱글톤으로 만들어준다.
// 싱글톤으로 만들어줄 객체가 아니라면 어노테이션을 달지 않는다.
// 싱글톤은 객체가 생성되었다는것이고 , 주소를 자기가 생성한다.
@Repository
public class MemberDAO {
	
	@Autowired //싱글톤만 끼울 수 있음
	SqlSessionTemplate myBatis;
	
	
	
	
	//중복검사
	public MemberDTO check2(MemberDTO memberDTO) {
	MemberDTO dto = myBatis.selectOne("member.check2", memberDTO);
	return dto;
	}
	
	
	
	
	
	//전체 검색 select이다
	// 입력값이 없고 , 매퍼에 있는걸 입력한다.
	public List<MemberDTO> list() {
		List<MemberDTO> list = myBatis.selectList("member.all");
		return list;
	}
	
	
	public int del() {
	int result = myBatis.delete("delBoard.mega");
		return result;
	}
	
	@RequestMapping("create.do")
	public void create(MemberDTO memberDTO) {
		myBatis.insert("member.create", memberDTO);
	}
	
	// 기능당 하나씩 메서드를 만들어준다.
	public boolean login(MemberDTO dto) {
		String dbId = "root";
		String dbPw = "1234";
		Boolean result = false;// 컨트롤러에 결과를 알려줄 변수
		if (dto.getId().equals(dbId) && dto.getPw().equals(dbPw)) {
			System.out.println("로그인 성공");
			result = true;
		}
		return result;
	}

	public void create() {
		// myBtis.insert("insert into member");
		// 1. 순서
		// 어노테이션 달고(오토와이어드 싱글톤)
		// 2.
		
		myBatis.insert("insert into member");
		

	}
	
	public MemberDTO read(MemberDTO memberDTO) {
	MemberDTO dto = myBatis.selectOne("member.one",memberDTO);
	return dto;
	}
	public void read() {

	}

	public void update() {

	}

	public int delete(MemberDTO memberDTO) {
		int result = myBatis.delete("member.del", memberDTO);
		return result;
	}

}
