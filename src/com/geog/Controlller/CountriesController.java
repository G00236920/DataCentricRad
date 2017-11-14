package com.geog.Controlller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.geog.DAO.CountryDAO;
import com.geog.Model.Country;

@ManagedBean
public class CountriesController  {
	
	public List <Country> countries =  new ArrayList <Country>();
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CountriesController(){
		
		countries =  CountryDAO.getCountries();
		
		this.name = "TEST";
		
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}


}
