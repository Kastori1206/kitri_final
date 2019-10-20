package com.kitri.pms.persistence;

import java.util.List;

import com.kitri.pms.domain.MemberVO;

public interface MemberDAO {
	public List<MemberVO> getMemberList();
}
