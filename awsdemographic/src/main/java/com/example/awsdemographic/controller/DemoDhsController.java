package com.example.awsdemographic.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.awsdemographic.bean.DemoDhs;
import com.example.awsdemographic.service.DemoDhsService;

@RestController
@CrossOrigin(origins="*")
public class DemoDhsController {

	@Autowired
	DemoDhsService demoDhsService;

	// here add the data in databse
	
	@PostMapping("/demographic/add") 
	public DemoDhs addStudent(@RequestBody DemoDhs s)  {

		return this.demoDhsService.addDemoDhs(s);
	}


	// here delete the data from database
	@DeleteMapping("/demographic/delete/{id}")
	public void deleteDemoDhs(@PathVariable DemoDhs id) {
		demoDhsService.deleteDemoDhs(id);
	}

	// here update the data
//	@PutMapping("/demographic/update/{id}")
//	public DemoDhs updateDemoDhs(@RequestBody DemoDhs demo) {
//		return this.demoDhsService.updateDemoDhs(demo);
//	}

	@GetMapping("/demographic/get/{id}")
	public DemoDhs getDemoDhs(@PathVariable DemoDhs id) {
		return this.demoDhsService.getDemoDhs(id);
	}
}
