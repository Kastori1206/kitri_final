package com.kitri.pms.persistence;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kitri.pms.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO dao;
	
	public MemberServiceImpl() {
	}
	
	@Override
	public void updateMember(MemberVO vo) {
		dao.updateMember(vo);
	}

	@Override
	public void deleteMember(MemberVO vo) {
		// TODO Auto-generated method stub
		dao.deleteMember(vo);
	}

	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		dao.insertMember(vo);
	}

	@Override
	public MemberVO getMember(String id) {
		// TODO Auto-generated method stub
		return dao.getMember(id);
	}

	@Override
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		return dao.getMemberList();
	}



	@Override
	public void logout(HttpSession session) {
		dao.logout(session);
	}

	@Override
	public boolean loginCheck(MemberVO vo, HttpSession session) {
		boolean result = dao.loginCheck(vo);
		if(result) {
			MemberVO vo2 = dao.getMember(vo.getM_id());
			session.setAttribute("userId", vo2.getM_id());
			session.setAttribute("userName", vo2.getM_name());
		}
		return result;		
	}

	@Override
	public int getMemberCnt() {
	
		return dao.getMemberCnt();
	}



}
