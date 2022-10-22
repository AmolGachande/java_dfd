package com.example.awsdemographic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.awsdemographic.bean.DemoDhs;
import com.example.awsdemographic.dao.DemoDhsDao;






@Repository
public class DemoDhsServiceImpl implements DemoDhsService {
	@Autowired
	DemoDhsDao demoDhsDao;

	public DemoDhsServiceImpl() {

	}
	@Override
	public DemoDhs addDemoDhs(DemoDhs s) {
		
		demoDhsDao.save(s);
		return s;
		
	}

	@Override
	public void deleteDemoDhs(DemoDhs id) {
		demoDhsDao.delete(id);

	}

//	@Override
//	public DemoDhs updateDemoDhs(DemoDhs demo) {
//		 demoDhsDao.save(demo);
//		 return demo;
//	}
	
	@Override
	public DemoDhs getDemoDhs(DemoDhs id) {
		return id;
	}
}
