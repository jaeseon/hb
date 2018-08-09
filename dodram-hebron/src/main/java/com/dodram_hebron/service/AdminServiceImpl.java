package com.dodram_hebron.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dodram_hebron.dao.AdminDAO;
import com.dodram_hebron.vo.AdminVO;
import com.dodram_hebron.vo.ContactBoardVO;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO adminDAO;
	
	@Override
	public int loginCheckProcess(String id, String pw) throws Exception {
		List<AdminVO> adminList = adminDAO.selectAdminAcount(id);
		
		// 입력한 ID가 테이블에 없다면 다음 줄 실행
		if (adminList.isEmpty()) {
			return 0;
		} else {
			String rosterPW = adminList.get(0).getRoster_pw();
			
			// 사용자가 입력한 패스워드가 관리자 패스워드면(로그인 성공)
			if (pw.equals(rosterPW)) {
				return 2;
			}
		}
		
		// 패스워드 틀림
		return 1;
	}

	@Override
	public List<ContactBoardVO> boardList() {
		List<ContactBoardVO> selectBoardList;
		
		try {
			selectBoardList = (ArrayList) adminDAO.selectContactBoard();
			
			Iterator<ContactBoardVO> itr = selectBoardList.iterator();
			
			while(itr.hasNext()) {
				return selectBoardList; 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
