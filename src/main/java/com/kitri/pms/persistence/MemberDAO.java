package com.kitri.pms.persistence;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kitri.pms.domain.MemberVO;

@Repository("MemberDAO")
public class MemberDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public MemberDAO() {
		
	}
	public void updateMember(MemberVO vo) {
		sqlSession.update("MemberDAO.updateMember",vo);
	}
	public void deleteMember(MemberVO vo) {
		sqlSession.delete("MemberDAO.deleteMember",vo);
	}
	public void insertMember(MemberVO vo) {
		sqlSession.insert("MemberDAO.insertMember",vo);
	}

	public MemberVO getMember(String id) {
		return sqlSession.selectOne("MemberDAO.getMember",id);
	}
	
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("MemberDAO.getAllMember");
	}
	public boolean loginCheck(MemberVO vo) {
		String name = sqlSession.selectOne("MemberDAO.loginCheck",vo);
		System.out.println(name);
		return (name == null) ? false : true;
	}
	public void logout(HttpSession session) {
		session.invalidate();
	}
	public int getMemberCnt() {
		return sqlSession.selectOne("MemberDAO.getMemberCnt");
	}
}
