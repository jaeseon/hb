package com.dodram_hebron.service;

import java.util.List;
import java.util.Map;

import com.dodram_hebron.vo.ContactBoardVO;
import com.dodram_hebron.vo.UpdateReportVO;

public interface AdminService {
	public int loginCheckProcess(String id, String pw) throws Exception;
	public List<ContactBoardVO> boardList();
	public void insertContactBoard(Map<String, Object> list);
	public int deleteContentBoard(Map<String, Object> map);
	public List<UpdateReportVO> updateReportList();
}
