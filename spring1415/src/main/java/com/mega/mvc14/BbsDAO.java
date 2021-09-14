package com.mega.mvc14;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate my;
	
	// 기능별로 메서드!!!로 정의한다.
	public void create(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
		int result = my.insert("bbs.add", bbsDTO);
		System.out.println(result);
	}

	public List<BbsDTO> all() {
		return my.selectList("bbs.all");
	}
	
	public BbsDTO one(BbsDTO bbsDTO) {
		return my.selectOne("bbs.one2",bbsDTO);
	}
	public void update() {

	}

	public void delete() {

	}
}
