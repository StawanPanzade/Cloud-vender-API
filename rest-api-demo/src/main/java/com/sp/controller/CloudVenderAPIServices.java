package com.sp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.CloudVender;

@RestController
@RequestMapping("/cloudvender")
public class CloudVenderAPIServices {
	
	CloudVender cloudVender;

		//Get Mapping Created      // Using GET we Get data from API
	@GetMapping("{venderId}")
	public CloudVender getCloudVenderDetails(String venderId) {
		return cloudVender;
//				new CloudVender("C1","Vender 1","Address One","772105");
	}
	
	//Post Mapping Created
	@PostMapping    // Using Post we Create A Object In API
	public String createCloudVenderDetails(@RequestBody CloudVender cloudVender) {
		this.cloudVender = cloudVender;
		return "Cloud Vender Created Successfully";
	}
	
	//Update API
	@PutMapping    //use to update 
	public String updateCloudVenderDetails(@RequestBody CloudVender cloudVender) {
		this.cloudVender = cloudVender;
		return "Cloud Vender Updated Successfully";
	}
	
	//Delete API
	@DeleteMapping("{venderId}")
	public String deleteCloudVenderDetails(String venderId) {
		this.cloudVender = null;
		return "Cloud Vender Deleted Successfully";
	}
}
