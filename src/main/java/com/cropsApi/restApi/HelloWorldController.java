package com.cropsApi.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cropsApi.model.Crop;
import com.cropsApi.model.CropDetails;
import com.cropsApi.restApi.service.CropDetailsService;
import com.cropsApi.restApi.service.CropsService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	@Autowired
	private CropsService cropsService;// =new CropsService();
	
	@Autowired
	private CropDetailsService cropDetailsService;

	@GetMapping(path ="/hello")
	String getGreetings() {
		return "hello India";
	}
	
	@GetMapping(path ="/crops")
	List<Crop> getCropsList() {
		return cropsService.getAllCrops();
	}
	
	@GetMapping(path ="/crops/{cropName}")
	CropDetails getCropDetails(@PathVariable String cropName) {
		System.out.println(cropName);
		return cropDetailsService.getCropDetailsByName(cropName);
	}
	
}
