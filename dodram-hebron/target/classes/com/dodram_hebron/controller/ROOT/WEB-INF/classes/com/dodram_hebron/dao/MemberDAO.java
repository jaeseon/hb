package com.dodram_hebron.dao;
import java.util.List;
import com.dodram_hebron.vo.MemberVO;

public interface MemberDAO {
	public List<MemberVO> selectMember() throws Exception;
}