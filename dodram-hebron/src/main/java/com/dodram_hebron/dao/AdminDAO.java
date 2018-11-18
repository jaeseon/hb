package com.dodram_hebron.dao;

import java.util.List;
import java.util.Map;

import com.dodram_hebron.vo.AdminVO;
import com.dodram_hebron.vo.ContactBoardVO;
import com.dodram_hebron.vo.UpdateReportVO;

public interface AdminDAO {
	public List<AdminVO> selectAdminAcount(String id) throws Exception;
	public List<ContactBoardVO> selectContactBoard() throws Exception;
	public void insertContactBoard(Map<String, Object> list);
	public int deleteContactBoard(Map<String, Object> map);
	public List<UpdateReportVO> selectUpdateReport();
}
