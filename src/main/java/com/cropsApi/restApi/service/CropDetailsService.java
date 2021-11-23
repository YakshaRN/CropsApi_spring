package com.cropsApi.restApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cropsApi.model.CropDetails;

@Service
public class CropDetailsService {
	
	private static List<CropDetails> cropDetailsList= new ArrayList<CropDetails>();
	static {
		cropDetailsList.add(new CropDetails("wheat","gehu","hybrid,desi","120 days, between november till march",
				"high yielding quility","preparation of land","how to sow?","when and how to water","use mannures",
				"check list before harvesting ","common diseases are ","prevention from these common disease"));
		cropDetailsList.add(new CropDetails("rice","dhan, paddy","hybrid,desi","120 days, between november till march",
				"high yielding quility","preparation of land","how to sow?","when and how to water","use mannures",
				"check list before harvesting ","common diseases are ","prevention from these common disease"));
		cropDetailsList.add(new CropDetails("maize","makka, makai, corn","hybrid,desi","120 days, between november till march",
				"high yielding quility","preparation of land","how to sow?","when and how to water","use mannures",
				"check list before harvesting ","common diseases are ","prevention from these common disease"));
	}
	
	public CropDetails getCropDetailsByName(String name) {
		for(CropDetails cropdetails :cropDetailsList) {
			if(cropdetails.getName().equals(name))
				return cropdetails;
		}
		return null;
	}
}
