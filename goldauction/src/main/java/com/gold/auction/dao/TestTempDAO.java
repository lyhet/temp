package com.gold.auction.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gold.auction.model.TestTempVO;


@Repository
public class TestTempDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public TestTempVO getTestTemp(TestTempVO testTempVO){		
		return sqlSession.selectOne("test.getTemp", testTempVO);
	}

}
