package com.geog.Controlller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.geog.DAO.RegionDAO;
import com.geog.Model.Region;

@ManagedBean
public class RegionsController  {
	
	
	public List <Region> regions =  new ArrayList <Region>();
	
	public RegionsController(){
		
		regions =  RegionDAO.getRegions();
		
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

}