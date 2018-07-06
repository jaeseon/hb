package com.dodram_hebron.service;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.dodram_hebron.dao.MemberDAO;
import com.dodram_hebron.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	private MemberDAO dao;
	
	@Override
	public List<MemberVO> selectMember() throws Exception {
		return dao.selectMember();
	}
}