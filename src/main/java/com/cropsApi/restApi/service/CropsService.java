package com.cropsApi.restApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cropsApi.model.Crop;

@Service
public class CropsService {

	private static List<Crop> crops= new ArrayList<Crop>();
	private static int idCounter=0;
	static {
		crops.add(new Crop(++idCounter,"wheat","ravi","mid november","march end","5 months"));
		crops.add(new Crop(++idCounter,"maize","ravi","start december","march end","5 months"));
		crops.add(new Crop(++idCounter,"rice","kharif","mid june","october end","5 months"));
	}
	
	public List<Crop> getAllCrops() {
		System.out.println(crops);
		return crops;
	}
}
