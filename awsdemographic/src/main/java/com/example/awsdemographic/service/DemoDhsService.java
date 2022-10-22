package com.example.awsdemographic.service;

import com.example.awsdemographic.bean.DemoDhs;

public interface DemoDhsService {
	public DemoDhs addDemoDhs(DemoDhs s);
	public void deleteDemoDhs(DemoDhs id);
	//public DemoDhs updateDemoDhs(DemoDhs demo);
	public DemoDhs getDemoDhs(DemoDhs id);
}
