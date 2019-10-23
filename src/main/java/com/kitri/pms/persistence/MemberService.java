package com.kitri.pms.persistence;

import java.util.List;

import com.kitri.pms.domain.MemberVO;

public interface MemberService {
	public void updateMember(MemberVO vo);
	public void deleteMember(MemberVO vo);
	public void insertMember(MemberVO vo);
	public MemberVO getMember(String id);	
	public List<MemberVO> getMemberList(); 
}
