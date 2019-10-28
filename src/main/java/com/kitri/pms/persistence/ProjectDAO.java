package com.kitri.pms.persistence;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("ProjcetDAO")
public class ProjectDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
}
