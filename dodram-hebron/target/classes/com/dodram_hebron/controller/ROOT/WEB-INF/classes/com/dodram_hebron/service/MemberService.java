package com.dodram_hebron.service;
import java.util.List;
import com.dodram_hebron.vo.MemberVO;

public interface MemberService {   
	public List<MemberVO> selectMember() throws Exception;
}