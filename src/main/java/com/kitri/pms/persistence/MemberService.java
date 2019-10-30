package com.kitri.pms.persistence;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.kitri.pms.domain.MemberVO;

public interface MemberService {
	public void updateMember(MemberVO vo);
	public int getMemberCnt();
	public void deleteMember(MemberVO vo);
	public void insertMember(MemberVO vo);
	public MemberVO getMember(String id);	
	public List<MemberVO> getMemberList(); 
	public boolean loginCheck(MemberVO vo,HttpSession session);
	public void logout(HttpSession session);
}
