package com.geog.Controlller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.geog.DAO.CityDAO;
import com.geog.Model.City;

@ManagedBean
public class CitiesController  {
	
	public List <City> cities =  new ArrayList <City>();

	public CitiesController(){
		
		cities =  CityDAO.getCities();
		
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}


}
