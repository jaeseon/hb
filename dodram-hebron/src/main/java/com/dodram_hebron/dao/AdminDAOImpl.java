package com.dodram_hebron.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dodram_hebron.vo.AdminVO;
import com.dodram_hebron.vo.ContactBoardVO;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.dodram_hebron.mappers.adminMapper";
	
	@Override
	public List<AdminVO> selectAdminAcount(String id) throws Exception {
		return sqlSession.selectList(Namespace + ".selectAdminAcount", id);
	}

	@Override
	public List<ContactBoardVO> selectContactBoard() throws Exception {
		return sqlSession.selectList(Namespace + ".selectContactBoard");
	}

	@Override
	public void insertContactBoard(Map<String, Object> list) {
		sqlSession.insert(Namespace + ".insertContactBoard", list);
	}

	@Override
	public int deleteContactBoard(Map<String, Object> map) {
		return sqlSession.update(Namespace + ".deleteContract", map);
	}
}

