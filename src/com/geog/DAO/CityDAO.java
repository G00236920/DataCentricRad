package com.geog.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.geog.Model.City;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class CityDAO {
	
	private static Statement st 	= null;	    
	private static Connection conn 	= null;
	private static ResultSet rs 	= null;
	private static MysqlDataSource mysqlDS = new MysqlDataSource();
	
	
	public static List<City> getCities(){
		
		List<City> cities = new ArrayList <City>();
		
		
		   try {

			   mysqlDS.setURL("jdbc:mysql://localhost:3306/geography");

			   mysqlDS.setUser("root");

			   mysqlDS.setPassword("root");
			   
			   conn = mysqlDS.getConnection();


			   st = conn.createStatement();
			   
			   rs = st.executeQuery("select * from city;");
		  	
			while (rs.next()) {
				
	            City cty = new City();
	    		
	            cty.setCty_code(rs.getString("cty_code"));
	            cty.setCo_code(rs.getString("co_code"));
	            cty.setReg_code(rs.getString("reg_code"));
	            cty.setCty_name(rs.getString("cty_name"));
	            cty.setPopulation(rs.getInt("population"));
	            cty.setCoastal(rs.getBoolean("isCoastal"));
	            cty.setAreaKM(rs.getDouble("areaKM"));
	            
	            cities.add(cty);
	
			}			
		} 
		   catch (SQLException e) {
	
			e.printStackTrace();
			System.out.println("Cities Failed to Connect");
		}

		
		return cities;
		
	}
	
	public static void add(){
		
	}
	
	public static void delete(){
		
	}
	
	public static void update(){
		
	}

}