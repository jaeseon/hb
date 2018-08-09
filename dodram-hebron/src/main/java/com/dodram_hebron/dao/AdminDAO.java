package com.dodram_hebron.dao;

import java.util.List;

import com.dodram_hebron.vo.AdminVO;
import com.dodram_hebron.vo.ContactBoardVO;

public interface AdminDAO {
	public List<AdminVO> selectAdminAcount(String id) throws Exception;
	public List<ContactBoardVO> selectContactBoard() throws Exception;
}
