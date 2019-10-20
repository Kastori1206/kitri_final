package kitri_pms;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kitri.pms.domain.MemberVO;
import com.kitri.pms.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration( locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})


public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	@Test
	public void test() {
		List<MemberVO> list = dao.getMemberList();
		for(MemberVO vo : list) {
			System.out.println(vo.toString());
		}
	}

}
