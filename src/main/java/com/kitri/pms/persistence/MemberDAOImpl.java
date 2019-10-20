package com.kitri.pms.persistence;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kitri.pms.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String namespace = "membermanager";
	@Override
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".memberall");
	}

}
