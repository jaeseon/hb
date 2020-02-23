package com.dodram_hebron.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dodram_hebron.vo.AdminVO;
import com.dodram_hebron.vo.ContactBoardVO;
import com.dodram_hebron.vo.EditorVO;
import com.dodram_hebron.vo.UpdateReportVO;

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

	@Override
	public List<UpdateReportVO> selectUpdateReport(){
		return sqlSession.selectList(Namespace + ".selectUpdateReport");
	}

	@Override
	public List<EditorVO> selectEditorBoard(String title) {
		return sqlSession.selectList(Namespace + ".selectEditorBoard", title);
	}
	
	@Override
	public int updateEditorBoard(Map<String, Object> list) {
		return sqlSession.update(Namespace + ".updateEditorBoard", list);
	}

	@Override
	public int updateCountCompanyAccessLog(Map<String, Object> list) {
		return sqlSession.update(Namespace + ".updateCountCompanyAccessLog", list);
	}

	@Override
	public int insertCompanyAccessLog(Map<String, Object> list) {
		return sqlSession.insert(Namespace + ".insertCompanyAccessLog", list);
	}

	@Override
	public int selectAccessLogCount(Map<String, Object> list) {
		return sqlSession.selectOne(Namespace + ".selectAccessLogCount",list);
	}
}

