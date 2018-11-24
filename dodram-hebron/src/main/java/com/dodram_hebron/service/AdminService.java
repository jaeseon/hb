package com.dodram_hebron.service;

import java.util.List;
import java.util.Map;

import com.dodram_hebron.vo.ContactBoardVO;
import com.dodram_hebron.vo.EditorVO;
import com.dodram_hebron.vo.UpdateReportVO;

public interface AdminService {
	public int loginCheckProcess(String id, String pw) throws Exception;
	public List<ContactBoardVO> boardList();
	public List<EditorVO> editorBoardList(String title);
	public void insertContactBoard(Map<String, Object> list);
	public int updateEditorBoard(Map<String, Object> list);
	public int deleteContentBoard(Map<String, Object> map);
	public List<UpdateReportVO> updateReportList();
}
