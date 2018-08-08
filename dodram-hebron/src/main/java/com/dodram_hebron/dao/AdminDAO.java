package com.dodram_hebron.dao;

import java.util.List;

import com.dodram_hebron.vo.AdminVO;

public interface AdminDAO {
	public List<AdminVO> selectAdminAcount(String id) throws Exception;
}
