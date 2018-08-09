package com.dodram_hebron.service;

import java.util.List;

import com.dodram_hebron.vo.ContactBoardVO;

public interface AdminService {
	public int loginCheckProcess(String id, String pw) throws Exception;
	public List<ContactBoardVO> boardList();
}
