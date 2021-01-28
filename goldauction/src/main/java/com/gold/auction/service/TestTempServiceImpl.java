package com.gold.auction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gold.auction.dao.TestTempDAO;
import com.gold.auction.model.TestTempVO;

@Transactional
@Service
public class TestTempServiceImpl implements TestTempService {
	
	@Autowired
	TestTempDAO testTempDAO;

	@Override
	public TestTempVO getTestTemp(TestTempVO testTempVO){		
		return testTempDAO.getTestTemp(testTempVO);    
		
	}
	

}
